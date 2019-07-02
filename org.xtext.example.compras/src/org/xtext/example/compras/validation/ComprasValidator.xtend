/*
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.ComprasPackage
import org.xtext.example.compras.compras.EntityField
import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.CommonFieldType
import org.xtext.example.compras.compras.FuncViewDropDownAction
import org.xtext.example.compras.compras.Functionality

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ComprasValidator extends AbstractComprasValidator {
	
	@Check
	def void checkModuleNameIsUpper(Module module) {
	    if (module.name != module.name.toUpperCase()) {
	        error("El nombre de los modulos debe ser en mayuscula", 
	        		ComprasPackage.Literals.MODULE__NAME
	        )
	    }
	}
	
	@Check
	def void checkNameStartsWithCapital(Entity entity) {
	    if (!Character.isUpperCase(entity.name.charAt(0))) {
	        error("Los nombres de las entidades deben iniciar con mayuscula siguiendo la norma PascalCase", 
	        		ComprasPackage.Literals.ENTITY__NAME
	        )
	    }
	}

	@Check
	def void checkEntityFieldNameIsUnique(EntityField entityField) {
		var entity = entityField.eContainer as Entity
		var countField = entity.entityField.filter[it.name == entityField.name].size
		
		if (countField > 1) {
			error("Los nombres de atributos deben ser unicos", 
				  ComprasPackage.Literals.ENTITY_FIELD__NAME
			)
		}
	}  
	
	
	@Check
	def void checkEntityNameIsUnique(Entity entity) {
		var module = entity.eContainer as Module
		var countField = module.entity.filter[it.name == entity.name].size
		
		if (countField > 1) {
			error("Los nombres de las entidades deben ser unicos", 
				  ComprasPackage.Literals.ENTITY__NAME
			)
		}
	}
	
	
	@Check
	def void checkEntityHasFieldNameId(Entity entity) {		
		try {
			var entityField = entity.entityField.filter[it.name == "Id"].get(0)
			
			if (entityField.entityType.commonFieldType != CommonFieldType.INT) {
				error('El atributo Id debe ser del tipo "int"', 
					  ComprasPackage.Literals.ENTITY__NAME
				)
			}
			
		} catch (Exception e) {
			error("El atributo Id se debe definir obligatoriamente en la entidad", 
				  ComprasPackage.Literals.ENTITY__NAME
			)
		}
	}
	

	@Check
	def void checkFuncViewDropDownActionIsRelatedInEntityWithAttribute(FuncViewDropDownAction funcViewDropDownAction) {
		var functionality = funcViewDropDownAction.eContainer as Functionality
		
		try {
			var entityField = functionality.entity.entityField.filter[it.name == "Nombre"].get(0)
			
			if (entityField.entityType.commonFieldType != CommonFieldType.STRING) {
				error('El atributo "Nombre" debe ser de tipo "string" en la entidad relacionada', 
					funcViewDropDownAction.eContainer, funcViewDropDownAction.eContainingFeature, -1
				)
			}
			
		} catch (Exception e) {
			error('El atributo "Nombre" se debe definir obligatoriamente en la entidad relacionada', 
				  funcViewDropDownAction.eContainer, funcViewDropDownAction.eContainingFeature,-1
			)
		}
		
	}
	
}
