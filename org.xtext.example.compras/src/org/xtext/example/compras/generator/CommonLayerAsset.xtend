package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.CommonLayerRef
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.EntityField

import static extension org.xtext.example.compras.generator.CustomExtentions.*

class CommonLayerAsset {
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
		// Genera los archivos de los modelos configurados en la instancia del DSL	 	   	
		for (e : resource.allContents.toIterable.filter(CommonLayerRef)) {
    		var moduleName = (e.entity.eContainer as Module).name

        	fsa.generateFile("Models/" + moduleName + "/" + e.entity.dtoName + ".cs", compile(e.entity, moduleName))
    	}
    	
    	// Genera archivo del proyecto para la capa de acceso en comun "Models.csproj"
    	fsa.generateFile("Models/Models.csproj", compileCsproj())
	}	
	
	def compile(Entity e, String moduleName)  {
		
		return
		'''
		using System.ComponentModel.DataAnnotations;
		
		namespace Models.«moduleName»
		{
		    public class «e.dtoName»
		    {
		       «FOR ef : e.entityField»  
                   «ef.compile»
               «ENDFOR»
			}
			
			public class «e.dtoGridName»
		    {
		       «FOR ef : e.entityField»  
                   «ef.compileForGrid»
               «ENDFOR»
			}
		}
		
		'''
	}
	
	def compile(EntityField ef) {
		var type = if (ef.entityType.entity === null) ef.entityType.commonFieldType.toString 
				   else "int"
		
		var required = if (ef.entityFieldRequired === null) "" else "[Required]" 		
		
		var label = if (ef.entityFieldLabel === null) "" else '''[Display(Name ="«ef.entityFieldLabel.name»")]'''
		
		return
		'''
		«required»
		«label»
		public «type» «ef.name» { get; set; }
		
		''' 
	}
	
	def compileForGrid(EntityField ef) {
		var type = if (ef.entityType.entity === null) ef.entityType.commonFieldType.toString 
				   else "string"
				
		var label = if (ef.entityFieldLabel === null) "" else '''[Display(Name ="«ef.entityFieldLabel.name»")]'''
		
		return
		'''
		«label»
		public «type» «ef.name» { get; set; }
		
		''' 
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
		    <ProjectGuid>{BE4F2820-065E-4613-A170-97D723E7DB26}</ProjectGuid>
		    <OutputType>Library</OutputType>
		    <AppDesignerFolder>Properties</AppDesignerFolder>
		    <RootNamespace>Models</RootNamespace>
		    <AssemblyName>Models</AssemblyName>
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
		    <Reference Include="Microsoft.Web.Infrastructure, Version=1.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35, processorArchitecture=MSIL">
		      <HintPath>..\packages\Microsoft.Web.Infrastructure.1.0.0.0\lib\net40\Microsoft.Web.Infrastructure.dll</HintPath>
		    </Reference>
		    <Reference Include="Npgsql, Version=4.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7, processorArchitecture=MSIL">
		      <HintPath>..\packages\Npgsql.4.0.3\lib\net451\Npgsql.dll</HintPath>
		    </Reference>
		    <Reference Include="System" />
		    <Reference Include="System.ComponentModel.DataAnnotations" />
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
		    <ProjectReference Include="..\Utils\Utils.csproj">
		      <Project>{f22c6b9e-912e-4123-9cc5-80818f723eed}</Project>
		      <Name>Utils</Name>
		    </ProjectReference>
		  </ItemGroup>
		  <ItemGroup>
		    <None Include="app.config" />
		    <None Include="packages.config" />
		  </ItemGroup>
		  <ItemGroup>
		    <Folder Include="GLOBAL\" />
		  </ItemGroup>
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
