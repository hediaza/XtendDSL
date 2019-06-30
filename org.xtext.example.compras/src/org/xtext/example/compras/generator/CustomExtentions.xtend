package org.xtext.example.compras.generator

import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.Module

class CustomExtentions {
	/**
	 * Retorna el nombre de la entidad con la sigla DTO 
	 */
	def static dtoName(Entity e) { 
		e.name + "DTO"
	}
	 
	 
	/**
	 * Retorna la ruta de la entidad con el namespace 
	 */
	def static dtoPathName(Entity e) {
		var moduleName = (e.eContainer as Module).name
		"Models." + moduleName + "." + e.dtoName
	}
}