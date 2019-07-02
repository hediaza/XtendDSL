package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.BusinessLayerRef
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.Functionality

import static extension org.xtext.example.compras.generator.CustomExtentions.*

class BusinessLayerAsset {
	
	// Inicializa atributos para cada acción del CRUD que contendra los scripts en C#
	// CREATE
	CharSequence createImplementationScript 
	CharSequence createInterfaceScript
	//READ 
	CharSequence viewGridInterfaceScript
	CharSequence getInterfaceScript
	CharSequence viewDropDownInterfaceScript
	CharSequence viewGridImplementationScript
	CharSequence getImplementationScript
	CharSequence viewDropDownImplementationScript
	//UPDATE
	CharSequence editInterfaceScript
	CharSequence editImplementationScript
	//DELETE
	CharSequence deleteInterfaceScript
	CharSequence deleteImplementationScript
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {

		// Genera los archivos de logica configurados
		for (e : resource.allContents.toIterable.filter(BusinessLayerRef)){ 
			var moduleName = (e.functionality.eContainer as Module).name
			fsa.generateFile("BusinessLogic/" + moduleName + "/" + e.functionality.blName + ".cs", compile(e.functionality, moduleName))
		}
		
		//TODO: Genera archivo del proyecto para la logica de negocio "BusinessLogic.csproj"
		
	}
	
	def compile (Functionality functionality, String moduleName){
		
		// Inicializaciones de proposito general
		//var entity = functionality.entity
		var actionType = functionality.functionalityActionType
		
		// Limpia variables contenedonedoras de los scripts
		cleanCRUDScripts()
	
		// Valida si cada accion esta configurada en la funcionalidad
		// CREATE
		val isCreateAction = actionType.filter[it.name == "CREATE"].size		
		if (isCreateAction >= 1) {
			createInterfaceScript = compileCreate(functionality, CrudType.INTERFACE)
			createImplementationScript = compileCreate(functionality, CrudType.IMPLEMENTATION)	
		}
		
		// READ
		val isViewGridAction = actionType.filter[it.name == "VIEW_GRID"].size		
		if (isViewGridAction >= 1) {
			viewGridInterfaceScript = compileViewGrid(functionality, CrudType.INTERFACE)
			viewGridImplementationScript = compileViewGrid(functionality, CrudType.IMPLEMENTATION)	
		}
		
		val isViewDropDownAction = actionType.filter[it.name == "VIEW_DROPDOWN"].size		
		if (isViewDropDownAction >= 1) {
			viewDropDownInterfaceScript = compileViewDropDown(functionality, CrudType.INTERFACE)
			viewDropDownImplementationScript = compileViewDropDown(functionality, CrudType.IMPLEMENTATION)
		}
		
		// UPDATE
		val isEditAction = actionType.filter[it.name == "EDIT"].size		
		if (isEditAction >= 1) {
			getInterfaceScript = compileGet(functionality, CrudType.INTERFACE)
			getImplementationScript = compileGet(functionality, CrudType.IMPLEMENTATION)
			editInterfaceScript = compileEdit(functionality, CrudType.INTERFACE)
			editImplementationScript = compileEdit(functionality, CrudType.IMPLEMENTATION)	
		}
		
		// DELETE
		val isDeleteAction = actionType.filter[it.name == "DELETE"].size		
		if (isDeleteAction >= 1) {
			deleteInterfaceScript = compileDelete(functionality, CrudType.INTERFACE)
			deleteImplementationScript = compileDelete(functionality, CrudType.IMPLEMENTATION)	
		} 
		
		return
		'''
		using Common.Utils;
		using Models.«moduleName»;
		using Repository.«moduleName»;
		using DbConnector;
		using System;
		using System.Collections.Generic;
		
		namespace BusinessLogic.«moduleName»
		{
			public interface «functionality.entity.iBlName»
			{
				«createInterfaceScript»
				«viewGridInterfaceScript»
				«viewDropDownInterfaceScript»
				«getInterfaceScript»
				«editInterfaceScript»
				«deleteInterfaceScript»
			}
			
			public class «functionality.blName» : BaseBL, «functionality.entity.iBlName»
			{
				#region INIT
				private «functionality.entity.repositoryName» _repository;
				
				public «functionality.blName»(IDbConnector db) {
				{
					_db = db;
					_repository = new «functionality.entity.repositoryName»(_db);
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
	
	def compileCreate(Functionality functionality, CrudType crudType) {
		var CharSequence output
		var entity = functionality.entity
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				Result<int> Registrar(«entity.dtoName» «entity.dtoCamelCaseName»);
				'''
			
			case CrudType.IMPLEMENTATION : {
			
				output = '''
				public Result<int> Registrar(«entity.dtoName» «entity.dtoCamelCaseName»)
				{            
					// Inicializaciones
					var result = new Result<int>();
				
					// Acceso al repositorio
					try
					{                
						result.Data = _repository.Registrar(«entity.dtoCamelCaseName»);
					}
					catch (Exception e)
					{
						result.Exception = e;
						result.Message = e.Message;
						return result;
					}
					
					// Salida satisfcatoria
					result.Success = true;
					result.Message = "Transacción realizada satisfactoriamente.";
					return result;
				}	
				'''
			}
		} 

