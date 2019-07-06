package deploynetapp.handlers;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Instance windows
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		// Current workspace path
		String projectPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/ComprasInstance";
		Path srcPath = Paths.get(projectPath + "/src-gen/");
		Path descPath = Paths.get(projectPath + "/src-gen-app/");
				
		// Restaura el repositorio a un estado ideal para realizar la tranaferencia de los 
		// archivos generados
		try {
			String command = "git -C " + descPath.toString() +" reset --hard";
			Process process = Runtime.getRuntime().exec(command);			
			process.waitFor();					     
			
			command = "git -C " + descPath.toString() +" clean -f -d";
			process = Runtime.getRuntime().exec(command);
			process.waitFor();			
		} catch (IOException e) {
		    e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		// Copia archivos al destino
		try {
			FileUtils.copyDirectory(srcPath.toFile(), descPath.toFile());
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
		// Muestra mensaje de resultado
		MessageDialog.openInformation(window.getShell(), "DeployNetApp", "Transferencia exitosa.\nRecuerde ejecutar los scrips SQL de la base datos previamente.");

		return null;
	}
}
