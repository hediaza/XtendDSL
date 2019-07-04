package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.ViewsRef
import org.xtext.example.compras.compras.Module
import org.xtext.example.compras.compras.Functionality
import org.xtext.example.compras.compras.Entity
import org.xtext.example.compras.compras.EntityField
import javax.sound.sampled.BooleanControl.Type 
import org.xtext.example.compras.compras.FunctionalityActionType

import static extension org.xtext.example.compras.generator.CustomExtentions.*

class ViewSegmentLayerAsset {
	
	CharSequence modelField = ''''''
	
	def doGenerate(Resource resource,IFileSystemAccess2 fsa) {
	 	var isCreatedIndex = false
	 	
		// Genera las vistas configurados en la instancia del DSL
		for (e : resource.allContents.toIterable.filter(ViewsRef)) 
		{
			var moduleName = (e.functionality.eContainer as Module).name
			for (f : e.functionality.functionalityActionType.toArray()) 
					{
								// Inicializaciones de proposito general
								// var entity = functionality.entity
								//var actionType = e.functionality.functionalityActionType
								//var moduleName = (e.functionality.eContainer as Module).name
								var actionType = f as FunctionalityActionType
								//var moduleName = (e.functionality.eContainer as Module).name
								/*
								if (isCreatedIndex == false)
								{
									fsa.generateFile("Web/" + "Areas/" + moduleName + "/Views/" + e.functionality.entity.name +"/" + "Index.cs", compileIndex(e.functionality, moduleName))
									isCreatedIndex = true
								}
								*/
								
						        // Valida si cada accion esta configurada en la funcionalidad
								// CREATE
								//val isCreateAction = actionType.exists[f.toString() == "CREATE"]
								if (actionType.name == "CREATE") 
								{
									fsa.generateFile("Web/" + "Areas/" + moduleName + "/Views/" + e.functionality.entity.name +"/" + "Registrar.cshtml", compileRegistarEditar(e.functionality,"Registrar"))			
								}
								
								// READ
								//val isViewGridAction = actionType.exists[it.name == "VIEW_GRID"]		
								if (actionType.name == "VIEW_GRID")
								{
									fsa.generateFile("Web/" + "Areas/" + moduleName + "/Views/" + e.functionality.entity.name +"/" + "Index.cshtml", compileIndex(e.functionality, moduleName))
										
								}
								
								//val isViewDropDownAction = actionType.filter[it.name == "VIEW_DROPDOWN"].size		
								if (actionType.name =="VIEW_DROPDOWN") 
								{
									fsa.generateFile("Web/" + "Areas/" + moduleName + "/Views/" + e.functionality.entity.name +"/" + "Detallar.cshtml", compileDetallar(e.functionality, moduleName))
								}
								
								// UPDATE
								//val isEditAction = actionType.exists[it.name == "EDIT"]		
								if (actionType.name =="EDIT") 
								{
									//getImplementationScript = compileGet(functionality, CrudType.IMPLEMENTATION)
									fsa.generateFile("Web/" + "Areas/" + moduleName + "/Views/" + e.functionality.entity.name +"/" + "Editar.cshtml", compileRegistarEditar(e.functionality,"Editar"))
								}
								//DELETE
								//val isDeleteAction = actionType.exists[it.name == "DELETE"]		
								if (actionType.name =="DELETE") {	
								}
								
					}		
    	}
    	
    	// Genera archivo del proyecto para la capa de acceso en comun "Models.csproj"
    	//fsa.generateFile("Models/Models.csproj", compileCsproj())
    	
    	
		
	}


def compileDetallar(Functionality functionality, String moduleName)  {
		
		return
		'''
		'''
	}
	

def compileRegistarEditar(Functionality functionality, String typeViewCreateOrEdit)  {
		var entity = functionality.entity
		
		var descriptionFunctionality = ""
		if(typeViewCreateOrEdit == "Editar")
		{
			descriptionFunctionality = "Ingrese los datos que desea editar"
		}
		if(typeViewCreateOrEdit == "Registrar")
		{
			descriptionFunctionality = "Ingrese los datos que desea registrar"
		}
		
		var moduleName = (functionality.eContainer as Module).name
		return
		'''
		@using Models.�moduleName�;
		@model �entity.dtoName�
		
		@{
		    var viewName = Path.GetFileNameWithoutExtension(VirtualPath);
		}
		
		<div id="@viewName">
		    <!-- Script de la vista modal -->
		    <script src="@Url.Content(Utils.GetJsFilePath(VirtualPath))"></script>
		    @using (Ajax.BeginForm("�typeViewCreateOrEdit�", �entity.name�, new { area = �moduleName� }, new AjaxOptions { HttpMethod = "POST", OnSuccess = viewName + ".onSuccess", OnBegin = viewName + ".onBegin" }))
		    {
		        <div class="modal-header">
		            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		            <h3 class="modal-title">�typeViewCreateOrEdit� �entity.camelCaseName�</h3>
		        </div>
		        <div class="modal-body">
		            <div class="alert alert-info">
		                <strong><i class="fa fa-info-circle" aria-hidden="true"></i></strong>
		                �descriptionFunctionality�.
		            </div>
		            <div>
						�FOR ef : entity.entityField�  
						       �ef.createModelFields(typeViewCreateOrEdit)�
						�ENDFOR�  
		            </div>
				        </div>
		
		        <div class="modal-footer">
		            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
		            <input type="submit" class="btn btn-primary" value="Guardar">
		        </div>
		    }
		
		    <!-- Inicializaci�n script de vista -->
		    <script>
		            @(viewName).init();
		    </script>
		</div>
		'''
	}
	

def compileIndex(Functionality functionality, String moduleName) 
 	{	var entity = functionality.entity
		return
		'''
		@using Models.�moduleName�;
		
		@{
		    ViewBag.Title = "�entity.name�s";
		    var viewName = Path.GetFileNameWithoutExtension(VirtualPath);
		}
		
		<div id="@viewName">
		    <!-- Scripts -->
		    <script src="@Url.Content(Utils.GetJsFilePath(VirtualPath))"></script>
		    <!-- Plantilla que se utilizar� en la columna de acciones de la grilla -->
		    <script id="actionTemplate" type="text/x-kendo-template">
		        <div class='text-center'>
		            <a class='btn btn-primary' data-modal="" href='@Url.Action("Editar", "�entity.name�", new { area = "�moduleName�" })/#=data.Id#'>Editar</a>
		            <a class='btn btn-danger' onclick='Index.eliminarTienda(event)'>Eliminar</a>
		        </div>
		    </script>
		
		    <!-- Encabezado -->
		    <div class="row wrapper border-bottom white-bg page-heading">
		        <div class="col-sm-4">
		            <h2>@ViewBag.Title</h2>
		            <ol class="breadcrumb"><li>Lista de �entity.name�s</li></ol>
		        </div>
		        <div class="col-sm-8">
		            <div class="title-action">
		                <a class='btn btn-primary' data-modal="" href="@Url.Action("Registrar", "�entity.name�", new { area = "�moduleName�" })">Registrar</a>
		            </div>
		        </div>
		    </div>
		
		    <!-- Contenidos -->
		    <div class="row">
		        <div class="col-lg-12">
		            <div class="wrapper wrapper-content">
		                @(Html.Kendo().Grid<�entity.dtoGridName�>()
		                        .Name("grid")
		                        .Columns(columns =>
		                        {
		                            columns.Bound(p => p.Id).Width(80).Filterable(f => f.Enabled(false));
		                            columns.Bound(p => p.Nombre);
		                            columns.Bound(p => p.Tipo);
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
		                            .Read(read => read.Action("ListarGrid", "�entity.name�", "�moduleName�"))
		                            .ServerOperation(false)
		                        ))
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
	
	
def	createDropDownListFor(EntityField entity)	
	{   
		return 
		'''
		<div class="row">
		@* �entity.entityFieldLabel� *@
				     
                       <div class="form-group col-md-12">
                             @Html.LabelFor(m => m.�entity.name�)
                             @(Html.Kendo().DropDownListFor(m => m.�entity.name�)
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
                                                        t.Read(r => r.Action("ListarDropDown", "�entity.entityType.entity.name�", new { area = "�(entity.eContainer.eContainer as Module).name�" }));
                                                    })
                                                    .ServerFiltering(false)
                                                    .Schema(s => { s.Data("Data").Total("Total").Errors("Errors"); })
                                                    .Events(e => e.Error("Utils.onModelStateError"));
                                            }))
                            @Html.ValidationMessageFor(m => �entity.name�)
                        </div>
		 </div>			                
		'''
	}

def CreateTextBoxFor(EntityField entity){
	return
	'''
	<div class="row">
	<div class="form-group col-md-12">
	                    @Html.LabelFor(m => m.�entity.name�)
	                    @(Html.Kendo().TextBoxFor(m => m.�entity.name�).HtmlAttributes(new { @class = "", @style = "width: 100%;" }))
	                    @Html.ValidationMessageFor(m => m.�entity.name�)
	                </div>
	 </div>
	'''
	}
	
def CreateDatePickerFor(EntityField entity){
	return
	'''
	<div class="row">
	<div class="form-group col-md-12">
	                    @Html.LabelFor(m => m.�entity.name�)
	                    @(Html.Kendo().DatePickerFor(m => m.�entity.name�).HtmlAttributes(new { @class = "", @style = "width: 100%;" }))
	                    @Html.ValidationMessageFor(m => m.�entity.name�)
	                </div>
	 </div>
	'''}

def CreateNumericTextBoxFor(EntityField entity){
	return
	'''
	<div class="row">
	<div class="form-group col-md-12">
	                    @Html.LabelFor(m => m.�entity.name�)
	                    @(Html.Kendo().NumericTextBoxFor(m => m.�entity.name�)
	                                  .Format("c").Min(0).HtmlAttributes(new { @class = "", @style = "width: 100%;" }))
	                    @Html.ValidationMessageFor(m => m.�entity.name�)
	                </div> 
	 </div>
	'''
	}

def createModelFields(EntityField entityField, String typeViewCreateOrEdit)  {
			var data = ''''''
			if (entityField.entityType.entity != null)
			    {
			    	data = createDropDownListFor(entityField)
			    }	
			else
			 	{
				 switch(entityField.entityType.commonFieldType.toString)
					 {
					 	case "string":
					 	{data = CreateTextBoxFor(entityField)}
					 	case "int":
					 	{if(entityField.name != "Id")
					 			data = CreateNumericTextBoxFor(entityField)
					 	 else
						 	 if(typeViewCreateOrEdit =="Editar")
					 			data = '''@Html.HiddenFor(m => m.Id)'''	
					 	}
					 	case 'bool':
					 	{}
						case 'float':
						{}
						case 'datetime':
						{data = CreateDatePickerFor(entityField)}
					 }	
			 	}
		return data
		
	}


}