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
		
		// Genera los controlladores configurados en la instancia del DSL
		for (e : resource.allContents.toIterable.filter(ControllersRef)){ 
			var moduleName = (e.functionality.eContainer as Module).name
			fsa.generateFile("Web/" + "Areas/" + moduleName + "/Controllers/" + e.functionality.controllerName + ".cs", compile(e.functionality, moduleName))
		}
				   	 
		// Genera el archivo del proyecto para la capa de presentación "Web.csproj"
		fsa.generateFile("Web/Web.csproj", compileCsproj())
						   	
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
		using SqlServerDB;
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
				
				public «functionality.controllerName»() 
				{
					_db = new DapperSqlServerConnector();
					_bl = new «functionality.blName»(_db);
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
		            var registrar = _bl.Registrar(«entity.dtoCamelCaseName»);
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
		getImplementationScript = ''''''
		editImplementationScript = ''''''
		deleteImplementationScript = ''''''
	}
	
	def compileCsproj() {
		return
		'''
		<?xml version="1.0" encoding="utf-8"?>
		<Project ToolsVersion="15.0" DefaultTargets="Build" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
		  <Import Project="..\packages\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.1.0.7\build\net45\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.props" Condition="Exists('..\packages\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.1.0.7\build\net45\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.props')" />
		  <Import Project="..\packages\Microsoft.Net.Compilers.2.1.0\build\Microsoft.Net.Compilers.props" Condition="Exists('..\packages\Microsoft.Net.Compilers.2.1.0\build\Microsoft.Net.Compilers.props')" />
		  <Import Project="$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props" Condition="Exists('$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props')" />
		  <PropertyGroup>
		    <Configuration Condition=" '$(Configuration)' == '' ">Debug</Configuration>
		    <Platform Condition=" '$(Platform)' == '' ">AnyCPU</Platform>
		    <ProductVersion>
		    </ProductVersion>
		    <SchemaVersion>2.0</SchemaVersion>
		    <ProjectGuid>{5F143D69-3876-45C6-86F7-867BA34DC848}</ProjectGuid>
		    <ProjectTypeGuids>{349c5851-65df-11da-9384-00065b846f21};{fae04ec0-301f-11d3-bf4b-00c04f79efbc}</ProjectTypeGuids>
		    <OutputType>Library</OutputType>
		    <AppDesignerFolder>Properties</AppDesignerFolder>
		    <RootNamespace>Web</RootNamespace>
		    <AssemblyName>Web</AssemblyName>
		    <TargetFrameworkVersion>v4.6</TargetFrameworkVersion>
		    <MvcBuildViews>false</MvcBuildViews>
		    <UseIISExpress>true</UseIISExpress>
		    <Use64BitIISExpress />
		    <IISExpressSSLPort>
		    </IISExpressSSLPort>
		    <IISExpressAnonymousAuthentication />
		    <IISExpressWindowsAuthentication />
		    <IISExpressUseClassicPipelineMode />
		    <UseGlobalApplicationHostFile />
		    <NuGetPackageImportStamp>
		    </NuGetPackageImportStamp>
		    <TargetFrameworkProfile />
		    <WebGreaseLibPath>..\packages\WebGrease.1.5.2\lib</WebGreaseLibPath>
		  </PropertyGroup>
		  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Debug|AnyCPU' ">
		    <DebugSymbols>true</DebugSymbols>
		    <DebugType>full</DebugType>
		    <Optimize>false</Optimize>
		    <OutputPath>bin\</OutputPath>
		    <DefineConstants>DEBUG;TRACE</DefineConstants>
		    <ErrorReport>prompt</ErrorReport>
		    <WarningLevel>4</WarningLevel>
		  </PropertyGroup>
		  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Release|AnyCPU' ">
		    <DebugSymbols>true</DebugSymbols>
		    <DebugType>pdbonly</DebugType>
		    <Optimize>true</Optimize>
		    <OutputPath>bin\</OutputPath>
		    <DefineConstants>TRACE</DefineConstants>
		    <ErrorReport>prompt</ErrorReport>
		    <WarningLevel>4</WarningLevel>
		  </PropertyGroup>
		  <ItemGroup>
		    <Reference Include="Antlr3.Runtime, Version=3.4.1.9004, Culture=neutral, PublicKeyToken=eb42632606e9261f, processorArchitecture=MSIL">
		      <HintPath>..\packages\Antlr.3.4.1.9004\lib\Antlr3.Runtime.dll</HintPath>
		    </Reference>
		    <Reference Include="Dapper, Version=1.50.5.0, Culture=neutral, processorArchitecture=MSIL">
		      <HintPath>..\packages\Dapper.1.50.5\lib\net451\Dapper.dll</HintPath>
		    </Reference>
		    <Reference Include="EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089, processorArchitecture=MSIL">
		      <HintPath>..\packages\EntityFramework.6.1.3\lib\net45\EntityFramework.dll</HintPath>
		    </Reference>
		    <Reference Include="EntityFramework.SqlServer, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089, processorArchitecture=MSIL">
		      <HintPath>..\packages\EntityFramework.6.1.3\lib\net45\EntityFramework.SqlServer.dll</HintPath>
		    </Reference>
		    <Reference Include="Kendo.Mvc, Version=2018.1.117.545, Culture=neutral, PublicKeyToken=121fae78165ba3d4, processorArchitecture=MSIL">
		      <SpecificVersion>False</SpecificVersion>
		      <HintPath>..\lib\KENDOUIMVC\2018.1.117.545\Kendo.Mvc.dll</HintPath>
		      <Private>True</Private>
		    </Reference>
		    <Reference Include="Microsoft.AspNet.Identity.Core, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Identity.Core.2.1.0\lib\net45\Microsoft.AspNet.Identity.Core.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.AspNet.Identity.EntityFramework, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Identity.EntityFramework.2.1.0\lib\net45\Microsoft.AspNet.Identity.EntityFramework.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.AspNet.Identity.Owin, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Identity.Owin.2.1.0\lib\net45\Microsoft.AspNet.Identity.Owin.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.AspNet.SignalR.Core, Version=2.2.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.SignalR.Core.2.2.2\lib\net45\Microsoft.AspNet.SignalR.Core.dll</HintPath>
		      <Private>True</Private>
		    </Reference>
		    <Reference Include="Microsoft.AspNet.SignalR.SystemWeb, Version=2.2.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.SignalR.SystemWeb.2.2.2\lib\net45\Microsoft.AspNet.SignalR.SystemWeb.dll</HintPath>
		      <Private>True</Private>
		    </Reference>
		    <Reference Include="Microsoft.CodeDom.Providers.DotNetCompilerPlatform, Version=1.0.7.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.1.0.7\lib\net45\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.CSharp" />
		    <Reference Include="Microsoft.Owin, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.3.0.0\lib\net45\Microsoft.Owin.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Host.SystemWeb, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Host.SystemWeb.2.1.0\lib\net45\Microsoft.Owin.Host.SystemWeb.dll</HintPath>
		      <Private>True</Private>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Security, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Security.3.0.0\lib\net45\Microsoft.Owin.Security.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Security.Cookies, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Security.Cookies.2.1.0\lib\net45\Microsoft.Owin.Security.Cookies.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Security.Facebook, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Security.Facebook.2.0.0\lib\net45\Microsoft.Owin.Security.Facebook.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Security.Google, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Security.Google.2.0.0\lib\net45\Microsoft.Owin.Security.Google.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Security.MicrosoftAccount, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Security.MicrosoftAccount.2.0.0\lib\net45\Microsoft.Owin.Security.MicrosoftAccount.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Security.OAuth, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Security.OAuth.2.1.0\lib\net45\Microsoft.Owin.Security.OAuth.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Owin.Security.Twitter, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Owin.Security.Twitter.2.0.0\lib\net45\Microsoft.Owin.Security.Twitter.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Web.Infrastructure, Version=1.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Web.Infrastructure.1.0.0.0\lib\net40\Microsoft.Web.Infrastructure.dll</HintPath>
		    </Reference>
		    <Reference Include="Newtonsoft.Json, Version=10.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed, processorArchitecture=MSIL">
		      <HintPath>..\packages\Newtonsoft.Json.10.0.3\lib\net45\Newtonsoft.Json.dll</HintPath>
		    </Reference>
		    <Reference Include="Npgsql, Version=4.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7, processorArchitecture=MSIL">
		      <HintPath>..\packages\Npgsql.4.0.3\lib\net451\Npgsql.dll</HintPath>
		    </Reference>
		    <Reference Include="Owin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=f0ebd12fd5e55cc5, processorArchitecture=MSIL">
		      <HintPath>..\packages\Owin.1.0\lib\net40\Owin.dll</HintPath>
		    </Reference>
		    <Reference Include="System" />
		    <Reference Include="System.Data" />
		    <Reference Include="System.Data.DataSetExtensions" />
		    <Reference Include="System.Drawing" />
		    <Reference Include="System.Net.Http.Formatting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebApi.Client.4.0.30506.0\lib\net40\System.Net.Http.Formatting.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Runtime.CompilerServices.Unsafe, Version=4.0.4.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a, processorArchitecture=MSIL">
		      <HintPath>..\packages\System.Runtime.CompilerServices.Unsafe.4.5.0\lib\netstandard1.0\System.Runtime.CompilerServices.Unsafe.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Threading.Tasks.Extensions, Version=4.2.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51, processorArchitecture=MSIL">
		      <HintPath>..\packages\System.Threading.Tasks.Extensions.4.5.0\lib\portable-net45+win8+wp8+wpa81\System.Threading.Tasks.Extensions.dll</HintPath>
		    </Reference>
		    <Reference Include="System.ValueTuple, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51, processorArchitecture=MSIL">
		      <HintPath>..\packages\System.ValueTuple.4.5.0\lib\netstandard1.0\System.ValueTuple.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.DynamicData" />
		    <Reference Include="System.Web.Entity" />
		    <Reference Include="System.Web.ApplicationServices" />
		    <Reference Include="System.ComponentModel.DataAnnotations" />
		    <Reference Include="System.Web.Extensions" />
		    <Reference Include="System.Web" />
		    <Reference Include="System.Web.Abstractions" />
		    <Reference Include="System.Web.Helpers, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.3\lib\net45\System.Web.Helpers.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Http, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebApi.Core.4.0.30506.0\lib\net40\System.Web.Http.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Http.WebHost, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebApi.WebHost.4.0.30506.0\lib\net40\System.Web.Http.WebHost.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Mvc, Version=5.2.3.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Mvc.5.2.3\lib\net45\System.Web.Mvc.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Optimization, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Web.Optimization.1.1.3\lib\net40\System.Web.Optimization.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Razor, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Razor.3.2.3\lib\net45\System.Web.Razor.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Routing" />
		    <Reference Include="System.Web.WebPages, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.3\lib\net45\System.Web.WebPages.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.WebPages.Deployment, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.3\lib\net45\System.Web.WebPages.Deployment.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.WebPages.Razor, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.3\lib\net45\System.Web.WebPages.Razor.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Xml" />
		    <Reference Include="System.Configuration" />
		    <Reference Include="System.Web.Services" />
		    <Reference Include="System.EnterpriseServices" />
		    <Reference Include="System.Net.Http">
		    </Reference>
		    <Reference Include="System.Net.Http.WebRequest">
		    </Reference>
		    <Reference Include="System.Xml.Linq" />
		    <Reference Include="WebGrease, Version=1.5.2.14234, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\WebGrease.1.5.2\lib\WebGrease.dll</HintPath>
		    </Reference>
		  </ItemGroup>
		  
		  <!-- Inicio modificación realizada por el DSL-->
		  
		  <ItemGroup>
		    <Compile Include="**\*.cs" Exclude="obj\**;bin\**"/>
		  </ItemGroup>
		  
		  <ItemGroup>
		    <Content Include="**\*.js" Exclude="obj\**;bin\**">
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.png" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.gif" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.css" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.config" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.cshtml" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.map" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.svg" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.txt" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.eot" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.ttf" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.woff" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.woff2" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.otf" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.less" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
			<Content Include="**\*.scss" Exclude="obj\**;bin\**"> 
				<CopyToOutputDirectory>Always</CopyToOutputDirectory>
			</Content>
		  </ItemGroup>
		  
		  <ItemGroup>   
		  </ItemGroup>
		  
		  <!-- Fin de modificación realizada por el DSL-->
		  
		  <ItemGroup>
		    <ProjectReference Include="..\BusinessLogic\BusinessLogic.csproj">
		      <Project>{cc1fa08e-daf7-4e88-9a09-8406c96b8d3d}</Project>
		      <Name>BusinessLogic</Name>
		    </ProjectReference>
		    <ProjectReference Include="..\DbConector\DbConector.csproj">
		      <Project>{84495211-7827-445b-8fec-dd2581c075e2}</Project>
		      <Name>DbConector</Name>
		    </ProjectReference>
		    <ProjectReference Include="..\Models\Models.csproj">
		      <Project>{be4f2820-065e-4613-a170-97d723e7db26}</Project>
		      <Name>Models</Name>
		    </ProjectReference>
		    <ProjectReference Include="..\Repository\Repository.csproj">
		      <Project>{2bbeb9c6-d2cd-47a7-b00b-4d258959b9af}</Project>
		      <Name>Repository</Name>
		    </ProjectReference>
		    <ProjectReference Include="..\Utils\Utils.csproj">
		      <Project>{f22c6b9e-912e-4123-9cc5-80818f723eed}</Project>
		      <Name>Utils</Name>
		    </ProjectReference>
		  </ItemGroup>
		  <PropertyGroup>
		    <VisualStudioVersion Condition="'$(VisualStudioVersion)' == ''">10.0</VisualStudioVersion>
		    <VSToolsPath Condition="'$(VSToolsPath)' == ''">$(MSBuildExtensionsPath32)\Microsoft\VisualStudio\v$(VisualStudioVersion)</VSToolsPath>
		  </PropertyGroup>
		  <Import Project="$(MSBuildBinPath)\Microsoft.CSharp.targets" />
		  <Import Project="$(VSToolsPath)\WebApplications\Microsoft.WebApplication.targets" Condition="'$(VSToolsPath)' != ''" />
		  <Import Project="$(MSBuildExtensionsPath32)\Microsoft\VisualStudio\v10.0\WebApplications\Microsoft.WebApplication.targets" Condition="false" />
		  <Target Name="MvcBuildViews" AfterTargets="AfterBuild" Condition="'$(MvcBuildViews)'=='true'">
		    <AspNetCompiler VirtualPath="temp" PhysicalPath="$(WebProjectOutputDir)" />
		  </Target>
		  <ProjectExtensions>
		    <VisualStudio>
		      <FlavorProperties GUID="{349c5851-65df-11da-9384-00065b846f21}">
		        <WebProjectProperties>
		          <SaveServerSettingsInUserFile>True</SaveServerSettingsInUserFile>
		        </WebProjectProperties>
		      </FlavorProperties>
		      <UserProperties UseCdnSupport="False" />
		    </VisualStudio>
		  </ProjectExtensions>
		  <Target Name="EnsureNuGetPackageBuildImports" BeforeTargets="PrepareForBuild">
		    <PropertyGroup>
		      <ErrorText>This project references NuGet package(s) that are missing on this computer. Use NuGet Package Restore to download them.  For more information, see http://go.microsoft.com/fwlink/?LinkID=322105. The missing file is {0}.</ErrorText>
		    </PropertyGroup>
		    <Error Condition="!Exists('..\packages\Microsoft.Net.Compilers.2.1.0\build\Microsoft.Net.Compilers.props')" Text="$([System.String]::Format('$(ErrorText)', '..\packages\Microsoft.Net.Compilers.2.1.0\build\Microsoft.Net.Compilers.props'))" />
		    <Error Condition="!Exists('..\packages\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.1.0.7\build\net45\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.props')" Text="$([System.String]::Format('$(ErrorText)', '..\packages\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.1.0.7\build\net45\Microsoft.CodeDom.Providers.DotNetCompilerPlatform.props'))" />
		  </Target>
		  <!-- To modify your build process, add your task inside one of the targets below and uncomment it.
		       Other similar extension points exist, see Microsoft.Common.targets.
		  <Target Name="BeforeBuild">
		  </Target>
		  <Target Name="AfterBuild">
		  </Target> -->
		</Project>
		'''
	}
}