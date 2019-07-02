package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.ControllersRef
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.Functionality

import static extension org.xtext.example.compras.generator.CustomExtentions.*

class ControllerSegmentLayerAsset {
	

	// Inicializa atributos para cada acción del CRUD que contendra los scripts en C#
	// CREATE
	CharSequence createImplementationScript 
	// READ
	CharSequence viewGridImplementationScript
	CharSequence viewDropDownImplementationScript
	CharSequence getImplementationScript
	//UPDATE
	CharSequence editImplementationScript
	//DELETE
	CharSequence deleteImplementationScript
	
	/**
	* Identificadores para la generación de los scrpts de cada uno de 
	* las acciones CRUD usados requeridos 
	*/
	enum CrudType {
		IMPLEMENTATION, 
		INTERFACE
	}
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
		
		// TODO: Genera los controlladores configurados en la instancia del DSL
		for (e : resource.allContents.toIterable.filter(ControllersRef)){ 
			var moduleName = (e.functionality.eContainer as Module).name
			fsa.generateFile("Web/" + "Areas/" + moduleName + "/Controllers/" + e.functionality.controllerName + ".cs", compile(e.functionality, moduleName))
		}
				   	 
		// TODO: Genera el archivo del proyecto para la capa de presentación "Web.csproj"
		
