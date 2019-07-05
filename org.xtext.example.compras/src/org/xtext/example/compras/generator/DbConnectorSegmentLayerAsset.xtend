package org.xtext.example.compras.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.compras.compras.Technology

class DbConnectorSegmentLayerAsset {
	
	def doGenerate(Resource resource,
				   IFileSystemAccess2 fsa) {

		// Genera archivo de conexión a la base de datos "Web/Connections.config"
		for (t : resource.allContents.toIterable.filter(Technology)){ 
			val connectionsConfig = '''
			<connectionStrings>
			  <add name="SqlServerConnection" connectionString=«t.connectionString.toString» />
			</connectionStrings>
			'''		
			fsa.generateFile("Web/Connections.config", connectionsConfig)	
		}

	}
}