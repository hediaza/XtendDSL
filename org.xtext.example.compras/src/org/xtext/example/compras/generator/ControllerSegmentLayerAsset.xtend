package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.ControllersRef
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.Functionality

import static extension org.xtext.example.compras.generator.CustomExtentions.*

class ControllerSegmentLayerAsset {
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
		
		// TODO: Genera los controlladores configurados en la instancia del DSL
		// Genera los archivos de logica configurados
		for (e : resource.allContents.toIterable.filter(ControllersRef)){ 
			var moduleName = (e.functionality.eContainer as Module).name
			fsa.generateFile("Web/" + "Areas/" + moduleName + "/" + e.functionality.controllerName + ".cs", compile(e.functionality, moduleName))
		}
				   	
		// TODO: Genera el archivo del proyecto para la capa de presentación "Web.csproj"
		
		// TODO: Genera los archivo de configuración para el modulo que representa un "Area" en el proyecto de 
		// la capa de presentación siendo "<MODULO>AreaRegistration.cs, _ViewStart.cshtml, Web.config"
						   	
	}
	
	def compile (Functionality functionality, String moduleName){
			return
		'''
		using BusinessLogic.TIENDAS;
		using Common.Utils;
		using Kendo.Mvc.Extensions;
		using Kendo.Mvc.UI;
		using Models.TIENDAS;
		using DbConnector;
		using System;
		using System.Collections.Generic;
		using System.Linq;
		using System.Web;
		using System.Web.Mvc;
		using Web.Controllers;
		}
		'''		
	}
}