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
				   	
		for (e : resource.allContents.toIterable.filter(CommonLayerRef)) {
    		var moduleName = (e.entity.eContainer as Module).name

        	fsa.generateFile("Models/" + moduleName + "/" + e.entity.dtoName + ".cs", compile(e.entity, moduleName))
    	}

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
		}
		'''
	}
	
	def compile(EntityField ef) {
		var String type
		
		if (ef.entityType.entity === null) {
			type = ef.entityType.commonFieldType.toString
		} else {
			type = ef.entityType.entity.dtoPathName
		}
		
		return
		'''
		public «type» «ef.name» { get; set; }
		''' 
	}
}
