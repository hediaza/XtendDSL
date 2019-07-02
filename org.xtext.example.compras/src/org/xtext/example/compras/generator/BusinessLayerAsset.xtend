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
	//READ
	CharSequence viewGridImplementationScript
	CharSequence viewDropDownInterfaceScript
	CharSequence getImplementationScript
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
		for (e : resource.allContents.toIterable.filter(BusinessLayerRef)){ 
			var moduleName = (e.functionality.eContainer as Module).name
			fsa.generateFile("BusinessLogic/" + moduleName + "/" + e.functionality.blName + ".cs", compile(e.functionality, moduleName))
		}
	}
	
	def compile (Functionality functionality, String moduleName){
		
		// Inicializaciones de proposito general
		//var entity = functionality.entity
		var actionType = functionality.functionalityActionType
	
		// Valida si cada accion esta configurada en la funcionalidad
		// CREATE
		val isCreateAction = actionType.filter[it.name == "CREATE"].size		
		if (isCreateAction >= 1) {
		//	createInterfaceScript = compileCreate(entity, CrudType.INTERFACE)
			createImplementationScript = compileCreate(functionality, CrudType.IMPLEMENTATION)	
		}
		
		// READ
		val isViewGridAction = actionType.filter[it.name == "VIEW_GRID"].size		
		if (isViewGridAction >= 1) {
			viewGridImplementationScript = compileViewGrid(functionality, CrudType.IMPLEMENTATION)	
		}
		
		val isViewDropDownAction = actionType.filter[it.name == "VIEW_DROPDOWN"].size		
		if (isViewDropDownAction >= 1) {
			viewDropDownInterfaceScript = compileViewDropDown(functionality, CrudType.INTERFACE)
			getImplementationScript = compileGet(functionality, CrudType.IMPLEMENTATION)
			//viewDropDownImplementationScript = compileViewDropDown(entity, CrudType.IMPLEMENTATION)	
		}
		
		
		
		
		return
		'''
		using Common.Utils;
		using Models.TIENDAS;
		using Repository.TIENDAS;
		using DbConnector;
		using System;
		using System.Collections.Generic;
		
		namespace BusinessLogic.«moduleName»
		{
			public class «functionality.blName» : BaseBL
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
					«viewDropDownInterfaceScript»
					«getImplementationScript»
				#endregion
				
				#region DELETE
				
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
				int Registrar(«entity.dtoName» «entity.dtoCamelCaseName», IDbTransaction atom);	
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
				IEnumerable<«entity.dtoGridName»> ListarGrid();	
				'''
			
			case CrudType.IMPLEMENTATION : {		
				output = '''
				public Result<IEnumerable<<«entity.dtoGridName»>> ListarGrid()
				{
				    // Inicializaciones
				    var result = new Result<IEnumerable<<«entity.dtoGridName»>>();
				
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
				«entity.dtoName» Obtener(int id);	
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
	
	/**
	* Identificadores para la generación de los scrpts de cada uno de 
	* las acciones CRUD usados requeridos 
	*/
	enum CrudType {
		IMPLEMENTATION, 
		INTERFACE
	}
}