		return output 
	}
	
	def compileViewGrid(Functionality functionality, CrudType crudType) {
		var CharSequence output
		var entity = functionality.entity
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				Result<IEnumerable<«entity.dtoGridName»>> ListarGrid();
				'''
			
			case CrudType.IMPLEMENTATION : {		
				output = '''
				public Result<IEnumerable<«entity.dtoGridName»>> ListarGrid()
				{
				    // Inicializaciones
				    var result = new Result<IEnumerable<«entity.dtoGridName»>>();
				
				    // Acceso al repositorio
				    try
				    {
				        result.Data = _repository.ListarGrid();
				    }
				    catch (Exception e)
				    {
				        result.Exception = e;
				        result.Message = e.Message;
				        return result;
				    }
				
				    // Salida satisfcatoria
				    result.Success = true;
				    result.Message = "Transacción realizada satisfactoriamente.";
				    return result;
				}
					
				'''
			}
		} 

		return output 
	}
	
	def compileViewDropDown(Functionality functionality, CrudType crudType) {
		var CharSequence output
		var entity = functionality.entity
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				IEnumerable<«entity.dtoName»> ListarDropDown();	
				'''
			
			case CrudType.IMPLEMENTATION : {			
				output = '''
				public Result<IEnumerable<«entity.dtoName»>> ListarDropDown()
				        {
				            // Inicializaciones
				            var result = new Result<IEnumerable<«entity.dtoName»>>();
				
				            // Acceso al repositorio
				            try
				            {
				                result.Data = _repository.ListarDropDown();
				            }
				            catch (Exception e)
				            {
				                result.Exception = e;
				                result.Message = e.Message;
				                return result;
				            }
				
				            // Salida satisfcatoria
				            result.Success = true;
				            result.Message = "Transacción realizada satisfactoriamente.";
				            return result;
				        }	
				
				'''
			}
		} 

		return output 
	}
	
	def compileGet(Functionality functionality, CrudType crudType) {
		var CharSequence output
		var entity = functionality.entity
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				Result<«entity.dtoName»> Obtener(int id);
				'''
			
			case CrudType.IMPLEMENTATION : {
			
				output = '''
				public Result<«entity.dtoName»> Obtener(int id)
				        {
				            // Inicializaciones
				            var result = new Result<«entity.dtoName»>();
				
				            // Acceso al repositorio
				            try
				            {
				                result.Data = _repository.Obtener(id);
				            }
				            catch (Exception e)
				            {
				                result.Exception = e;
				                result.Message = e.Message;
				                return result;
				            }
				
				            // Salida satisfcatoria
				            result.Success = true;
				            result.Message = "Trasacción realizada satisfactoriamente";
				            return result;
				        }	
				'''
			}
		} 

		return output 
	}
	
	def compileEdit(Functionality functionality, CrudType crudType) {
		var CharSequence output
		var entity = functionality.entity

		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				Result Editar(«entity.dtoName» «entity.dtoCamelCaseName»);
				'''
			
			case CrudType.IMPLEMENTATION : {

				output = '''
				public Result Editar(«entity.dtoName» «entity.dtoCamelCaseName»)
				        {
				            // Inicializaciones
				            var result = new Result();
				
				            // Editar entidad
				            try
				            {
				                _repository.Editar(«entity.dtoCamelCaseName»);
				            }
				            catch (Exception e)
				            {
				                result.Exception = e;
				                result.Message = e.Message;
				                return result;
				            }
				
				            // Salida satisfcatoria
				            result.Success = true;
				            result.Message = "El registro se actualizó satisfactoriamente.";
				            return result;
				        }
					
				'''
				
			}
		} 

		return output 
	}
	
	def compileDelete(Functionality functionality, CrudType crudType) {
		var CharSequence output
		//var entity = functionality.entity
		
		switch crudType {
			case CrudType.INTERFACE : 
				output = '''
				Result Eliminar(int id);	
				'''
			
			case CrudType.IMPLEMENTATION : {			
				output = '''
				public Result Eliminar(int id)
				        {
				            // Inicializaciones
				            var result = new Result();
				
				            // Eliminar entidad
				            try
				            {
				                _repository.Eliminar(id);
				            }
				            catch (Exception e)
				            {
				                result.Exception = e;
				                result.Message = "No fue posible eliminar el registro seleccionado.";
				                return result;
				            }
				
				            // Salida satisfcatoria
				            result.Success = true;
				            result.Message = "El registro se eliminó satisfactoriamente.";
				            return result;
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