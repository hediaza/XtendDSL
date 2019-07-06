package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.ViewsRef
import org.xtext.example.compras.compras.Module

import static extension org.xtext.example.compras.generator.CustomExtentions.*

import org.xtext.example.compras.compras.Functionality
import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.EntityField

class ViewSegmentLayerAsset {
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {
				   	
		// Genera las vistas configurados en la instancia del DSL
		for (e : resource.allContents.toIterable.filter(ViewsRef)){ 
			genFilesByFunctionality(fsa, e.functionality)
		}
		
	}

	def genFilesByFunctionality(IFileSystemAccess2 fsa, Functionality functionality) {
		var CharSequence output
		var moduleName = (functionality.eContainer as Module).name
		var folderPath = "Web/Areas/" + moduleName + "/Views/" + functionality.entity.name
		
		for (actionType : functionality.functionalityActionType) {
			switch(actionType.name) {
				case "CREATE": {
					output = compileCreate(functionality, moduleName)
					fsa.generateFile(folderPath + "/Registrar.cshtml", output)
				}
				
				case "VIEW_GRID": {
					output = compileViewGrid(functionality, moduleName)
					fsa.generateFile(folderPath + "/Index.cshtml", output)
				}
				
				case "EDIT": {
					output = compileEdit(functionality, moduleName)
					fsa.generateFile(folderPath +"/Editar.cshtml", output)
				}
			}
		}
	}
	
	def compileCreate(Functionality functionality, String moduleName) {
		var entity = functionality.entity
				
		'''
		@using Models.«moduleName»;
		
		@model «entity.dtoName»
		
		@{
		    var viewName = Path.GetFileNameWithoutExtension(VirtualPath);
		}
		
		<div id="@viewName">
		    <!-- Script de la vista modal -->
		    <script src="@Url.Content(Utils.GetJsFilePath(VirtualPath))"></script>
		
		    @using (Ajax.BeginForm("Registrar", "«entity.name»", new { area = "«moduleName»" }, new AjaxOptions { HttpMethod = "POST", OnSuccess = viewName + ".onSuccess" }))
		    {
		        <div class="modal-header">
		            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		            <h3 class="modal-title">Registrar «entity.camelCaseName»</h3>
		        </div>
		
		        <div class="modal-body">
		            <div class="alert alert-info">
		                <strong><i class="fa fa-info-circle" aria-hidden="true"></i></strong>
		                Ingrese los datos que desea registrar.
		            </div>
		
		            <div class="row">
					«FOR ef : entity.entityField»  
						«IF ef.name != "Id"»
							<div class="form-group col-md-12">
							«compileUIControl(ef)»
							</div>
						«ENDIF»
					«ENDFOR»
		            </div>
		
		        </div>
		
		        <div class="modal-footer">
		            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
		            <input type="submit" class="btn btn-primary" value="Guardar">
		        </div>
		    }
		
		    <!-- Inicialización script de vista -->
		    <script>
		            @(viewName).init();
		    </script>
		</div>
		'''
	}
	
	def compileViewGrid(Functionality functionality, String moduleName) {
		var entity = functionality.entity
		val isCreateAction = functionality.functionalityActionType.filter[it.name == "CREATE"].size
		val isEditAction = functionality.functionalityActionType.filter[it.name == "EDIT"].size
		val isDeleteAction = functionality.functionalityActionType.filter[it.name == "DELETE"].size
		
		'''
		@using Models.«moduleName»;
		
		@{
		    ViewBag.Title = "«entity.pascalCaseName»";
		    var viewName = Path.GetFileNameWithoutExtension(VirtualPath);
		}
		
		<div id="@viewName">
		    <!-- Scripts -->
		    <script src="@Url.Content(Utils.GetJsFilePath(VirtualPath))"></script>
		    <!-- Plantilla que se utilizará en la columna de acciones de la grilla -->
		    <script id="actionTemplate" type="text/x-kendo-template">
		        <div class='text-center'>
					«IF isEditAction >= 1 »
					<a class='btn btn-primary' data-modal="" href='@Url.Action("Editar", "«entity.name»", new { area = "«moduleName»" })/#=data.Id#'>Editar</a>
		            «ENDIF»
		            
		            «IF isDeleteAction >= 1 »
		            <a class='btn btn-danger' onclick='Index.eliminar«entity.name»(event)'>Eliminar</a>
		            «ENDIF»
		        </div>
		    </script>
		
		    <!-- Encabezado -->
		    <div class="row wrapper border-bottom white-bg page-heading">
		        <div class="col-sm-4">
		            <h2>@ViewBag.Title</h2>
		            <ol class="breadcrumb"><li>Lista de elementos</li></ol>
		        </div>
		        <div class="col-sm-8">
		            <div class="title-action">
						«IF isCreateAction >= 1 »
						<a class='btn btn-primary' data-modal="" href="@Url.Action("Registrar", "«entity.name»", new { area = "«moduleName»" })">Registrar</a>
		                «ENDIF»
		            </div>
		        </div>
		    </div>
		
		    <!-- Contenidos -->
		    <div class="row">
		        <div class="col-lg-12">
		            <div class="wrapper wrapper-content">
		                «compileGridUIControl(entity, moduleName)»
		            </div>
		        </div>
		    </div>
		
		    <!-- Inicializadores -->
		    <script>
		        $(function () {
		            @(viewName).init();
		        });
		
		    </script>
		</div>
		'''
	}
	
