package org.xtext.example.compras.generator

import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.Functionality
import com.google.common.base.CaseFormat

class CustomExtentions {
	/**
	 * Retorna el nombre de la entidad con la sigla DTO 
	 */
	def static dtoName(Entity e) { 
		e.name + "DTO"
	}
	 
	
	/**
	 * Retorna el nombre de la entidad con la sigla DTO en formato CamelCase
	 */
	def static dtoCamelCaseName(Entity e) { 
		e.camelCaseName + "DTO"
	}
	
	/**
	 * Retorna el nombre de la entidad en formato CamelCase
	 */
	def static camelCaseName(Entity e) { 
		CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, e.name)
	}
	 
	/**
	 * Retorna la ruta de la entidad con el namespace 
	 */
	def static dtoPathName(Entity e) {
		var moduleName = (e.eContainer as Module).name
		"Models." + moduleName + "." + e.dtoName
	}
	
	/**
	 * Retorna el nombre que usara para el modelo de la grilla "XxxGridDTO"
	 */
	def static dtoGridName(Entity e) { 
		e.name + "GridDTO"
	}
	
	/**
	 * Retorna el nombre que usara para la capa de acceso a datos
	 */
	def static repositoryName(Entity e) { 
		e.name + "Repository"
	}
	
	/**
	 * Retorna el nombre que usara para la interfase en la capa de acceso a datos
	 */
	def static IRepositoryName(Entity e) { 
		"I" + e.name + "Repository"
	}
	
	/**
	 * Retorna el nombre de la entidad con la sigla BL en formato CamelCase
	 */
	 def static blName(Functionality e) {
		e.entity.name + "BL" 
	}
	 
}