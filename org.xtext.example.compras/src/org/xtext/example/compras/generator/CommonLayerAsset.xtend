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
}
