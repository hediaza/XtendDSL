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
		
		// Genera archivo del proyecto para la logica de negocio "BusinessLogic.csproj"
		fsa.generateFile("BusinessLogic/BusinessLogic.csproj", compileCsproj())
		
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
		using SqlServerDB;
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
				
				public «functionality.blName»(IDbConnector db)
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
				Result<IEnumerable<«entity.dtoName»>> ListarDropDown();	
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
	
	def compileCsproj() {
		return 		
		'''
		<?xml version="1.0" encoding="utf-8"?>
		<Project ToolsVersion="14.0" DefaultTargets="Build" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
		  <Import Project="$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props" Condition="Exists('$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props')" />
		  <PropertyGroup>
		    <Configuration Condition=" '$(Configuration)' == '' ">Debug</Configuration>
		    <Platform Condition=" '$(Platform)' == '' ">AnyCPU</Platform>
		    <ProjectGuid>{CC1FA08E-DAF7-4E88-9A09-8406C96B8D3D}</ProjectGuid>
		    <OutputType>Library</OutputType>
		    <AppDesignerFolder>Properties</AppDesignerFolder>
		    <RootNamespace>BusinessLogic</RootNamespace>
		    <AssemblyName>BusinessLogic</AssemblyName>
		    <TargetFrameworkVersion>v4.6</TargetFrameworkVersion>
		    <FileAlignment>512</FileAlignment>
		    <TargetFrameworkProfile />
		  </PropertyGroup>
		  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Debug|AnyCPU' ">
		    <DebugSymbols>true</DebugSymbols>
		    <DebugType>full</DebugType>
		    <Optimize>false</Optimize>
		    <OutputPath>bin\Debug\</OutputPath>
		    <DefineConstants>DEBUG;TRACE</DefineConstants>
		    <ErrorReport>prompt</ErrorReport>
		    <WarningLevel>4</WarningLevel>
		  </PropertyGroup>
		  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Release|AnyCPU' ">
		    <DebugType>pdbonly</DebugType>
		    <Optimize>true</Optimize>
		    <OutputPath>bin\Release\</OutputPath>
		    <DefineConstants>TRACE</DefineConstants>
		    <ErrorReport>prompt</ErrorReport>
		    <WarningLevel>4</WarningLevel>
		  </PropertyGroup>
		  <ItemGroup>
		    <Reference Include="Dapper, Version=1.50.5.0, Culture=neutral, processorArchitecture=MSIL">
		      <HintPath>..\packages\Dapper.1.50.5\lib\net451\Dapper.dll</HintPath>
		    </Reference>
		    <Reference Include="Dapper.Contrib, Version=1.50.0.0, Culture=neutral, processorArchitecture=MSIL">
		      <HintPath>..\packages\Dapper.Contrib.1.50.0\lib\net45\Dapper.Contrib.dll</HintPath>
		    </Reference>
		    <Reference Include="Kendo.Mvc, Version=2018.1.117.545, Culture=neutral, PublicKeyToken=121fae78165ba3d4, processorArchitecture=MSIL">
		      <SpecificVersion>False</SpecificVersion>
		      <HintPath>..\lib\KENDOUIMVC\2018.1.117.545\Kendo.Mvc.dll</HintPath>
		    </Reference>
		    <Reference Include="Microsoft.Web.Infrastructure, Version=1.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Web.Infrastructure.1.0.0.0\lib\net40\Microsoft.Web.Infrastructure.dll</HintPath>
		    </Reference>
		    <Reference Include="Newtonsoft.Json, Version=10.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed, processorArchitecture=MSIL">
		      <HintPath>..\packages\Newtonsoft.Json.10.0.3\lib\net45\Newtonsoft.Json.dll</HintPath>
		      <Private>True</Private>
		    </Reference>
		    <Reference Include="Npgsql, Version=4.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7, processorArchitecture=MSIL">
		      <HintPath>..\packages\Npgsql.4.0.3\lib\net451\Npgsql.dll</HintPath>
		    </Reference>
		    <Reference Include="System" />
		    <Reference Include="System.configuration" />
		    <Reference Include="System.Core" />
		    <Reference Include="System.Data.Linq" />
		    <Reference Include="System.Runtime.CompilerServices.Unsafe, Version=4.0.4.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a, processorArchitecture=MSIL">
		      <HintPath>..\packages\System.Runtime.CompilerServices.Unsafe.4.5.0\lib\netstandard1.0\System.Runtime.CompilerServices.Unsafe.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Threading.Tasks.Extensions, Version=4.2.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51, processorArchitecture=MSIL">
		      <HintPath>..\packages\System.Threading.Tasks.Extensions.4.5.0\lib\portable-net45+win8+wp8+wpa81\System.Threading.Tasks.Extensions.dll</HintPath>
		    </Reference>
		    <Reference Include="System.ValueTuple, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51, processorArchitecture=MSIL">
		      <HintPath>..\packages\System.ValueTuple.4.5.0\lib\netstandard1.0\System.ValueTuple.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Helpers, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.4\lib\net45\System.Web.Helpers.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Mvc, Version=5.2.3.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Mvc.5.2.3\lib\net45\System.Web.Mvc.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.Razor, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.Razor.3.2.4\lib\net45\System.Web.Razor.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.WebPages, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.4\lib\net45\System.Web.WebPages.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.WebPages.Deployment, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.4\lib\net45\System.Web.WebPages.Deployment.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Web.WebPages.Razor, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.AspNet.WebPages.3.2.4\lib\net45\System.Web.WebPages.Razor.dll</HintPath>
		    </Reference>
		    <Reference Include="System.Xml.Linq" />
		    <Reference Include="System.Data.DataSetExtensions" />
		    <Reference Include="Microsoft.CSharp" />
		    <Reference Include="System.Data" />
		    <Reference Include="System.Net.Http" />
		    <Reference Include="System.Xml" />
		  </ItemGroup>
		  
		  <!-- Inicio modificación realizada por el DSL-->
		    
		  <ItemGroup>
		    <Compile Include="**\*.cs" Exclude="obj\**;bin\**"/>
		  </ItemGroup>
			
		  <!-- Inicio modificación realizada por el DSL-->

		  <ItemGroup>
		      <ProjectReference Include="..\SqlServerDB\SqlServerDB.csproj">
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
		    <ItemGroup>
		      <None Include="app.config" />
		      <None Include="packages.config" />
		    </ItemGroup>
		    <ItemGroup />
		    <Import Project="$(MSBuildToolsPath)\Microsoft.CSharp.targets" />
		    <!-- To modify your build process, add your task inside one of the targets below and uncomment it. 
		         Other similar extension points exist, see Microsoft.Common.targets.
		    <Target Name="BeforeBuild">
		    </Target>
		    <Target Name="AfterBuild">
		    </Target>
		    -->
		  </Project>
		'''
	}
	
}