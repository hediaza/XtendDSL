package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.DataAccessLayerRef
import org.xtext.example.compras.compras.Module

import static extension org.xtext.example.compras.generator.CustomExtentions.*
import org.xtext.example.compras.compras.Functionality
import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.generator.DataAccessLayerAsset.CrudType

class DataAccessLayerAsset {
	
	// Inicializa atributos para cada acción del CRUD que contendra los scripts en C#
	// CREATE
	CharSequence createInterfaceScript 
	CharSequence createImplementationScript 
	// READ
	CharSequence viewGridInterfaceScript 
	CharSequence viewGridImplementationScript 
	CharSequence viewDropDownInterfaceScript 
	CharSequence viewDropDownImplementationScript 
	CharSequence getImplementationScript 
	CharSequence getInterfaceScript 
	// UPDATE
	CharSequence editInterfaceScript
	CharSequence editImplementationScript 
	// DELETE
	CharSequence deleteInterfaceScript 
	CharSequence deleteImplementationScript 
	
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
				   	
		for (e : resource.allContents.toIterable.filter(DataAccessLayerRef)) {
    		var moduleName = (e.functionality.entity.eContainer as Module).name

        	fsa.generateFile("Repository/" + moduleName + "/" + e.functionality.entity.repositoryName + ".cs", compile(e.functionality, moduleName))
    	}
	}
	
	def compile(Functionality functionality, String moduleName) {
		// Inicializaciones de proposito general
		var entity = functionality.entity
		var actionType = functionality.functionalityActionType
		
		// Limpia variables contenedonedoras de los scripts
		cleanCRUDScripts()
		
		// Valida si cada accion esta configurada en la funcionalidad
		// CREATE
		val isCreateAction = actionType.filter[it.name == "CREATE"].size		
		if (isCreateAction >= 1) {
			createInterfaceScript = compileCreate(entity, CrudType.INTERFACE)
			createImplementationScript = compileCreate(entity, CrudType.IMPLEMENTATION)	
		}
		
		// READ
		val isViewGridAction = actionType.filter[it.name == "VIEW_GRID"].size		
		if (isViewGridAction >= 1) {
			viewGridInterfaceScript = compileViewGrid(entity, CrudType.INTERFACE)
			viewGridImplementationScript = compileViewGrid(entity, CrudType.IMPLEMENTATION)	
		}
		
		val isViewDropDownAction = actionType.filter[it.name == "VIEW_DROPDOWN"].size		
		if (isViewDropDownAction >= 1) {
			viewDropDownInterfaceScript = compileViewDropDown(entity, CrudType.INTERFACE)
			viewDropDownImplementationScript = compileViewDropDown(entity, CrudType.IMPLEMENTATION)	
		}
		
		// UPDATE
		val isEditAction = actionType.filter[it.name == "EDIT"].size		
		if (isEditAction >= 1) {
			getInterfaceScript = compileGet(entity, CrudType.INTERFACE)
			getImplementationScript = compileGet(entity, CrudType.IMPLEMENTATION)
			editInterfaceScript = compileEdit(entity, CrudType.INTERFACE)
			editImplementationScript = compileEdit(entity, CrudType.IMPLEMENTATION)	
		}
		
		// DELETE
		val isDeleteAction = actionType.filter[it.name == "DELETE"].size		
		if (isDeleteAction >= 1) {
			deleteInterfaceScript = compileDelete(entity, CrudType.INTERFACE)
			deleteImplementationScript = compileDelete(entity, CrudType.IMPLEMENTATION)	
		} 
		
		return 
		'''
		using Dapper;
		using Models.«moduleName»;
		using DbConnector;
		using System.Collections.Generic;
		using System.Data;
		
		namespace Repository.«moduleName»
		{
		    public interface «entity.IRepositoryName»
		    {
				«createInterfaceScript»
				«viewGridInterfaceScript»
				«viewDropDownInterfaceScript»
				«getInterfaceScript»
				«editInterfaceScript»
				«deleteInterfaceScript»
		    }
		    
		    public class «entity.repositoryName» : BaseRepository, «entity.IRepositoryName»
		    {
				#region INIT
				public «entity.repositoryName»(IDbConnector db) {
					_db = db;
				}	
				#endregion
				
				#region CREATE
				«createImplementationScript»
				#endregion
				
				#region READ
				«viewGridImplementationScript»
				«viewDropDownImplementationScript»
				«getImplementationScript»
				#endregion
				
				#region UPDATE
				«editImplementationScript»
				#endregion
				
				#region DELETE
				«deleteImplementationScript»
				#endregion
		    }
		}
		
		'''	
	}	
	
	def compileCreate(Entity entity, CrudType crudType) {
		var CharSequence output
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				int Registrar(«entity.dtoName» «entity.dtoCamelCaseName», IDbTransaction atom);	
				'''
			
			case CrudType.IMPLEMENTATION : {
				var firstTime = true
				var sqlIntoContent = new StringBuffer
				var sqlValuesContent = new StringBuffer
				
				for (ef: entity.entityField) {
					if (ef.name != "Id") {
						// Excluye el caracter coma "," en la 1ra iteracción
						if (!firstTime) {
							sqlIntoContent.append(",")
							sqlValuesContent.append(",")
						}
						
						sqlIntoContent.append(ef.name)					
						sqlValuesContent.append("@" + ef.name)
						
						firstTime = false
					}
				}
			
				output = '''
				public int Registrar(«entity.dtoName» «entity.dtoCamelCaseName», IDbTransaction atom = null) {           
					int id = _db.GetConnection()
								.QuerySingle<int>(@"INSERT INTO dbo.«entity.name» 
								(
								«sqlIntoContent»
								) 
								OUTPUT Inserted.ID
								VALUES 
								(
								«sqlValuesContent»
								);", 
								«entity.dtoCamelCaseName», 
								atom);
					return id;
				}	
				
				'''
			}
		} 

		return output 
	}
	
	def compileViewGrid(Entity entity, CrudType crudType) {
		var CharSequence output
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				IEnumerable<«entity.dtoGridName»> ListarGrid();	
				'''
			
			case CrudType.IMPLEMENTATION : {		
				output = '''
				public IEnumerable<«entity.dtoGridName»> ListarGrid() {           
					var list = _db.GetConnection()
								.Query<«entity.dtoGridName»>(@"«entity.sqlSelectForInnerJoin»");
					return list;
				}
					
				'''
			}
		} 

		return output 
	}
	
	def sqlSelectForInnerJoin(Entity entity) {
		var CharSequence output
		
		var firstTime = true
		var sqlSelectContent = new StringBuffer
		var sqlFromContent = new StringBuffer	
		
		for (ef: entity.entityField) {
			// Excluye el caracter coma "," en la 1ra iteracción
			if (!firstTime) {
				sqlSelectContent.append(''',''')
			}
			firstTime = false
			
			// Generacion de SQL
			if (ef.entityType.entity === null) {
				sqlSelectContent.append('''«entity.camelCaseName».«ef.name»
				''') 
			} else {
				sqlSelectContent.append('''«ef.entityType.entity.camelCaseName».Nombre as «ef.name»
				''')
				sqlFromContent.append('''INNER JOIN dbo.«ef.entityType.entity.name» «ef.entityType.entity.camelCaseName» ON («entity.camelCaseName».«ef.name» = «ef.entityType.entity.camelCaseName».Id) 
				''')
			}
		}
		
		output = '''
		SELECT 
			«sqlSelectContent»
		FROM dbo.«entity.name» «entity.camelCaseName»
			«sqlFromContent»; 
		'''		
				
		return output
	}
	
	def compileViewDropDown(Entity entity, CrudType crudType) {
		var CharSequence output
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				IEnumerable<«entity.dtoName»> ListarDropDown();	
				'''
			
			case CrudType.IMPLEMENTATION : {			
				output = '''
				public IEnumerable<«entity.dtoName»> ListarDropDown() {           
					var list = _db.GetConnection()
								.Query<«entity.dtoName»>(@"SELECT Id, 
																  Nombre 
														   FROM dbo.«entity.name»;");
					return list;
				}	
				
				'''
			}
		} 

		return output 
	}
	
	def compileGet(Entity entity, CrudType crudType) {
		var CharSequence output
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				«entity.dtoName» Obtener(int id);	
				'''
			
			case CrudType.IMPLEMENTATION : {
				var firstTime = true
				var sqlSelectContent = new StringBuffer
				
				for (ef: entity.entityField) {
					// Excluye el caracter coma "," en la 1ra iteracción
					if (!firstTime) {
						sqlSelectContent.append(",")
					}
					
					sqlSelectContent.append(ef.name)										
					firstTime = false
				}
			
				output = '''
				public «entity.dtoName» Obtener(int id) {           
					var «entity.dtoCamelCaseName» = _db.GetConnection()
								.QuerySingle<int>(@"SELECT 
														«sqlSelectContent»
												    FROM dbo.«entity.name»
												    WHERE Id = @Id;", new { Id = id });
					return «entity.dtoCamelCaseName»;
				}	
				
				'''
			}
		} 

		return output 
	}
	
	def compileEdit(Entity entity, CrudType crudType) {
		var CharSequence output
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				void Editar(«entity.dtoName» «entity.dtoCamelCaseName», IDbTransaction atom);	
				'''
			
			case CrudType.IMPLEMENTATION : {
				var firstTime = true
				var sqlSetContent = new StringBuffer
				
				for (ef: entity.entityField) {
					if (ef.name != "Id") {
						// Excluye el caracter coma "," en la 1ra iteracción
						if (!firstTime) {
							sqlSetContent.append(",")
						}
						
						sqlSetContent.append(ef.name + "= @" + ef.name)					
						firstTime = false 
					}
				}
			
				output = '''
				public void Editar(«entity.dtoName» «entity.dtoCamelCaseName», IDbTransaction atom = null) {           
					int id = _db.GetConnection()
								.Execute(@"UPDATE dbo.«entity.name»
				                            SET «sqlSetContent»
				                            WHERE Id = @Id;", «entity.dtoCamelCaseName», atom);
					return id;
				}
					
				'''
				
			}
		} 

		return output 
	}
	
	def compileDelete(Entity entity, CrudType crudType) {
		var CharSequence output
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				void Eliminar(int id, IDbTransaction atom);	
				'''
			
			case CrudType.IMPLEMENTATION : {			
				output = '''
				public void Eliminar(int id, IDbTransaction atom = null) {           
					int id = _db.GetConnection()
								.Execute(@"DELETE FROM dbo.«entity.name» WHERE Id = @Id;", 
								new { Id = id }, 
								atom);
					return id;
				}	
				
				'''
			}
		} 

		return output 
	}
	
	/**
	 * Identificadores para la generación de los scrpts de cada uno de 
	 * las acciones CRUD usados requeridos 
	 */
	enum CrudType {
		IMPLEMENTATION, 
		INTERFACE
	}
	
	/**
	 * Limpia las variables que contendran los scripts por endidad
	 */
	def cleanCRUDScripts() {
		createInterfaceScript = ''''''
		createImplementationScript = ''''''
		viewGridInterfaceScript = ''''''
		viewGridImplementationScript = ''''''
		viewDropDownInterfaceScript = ''''''
		viewDropDownImplementationScript = ''''''
		getImplementationScript = ''''''
		getInterfaceScript = ''''''
		editInterfaceScript = ''''''
		editImplementationScript = ''''''
		deleteInterfaceScript = ''''''
		deleteImplementationScript = ''''''
	}
	
	
}