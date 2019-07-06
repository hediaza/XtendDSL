package org.xtext.example.compras.generator

import java.nio.file.Path
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.EntityField
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.charset.StandardCharsets
import org.xtext.example.compras.compras.Technology

class DatabaseStructureAsset {
	
	StringBuffer ddlDbFkSql
	StringBuffer ddlDbSql
	
	new() {
		ddlDbSql = new StringBuffer()
		ddlDbFkSql = new StringBuffer()	
	}
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
				   
				   	
		// Elimina los objetos de base de datos previamente 		   	
		ddlDbSql.append('''EXEC clear_db 
		GO
		
		''')
		
		// Adiciona la estructura DDL para la creación de la tabla		   	
		for (e : resource.allContents.toIterable.filter(Entity)) {
    		ddlDbSql.append(e.compile)
    	}
    	
    	// Se genera archivo SQL y adicionan las relaciones al final para evitar conflictos
    	ddlDbSql.append(ddlDbFkSql)
    	
    	// Se verifica si existen  información parametrica SEEDs configurados para ser adicionados a la base de datos
    	var sqlDmlSeeds = getSqlDmlSeeds(resource)
    	ddlDbSql.append(sqlDmlSeeds)
    	
    	// Se genera archivo SQL 
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
				case "datetime": "datetime"	
			}
			 
		// En caso de ser una relación
		} else {
			type = "int" 
			ddlDbFkSql.append(ef.compileFk)
		} 
		
		// Evalua si el campo puede ser nulo (determina el requerido)
		var nullable = if (ef.entityFieldRequired === null) "" else "NOT NULL" 
		
		return
		'''
		«ef.name» «type» «nullable»,
		''' 
	}
	
	
	def compileFk(EntityField ef) {
		var entityName = (ef.eContainer as Entity).name
		
		return 
		'''
		ALTER TABLE «entityName» 
		ADD CONSTRAINT fk«entityName»«ef.entityType.entity.name»«ef.name» 
		FOREIGN KEY ( «ef.name» ) 
		REFERENCES «ef.entityType.entity.name»( Id )  
		ON DELETE NO ACTION 
		ON UPDATE NO ACTION;
		GO
		
		'''
	}
	
	def getSqlDmlSeeds(Resource resource) {
		var technology = resource.allContents.toIterable.filter(Technology).get(0)
		
		// Valida que el archivo este configurado
		if (technology.dataFileSeed === null) {
			return ''''''
		}
		
		// Lee archivo configurado
		var seedFilename = technology.dataFileSeed.toString.replaceAll("^.|.$", "")  // elimina commillas dobles al inicio y al final de la cadena     
        var seedFilePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/ComprasInstance/src/" + seedFilename 
        var seedFileStringContent = new String(Files.readAllBytes(Paths.get(seedFilePath)), StandardCharsets.UTF_8)

		return seedFileStringContent
	}
}