	def compileEdit(Functionality functionality, String moduleName) {
		var entity = functionality.entity
		
		'''
		@using Models.«moduleName»;
		
		@model «entity.dtoName»
		
		@{
		    var viewName = Path.GetFileNameWithoutExtension(VirtualPath);
		}
		
		<div id="@viewName">
		    <!-- Script de la vista modal -->
		    <script src="@Url.Content(Utils.GetJsFilePath(VirtualPath))"></script>
		
		    @using (Ajax.BeginForm("Editar", "«entity.name»", new { area = "«moduleName»" }, new AjaxOptions { HttpMethod = "POST", OnSuccess = viewName + ".onSuccess" }))
		    {
		        <div class="modal-header">
		            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		            <h3 class="modal-title">Editar «entity.camelCaseName»</h3>
		        </div>
		
		        <div class="modal-body">
		            <div class="alert alert-info">
		                <strong><i class="fa fa-info-circle" aria-hidden="true"></i></strong>
		                Ingrese los datos que desea editar.
		            </div>
		
				<div class="row">
					«FOR ef : entity.entityField»  
						«IF ef.name == "Id"»
						@Html.HiddenFor(m => m.«ef.name»)
						«ELSE»
						<div class="form-group col-md-12">
						«compileUIControl(ef)»
						</div>
						«ENDIF»
					«ENDFOR»
				</div>
		
		        </div>
		
		        <div class="modal-footer">
		            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
		            <input type="submit" class="btn btn-primary" value="Guardar">
		        </div>
		    }
		
		    <!-- Inicialización script de vista -->
		    <script>
		            @(viewName).init();
		    </script>
		</div>
		'''
	}

	def compileUIControl(EntityField ef) {
		var CharSequence output 
		
		// Si es un tipo de dato comun "string, int, datetime, float"
		if (ef.entityType.entity === null) {
			var type = ef.entityType.commonFieldType.toString
			
			switch(type) {
				case "string": {
					output = compileStringUIControl(ef)
				}
				case "int": {
					output = compileIntUIControl(ef)
				}
				case "float": {
					// TODO: definir metodo para float
				}
				case "datetime": {
					// TODO: definir metodo para datetime
				}
			} 
		} 
		
		// Si es un tipo de dato que representa una entidad
		else {
			output = compileDropDownUIControl(ef)
		}
	
		return output
	}
	
	def compileStringUIControl(EntityField ef) {
		'''
		@Html.LabelFor(m => m.«ef.name»)
		@(Html.Kendo().TextBoxFor(m => m.«ef.name»).HtmlAttributes(new { @class = "", @style = "width: 100%;" }))
		«IF ef.entityFieldRequired !== null »
		@Html.ValidationMessageFor(m => m.«ef.name»)
		«ENDIF»
		
		'''
	}
	 
	def compileIntUIControl(EntityField ef) {
		'''
		@Html.LabelFor(m => m.«ef.name»)
		@(Html.Kendo().NumericTextBoxFor(m => m.«ef.name»)
		              .Min(0).HtmlAttributes(new { @class = "", @style = "width: 100%;" }))
		«IF ef.entityFieldRequired !== null »
		@Html.ValidationMessageFor(m => m.«ef.name»)
		«ENDIF»
		
		'''
	}
	
	def compileDropDownUIControl(EntityField ef) {
		var entity = ef.entityType.entity
		var module = entity.eContainer as Module
		
		'''
		@Html.LabelFor(m => m.«ef.name»)
		@(Html.Kendo().DropDownListFor(m => m.«ef.name»)
		                                    .DataTextField("Nombre")
		                                    .DataValueField("Id")
		                                    .HtmlAttributes(new { style = "width: 100%;" })
		                                    .OptionLabel("Seleccione...")
		                                    .Filter("contains")
		                                    .DataSource(source =>
		                                    {
		                                        source.Custom().Type("aspnetmvc-ajax")
		                                            .Transport(t =>
		                                            {
		                                                t.Read(r => r.Action("ListarDropDown", "«entity.name»", new { area = "«module.name»" }));
		                                            })
		                                            .ServerFiltering(false)
		                                            .Schema(s => { s.Data("Data").Total("Total").Errors("Errors"); })
		                                            .Events(e => e.Error("Utils.onModelStateError"));
		                                    }))
		«IF ef.entityFieldRequired !== null »
		@Html.ValidationMessageFor(m => m.«ef.name»)
		«ENDIF»
		
		'''
	}
	
	def compileGridUIControl(Entity entity, String moduleName) {
		'''
		@(Html.Kendo().Grid<«entity.dtoGridName»>()
						.Name("grid")
						.Columns(columns =>
						{
							columns.Bound(p => p.Id).Width(40).Filterable(false);
							«FOR ef : entity.entityField»  
								«IF ef.name != "Id"»
								columns.Bound(p => p.«ef.name»);
								«ENDIF»
        					«ENDFOR»
							columns.Bound(c => c.Id).ClientTemplate("#=Index.actionTemplate(data)#").Title("Acciones").Width(230).Filterable(false);
						})
						.Selectable()
						.Filterable(f => f.Mode(GridFilterMode.Row))
						.Pageable(p => p.Refresh(true))
						.Sortable(s => s.Enabled(false))
						.Scrollable()
						.HtmlAttributes(new { style = "height:550px;" })
						.Events(e => e.DataBound("App.handleModal"))
						.DataSource(dataSource => dataSource
							.Ajax()
							.ServerOperation(false)
							.Events(e => e.Error("Utils.onModelStateError"))
							.PageSize(10)
							.Read(read => read.Action("ListarGrid", "«entity.name»", "«moduleName»"))
							.ServerOperation(false)
						))
						
        '''
	}
}