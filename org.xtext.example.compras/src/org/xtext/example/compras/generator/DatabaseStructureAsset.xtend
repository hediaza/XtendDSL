package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.EntityField

class DatabaseStructureAsset {
	
	StringBuffer ddlDbFkSql
	StringBuffer ddlDbSql
	
	new() {
		ddlDbSql = new StringBuffer()
		ddlDbFkSql = new StringBuffer()	
	}
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
				   	
		for (e : resource.allContents.toIterable.filter(Entity)) {
    		ddlDbSql.append(e.compile)
    	}
    	
    	// Se genera archivo SQL y adicionan las relaciones al final
    	// para evitar conflictos
    	ddlDbSql.append(ddlDbFkSql)
    	fsa.generateFile("Database/db.sql", ddlDbSql)
	}
		
	
	def compile(Entity e) {
		
		return
		'''
		CREATE TABLE «e.name» (
		   Id int NOT NULL IDENTITY, 
		   «FOR ef : e.entityField»
		   	   «IF ef.name != "Id"»  
               	  «ef.compile»
               «ENDIF»
           «ENDFOR»
		   CONSTRAINT Pk_«e.name»_Id PRIMARY KEY  (Id)
		);
		GO
		 
		'''
	}
	
	def compile(EntityField ef) {
		var String type
		
		// En caso de ser un tipo de dato comun
		if (ef.entityType.entity === null) {
			var commonFieldType = ef.entityType.commonFieldType.toString
			
			type = switch commonFieldType {
				case "string": "nvarchar(max)"
				case "int": "int"
				case "bool": "bit"
				case "float": "float"	
			}
			
		// En caso de ser una relación
		} else {
			type = "int" 
			ddlDbFkSql.append(ef.compileFk)
		}
		
		return
		'''
		«ef.name» «type»,
		''' 
	}
	
	
	def compileFk(EntityField ef) {
		var entityName = (ef.eContainer as Entity).name
		
		return 
		'''
		ALTER TABLE «entityName» 
		ADD CONSTRAINT fk_«entityName»_«ef.entityType.entity.name» 
		FOREIGN KEY ( «ef.name» ) 
		REFERENCES «ef.entityType.entity.name»( Id ) 
		ON DELETE NO ACTION 
		ON UPDATE NO ACTION;
		GO
		
		'''
	}
}
