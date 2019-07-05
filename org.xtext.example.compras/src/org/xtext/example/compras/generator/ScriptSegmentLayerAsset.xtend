package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.ScriptRef
import org.xtext.example.compras.compras.Functionality
import org.xtext.example.compras.compras.Module

class ScriptSegmentLayerAsset {
		def doGenerate(Resource resource,
				       IFileSystemAccess2 fsa) {
				   	
		// Genera las vistas configurados en la instancia del DSL
		for (e : resource.allContents.toIterable.filter(ScriptRef)){ 
			genFilesByFunctionality(fsa, e.functionality)
		}
		
	}

	def genFilesByFunctionality(IFileSystemAccess2 fsa, Functionality functionality) {
		var CharSequence output
		var moduleName = (functionality.eContainer as Module).name
		var folderPath = "Web/Areas/" + moduleName + "/Scripts/" + functionality.entity.name
		
		for (actionType : functionality.functionalityActionType) {
			switch(actionType.name) {
				case "CREATE": {
					output = compileCreate(functionality, moduleName)
					fsa.generateFile(folderPath + "/Registrar.js", output)
				}
				
				case "VIEW_GRID": {
					output = compileViewGrid(functionality, moduleName)
					fsa.generateFile(folderPath + "/Index.js", output)
				}
				
				case "EDIT": {
					output = compileEdit(functionality, moduleName)
					fsa.generateFile(folderPath +"/Editar.js", output)
				}
			}
		}
	}
	
	def compileCreate(Functionality functionality, String moduleName) {		
		'''
		var Registrar = function () {
		    "use strict"
		    return {
		        // ---------------------------------
		        //           Propiedades 
		        // ---------------------------------
		        //..
		
		        // ---------------------------------
		        //           Metodos 
		        // ---------------------------------
		        init: function () {
		            console.log("((init))");
		            this.handleValidator();
		        },
		
		        handleValidator: function(){
		            $.validator.unobtrusive.parse($("#Registrar form"));
		        },
		
		        onSuccess: function (result) {
		            if (result.Success) {
		                swal({
		                    title: "Correcto",
		                    text: result.Message,
		                    type: "success"
		                }, function () {
		                    // recarga grilla y se mueve a la pagina 1                    
		                    $("#Index").find("#grid").data("kendoGrid").dataSource.read();
		                    // oculta modal
		                    modal.modal('hide');
		                });
		                
		            } else {
		                swal({
		                    title: "Error",
		                    text: result.Message,
		                    type: "error"
		                });
		            }
		        }
		        
		    }
		}();
		'''
	}
	
	def compileViewGrid(Functionality functionality, String moduleName) {
		var entity = functionality.entity
		val isDeleteAction = functionality.functionalityActionType.filter[it.name == "DELETE"].size
		
		'''
		var Index = function () {
		    "use strict";
		    return {
		        // ---------------------------------
		        //           Propiedades 
		        // ---------------------------------
		        actionTemplate: null,
		
		        // ---------------------------------
		        //           Metodos 
		        // ---------------------------------
		
		        init: function () {
		            console.log("((init))");
		            this.handleTemplates();
		        },
		
		        handleTemplates: function () {
		            this.actionTemplate = kendo.template($('#Index #actionTemplate').html());
		        }
				
				«IF isDeleteAction >= 1»
				,eliminar«entity.name»: function (e) {
				e.preventDefault();
				var grid = $("#Index").find("#grid").data("kendoGrid");
				var dataItem = grid.dataItem($(e.currentTarget).closest("tr"));
				var id = dataItem.Id;
				
				swal({
				    title: "Eliminación",
				    text: "¿Esta seguro de eliminar el registro seleccionado?",
				    type: "warning",
				    showCancelButton: true,
				    confirmButtonColor: "#DD6B55",
				    confirmButtonText: "Si, estoy seguro"
				}, function () {
				    $.ajax({
				        method: "POST",
				        url: "/«moduleName»/«entity.name»/Eliminar/" + id
				        })
				        .done(function (result) {
				            if (result.Success) {
				                swal("Correcto", result.Message, "success");
				                grid.dataSource.read();
				            } else {
				                swal({title: "Error", text: result.Message, type: "error"});
				            }
				            
				        });
				        
				    });
				}
		        «ENDIF»
		
		        
		    };
		}();
		'''
	}
	
	def compileEdit(Functionality functionality, String moduleName) {
		'''
		var Editar = function () {
		    "use strict"
		    return {
		        // ---------------------------------
		        //           Propiedades 
		        // ---------------------------------
		        //..
		
		        // ---------------------------------
		        //           Metodos 
		        // ---------------------------------
		        init: function () {
		            console.log("((init))");
		            this.handleValidator();
		        },
		
		        handleValidator: function(){
		            $.validator.unobtrusive.parse($("#Editar form"));
		        },
		
		        onSuccess: function (result) {
		            if (result.Success) {
		                swal({
		                    title: "Correcto",
		                    text: result.Message,
		                    type: "success"
		                }, function () {
		                    // recarga grilla y se mueve a la pagina 1                    
		                    $("#Index").find("#grid").data("kendoGrid").dataSource.read();
		                    // oculta modal
		                    modal.modal('hide');
		                });
		                
		            } else {
		                swal({
		                    title: "Error",
		                    text: result.Message,
		                    type: "error"
		                });
		            }
		        }
		        
		    }
		}();
		'''
	}
}