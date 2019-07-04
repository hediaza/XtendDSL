package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.Module

import static extension org.xtext.example.compras.generator.CustomExtentions.*

class GeneralAsset {
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
		
		// Genera archivo para el menu que relaciona los modulos existentes
		compileAppMenuAsset(resource, fsa)
		
		// Genera archivos de configuración para cada modulo
		compileModuleConfigAssets(resource, fsa)
	}
	
	def compileAppMenuAsset(Resource resource, IFileSystemAccess2 fsa) {
		var int isViewGridAction
		var boolean atLeastOneByModule
		var StringBuffer moduleTemplates = new StringBuffer

		for (m : resource.allContents.toIterable.filter(Module)) {
			var StringBuffer functTemplates = new StringBuffer
			atLeastOneByModule = false
			
			for (f: m.functionality) {
				// El criterio para adicionar un elemento al menu es que tenga la acción "VIEW_GRID" en la fucionalidad
				isViewGridAction = f.functionalityActionType.filter[it.name == "VIEW_GRID"].size
				if (isViewGridAction >= 1) {
					var funcTemplate = '''
					<li class="@Html.IsSelected(action: "Index", controller:"«f.entity.name»")">
					    <a href="@Url.Action("Index", "«f.entity.name»", new { area = "«m.name»"})">«f.entity.name»(s)</a>
					</li>
					'''					
					functTemplates.append(funcTemplate)
					atLeastOneByModule = true
				}
			}
			
			// Si al menos un elemento requiere ser adicionado desde el menu, entonces genera la estructura del modulo
			if (atLeastOneByModule) {
				var moduleTemplate = '''
				<li class="">
					<a href="#"><i class="fa fa-shopping-cart"></i> <span class="nav-label">Modulo de «m.pascalCaseName»(s)</span> <span class="fa arrow"></span></a>
				    <ul class="nav nav-second-level collapse ">
				        «functTemplates»
				    </ul>
				</li>
				'''
				moduleTemplates.append(moduleTemplate)
			}
		}

		val menuFile = '''
		<nav class="navbar-default navbar-static-side" role="navigation">
		    <div class="sidebar-collapse">
		        <ul class="nav metismenu" id="side-menu">
		            <li class="nav-header">
		                <div class="dropdown profile-element text-center">
		                    <span>
		                        <img alt="image" class="img-circle" src="~/Content/Images/iconfinder_Shopping_3387285.png" />
		                    </span>
		                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
		                        <li>@Html.ActionLink("Inicio", "Index", "Dashboard")</li>
		                    </ul>
		                </div>
		                <div class="logo-element">
		                    IN+
		                </div>
		            </li>
		
		            <li class="@Html.IsSelected(action: "Index", controller:"Dashboard")">
		                <a href="@Url.Action("Index", "Dashboard", new { area = "" })">Inicio</a>
		            </li>
					
					<!-- Incio contenido dimánico generado por el DSL -->
		            «moduleTemplates»
					<!-- Fin contenido dimánico generado por el DSL -->
		        </ul>
		    </div>
		</nav>
		
		'''
		
		fsa.generateFile("Web/Views/Shared/_Navigation.cshtml", menuFile)
	}
	
	def compileModuleConfigAssets(Resource resource, IFileSystemAccess2 fsa) {
		
		for (m : resource.allContents.toIterable.filter(Module)) {
			val folderPath = "Web/Areas/" + m.name
			
			// Generación de archivo "_ViewStart.cshtml" quien relaciona el Layout de cada modulo
			val viewStartFile = '''
			@{ 
				Layout = "~/Views/Shared/_Layout.cshtml"; 
			}
			'''			
			fsa.generateFile(folderPath + "/Views/_ViewStart.cshtml", viewStartFile)
			
			// Generación de archivo "<MODULO>AreaRegistration.cs" quien relaciona el enrutamiento de cada modulo
			val moduleAreaRegistrationFile = '''
			using System.Web.Mvc;
			
			namespace Web.Areas.«m.name»
			{
			    public class «m.name»AreaRegistration : AreaRegistration 
			    {
			        public override string AreaName 
			        {
			            get 
			            {
			                return "«m.name»";
			            }
			        }
			
			        public override void RegisterArea(AreaRegistrationContext context) 
			        {
			            context.MapRoute(
			                "«m.name»_default",
			                "«m.name»/{controller}/{action}/{id}",
			                new { action = "Index", id = UrlParameter.Optional }
			            );
			        }
			    }
			}
			'''
			fsa.generateFile(folderPath + "/" + m.name + "AreaRegistration.cs", moduleAreaRegistrationFile)
			
			// Generación del archivo Web.config para el modulo quien contienen la configuración del area en la aplicación
			val webConfigFile = '''
			<?xml version="1.0"?>
			
			<configuration>
			  <configSections>
			    <sectionGroup name="system.web.webPages.razor" type="System.Web.WebPages.Razor.Configuration.RazorWebSectionGroup, System.Web.WebPages.Razor, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31BF3856AD364E35">
			      <section name="host" type="System.Web.WebPages.Razor.Configuration.HostSection, System.Web.WebPages.Razor, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31BF3856AD364E35" requirePermission="false" />
			      <section name="pages" type="System.Web.WebPages.Razor.Configuration.RazorPagesSection, System.Web.WebPages.Razor, Version=3.0.0.0, Culture=neutral, PublicKeyToken=31BF3856AD364E35" requirePermission="false" />
			    </sectionGroup>
			  </configSections>
			
			  <system.web.webPages.razor>
			    <host factoryType="System.Web.Mvc.MvcWebRazorHostFactory, System.Web.Mvc, Version=5.2.3.0, Culture=neutral, PublicKeyToken=31BF3856AD364E35" />
			    <pages pageBaseType="System.Web.Mvc.WebViewPage">
			      <namespaces>
			        <add namespace="System.Web.Mvc" />
			        <add namespace="System.Web.Mvc.Ajax" />
			        <add namespace="System.Web.Mvc.Html" />
			        <add namespace="System.Web.Routing" />
			        <add namespace="System.Web.Optimization" />
			        <add namespace="Web" />
			        <add namespace="Kendo.Mvc.UI" />
			        <add namespace="Common.Utils" />
			        
			      </namespaces>
			    </pages>
			  </system.web.webPages.razor>
			
			  <appSettings>
			    <add key="webpages:Enabled" value="false" />
			  </appSettings>
			
			  <system.webServer>
			    <handlers>
			      <remove name="BlockViewHandler"/>
			      <add name="BlockViewHandler" path="*" verb="*" preCondition="integratedMode" type="System.Web.HttpNotFoundHandler" />
			    </handlers>
			  </system.webServer>
			</configuration>
			'''
			fsa.generateFile(folderPath + "/Views/Web.config", webConfigFile)
		}
		
		
	}
}