		// TODO: Genera los archivo de configuración para el modulo que representa un "Area" en el proyecto de 
		// la capa de presentación siendo "<MODULO>AreaRegistration.cs, _ViewStart.cshtml, Web.config"
						   	
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
			createImplementationScript = compileCreate(functionality, CrudType.IMPLEMENTATION)	
		}
		
		// READ
		val isViewGridAction = actionType.filter[it.name == "VIEW_GRID"].size		
		if (isViewGridAction >= 1) {
			viewGridImplementationScript = compileViewGrid(functionality, CrudType.IMPLEMENTATION)	
		}
		
		val isViewDropDownAction = actionType.filter[it.name == "VIEW_DROPDOWN"].size		
		if (isViewDropDownAction >= 1) {
			viewDropDownImplementationScript = compileViewDropDown(functionality, CrudType.IMPLEMENTATION)
		}
		
		// UPDATE
		val isEditAction = actionType.filter[it.name == "EDIT"].size		
		if (isEditAction >= 1) {
			//getImplementationScript = compileGet(functionality, CrudType.IMPLEMENTATION)
			editImplementationScript = compileEdit(functionality, CrudType.IMPLEMENTATION)	
		}
		
		//DELETE
		val isDeleteAction = actionType.filter[it.name == "DELETE"].size		
		if (isDeleteAction >= 1) {
			deleteImplementationScript = compileDelete(functionality, CrudType.IMPLEMENTATION)	
		}
		
		return
		'''
		using BusinessLogic.«moduleName»;
		using Common.Utils;
		using Kendo.Mvc.Extensions;
		using Kendo.Mvc.UI;
		using Models.«moduleName»;
		using DbConnector;
		using System;
		using System.Collections.Generic;
		using System.Linq;
		using System.Web;
		using System.Web.Mvc;
		using Web.Controllers;
		
		
		namespace Web.Areas.«moduleName».Controllers
		{
			public class «functionality.controllerName» : BaseController
		    {
		    	#region INIT
				private «functionality.blName» _bl;        
				
				public TiendaController() {
					_db = new DapperSqlServerConnector();
					_bl = new «functionality.blName»(_db);
				}
		    	#endregion
		    	
		    	#region CREATE
				#endregion
					«createImplementationScript»
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
		        [HttpGet]
		        public ActionResult Registrar()
		        {
		            return PartialView();
		        }

		        [HttpPost]
		        public JsonResult Registrar(«entity.dtoName» «entity.dtoCamelCaseName»)
		        {
		            // Inicializaciones
		            var result = new Result<int>();

		            // Validaciones
		            if (!ModelState.IsValid)
		            {
		                result.Success = false;
		                result.Message = "Verifique la información registrada previmente.";
		                return Json(result);
		            }

		            // Acceso a logicas de negocio
		            var registrar = _bl.Registrar(tiendaDTO);
		            if (!registrar.Success)
		            {
		                result.Message = registrar.Message;
		                result.Success = false;
		                return Json(result);
		            }

		            // Salida
		            result.Success = true;
		            result.Message = registrar.Message;
		            result.Data = registrar.Data;

		            return Json(result);
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
				Result<int> Registrar(«entity.dtoName» «entity.dtoCamelCaseName»);
				'''
			
			case CrudType.IMPLEMENTATION : {
			
				output = '''
				public ActionResult Index()
				{
					return View();
				}
				 
				 
				public JsonResult ListarGrid([DataSourceRequest]DataSourceRequest request)
				{

					var listarGrid = _bl.ListarGrid();
					if (!listarGrid.Success)
					{
						ModelState.AddModelError("Error", listarGrid.Message);
						return Json(Enumerable.Empty<object>().ToDataSourceResult(request, ModelState));
					}
				
					//Salida Success 
					var ds = new DataSourceResult()
					{
						Data = listarGrid.Data,
						Total = listarGrid.Data.Count()
					};
					return Json(ds);
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
				public JsonResult ListarDropDown([DataSourceRequest]DataSourceRequest request)
				{
					var listarDropDown = _bl.ListarDropDown();
					if (!listarDropDown.Success)
					{
					    ModelState.AddModelError("Error", listarDropDown.Message);
					    return Json(Enumerable.Empty<object>().ToDataSourceResult(request, ModelState));
					}
					
					//Salida Success 
					var ds = new DataSourceResult()
					{
					    Data = listarDropDown.Data,
					    Total = listarDropDown.Data.Count()
					};
					return Json(ds);
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
		        [HttpGet]
		        public ActionResult Editar(int id)
		        {
		            var obtener = _bl.Obtener(id);
		            if (!obtener.Success) {
		                ModelState.AddModelError("Error", obtener.Message);
		                return PartialView();
		            }

		            return PartialView(obtener.Data);
		        }

		        [HttpPost]
		        public JsonResult Editar(«entity.dtoName» «entity.dtoCamelCaseName»)
		        {
		            // Inicializaciones
		            var result = new Result();

		            // Validaciones
		            if (!ModelState.IsValid)
		            {
		                result.Success = false;
		                result.Message = "Verifique la información registrada previmente.";
		                return Json(result);
		            }

		            // Acceso a logicas de negocio
		            var editar = _bl.Editar(«entity.dtoCamelCaseName»);
		            if (!editar.Success)
		            {
		                result.Success = false;
		                result.Message = editar.Message;                
		                return Json(result);
		            }

		            // Salida
		            result.Success = true;
		            result.Message = editar.Message;

		            return Json(result);
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
		        [HttpPost]
		        public JsonResult Eliminar(int id)
		        {
		            // Inicializaciones
		            var result = new Result();

		            // Validaciones
		            if (!ModelState.IsValid)
		            {
		                result.Success = false;
		                result.Message = "Verifique la información registrada previmente.";
		                return Json(result);
		            }

		            // Acceso a logicas de negocio
		            var eliminar = _bl.Eliminar(id);
		            if (!eliminar.Success)
		            {
		                result.Success = false;
		                result.Message = eliminar.Message;
		                return Json(result);
		            }

		            // Salida
		            result.Success = true;
		            result.Message = eliminar.Message;

		            return Json(result);
		        }
				'''
			}
		} 
		return output 
	}
	
	
	/**
	* Limpia las variables que contendran los scripts por endidad
	*/
	def cleanCRUDScripts() {
		//createInterfaceScript = ''''''
		createImplementationScript = ''''''
		//viewGridInterfaceScript = ''''''
		viewGridImplementationScript = ''''''
		//viewDropDownInterfaceScript = ''''''
		viewDropDownImplementationScript = ''''''
		/**getImplementationScript = ''''''
		getInterfaceScript = ''''''
		editInterfaceScript = ''''''
		editImplementationScript = ''''''
		deleteInterfaceScript = ''''''
		deleteImplementationScript = ''''''*/
	}
}