package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.Functionality
import org.xtext.example.compras.compras.FunctionalityActionType
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.ScriptRef

class ScriptSegmentLayerAsset {

	def doGenerate(Resource resource, IFileSystemAccess2 fsa) { 
		var isCreatedIndex = false
		
		// Genera los scripts javascript configurados en la instancia del DSL
		for (e : resource.allContents.toIterable.filter(ScriptRef)) {
			var moduleName = (e.functionality.eContainer as Module).name
			for (f : e.functionality.functionalityActionType.toArray()) {

				var actionType = f as FunctionalityActionType

				if (isCreatedIndex == false) {
					fsa.generateFile(
						"Web/" + "Areas/" + moduleName.toUpperCase + "/Scripts/" + e.functionality.entity.name + "/" +
							"Index.js", compileIndex(e.functionality, moduleName))
					isCreatedIndex = true
				}

				// Valida si cada accion esta configurada en la funcionalidad
				// CREATE
				// val isCreateAction = actionType.exists[f.toString() == "CREATE"]
				if (actionType.name == "CREATE") {
					fsa.generateFile(
						"Web/" + "Areas/" + moduleName.toUpperCase + "/Scripts/" + e.functionality.entity.name + "/" +
							"Registrar.js", compileRegistar(e.functionality, moduleName))
				}

				// UPDATE
				// val isEditAction = actionType.exists[it.name == "EDIT"]	
				if (actionType.name == "EDIT") {
					// getImplementationScript = compileGet(functionality, CrudType.IMPLEMENTATION)
					fsa.generateFile(
						"Web/" + "Areas/" + moduleName.toUpperCase + "/Scripts/" + e.functionality.entity.name + "/" +
							"Editar.js", compileEditar(e.functionality))
				}

				// DELETE
				// if (actionType.name =="DELETE") {}	
				if (actionType.name == "DELETE") {
					fsa.generateFile(
						"Web/" + "Areas/" + moduleName.toUpperCase + "/Scripts/" + e.functionality.entity.name + "/" +
							"Index.js", compileIndexDelete(e.functionality, moduleName))
					isCreatedIndex = true
				}

			}

		}

	} 

	def compileEditar(Functionality functionality) {
		return '''
			
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

	def compileRegistar(Functionality functionality, String moduleName) {
		return '''
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

	def compileIndex(Functionality functionality, String moduleName) {
		var CharSequence output

		output = '''
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
		    };
		}();
		'''

		return output

	}

	def compileIndexDelete(Functionality functionality, String moduleName) {
		var CharSequence output

		output = '''
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
		    ,
		    									eliminar«functionality.entity.name»: function (e) {
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
		    											                    url: "/«moduleName.toUpperCase»/«functionality.entity.name»/Eliminar/" + id
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
		        
		    };
		}();
		'''

		return output

	}

}
