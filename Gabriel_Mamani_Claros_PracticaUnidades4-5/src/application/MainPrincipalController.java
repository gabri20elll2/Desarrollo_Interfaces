package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class MainPrincipalController {
	 @FXML
	 private PasswordField contraseña;

	 @FXML
	 private TextField usuario;

	// Pantalla principal en la que se avade o quita contenido
	private BorderPane rootLayout;
  
    /*@FXML
    private void initialize() {
        
    }*/
    
    @FXML
    private void abrirEquipos(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainPrincipalController.class.getResource("/Principal/Menu.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    private void cerrarEquipos(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	rootLayout.setCenter(null);	
    }

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}	
    
    @FXML
    void irInicio(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainPrincipalController.class.getResource("/application/Menu.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    void verificar(ActionEvent event) {
    	if(contraseña.getText().toString().equals("gabriel") && usuario.getText().toString().equals("gabriel")) {
    		abrirEquipos(event);
    	}
    }
    
}
