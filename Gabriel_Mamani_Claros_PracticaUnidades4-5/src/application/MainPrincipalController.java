package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class MainPrincipalController {
	private BorderPane rootLayout2;

    @FXML
    private Button acceder;

    @FXML
    private PasswordField contraseña;

    @FXML
    private TextField usuario;

    @FXML
    void IniciarSesion(ActionEvent event) {
    	if(usuario.getText().equals("gabriel") && contraseña.getText().equals("gabriel")) {
    		main.PaginaPrincipal();
    		Stage ventana =(Stage) this.acceder.getScene().getWindow();
			ventana.close();
    	}else {
    		 Alert alert = crearAlert(AlertType.ERROR, "ERROR", "Usuario o contraseña incorrectos");
       	  alert.showAndWait();
    	}
    }
    
    //Main
    MainPrincipal main;
    
    public void setMain(MainPrincipal main) {
        this.main = main;
        
    }
	public static  Alert crearAlert(AlertType type, String title, String header) {
	    	Alert auxAlert = new Alert(type);
	    	
	    	auxAlert.setTitle(title);
	    	auxAlert.setHeaderText(header);
	    	
	    	return auxAlert;
	 }
	public BorderPane getRootLayout() {
		return rootLayout2;
	}

	public void setRootLayout(BorderPane rootLayout2) {
		this.rootLayout2 = rootLayout2;
		
	}
	//CLASIFICACION
	   @FXML
	    void abrirClasificacion(ActionEvent event) {
		   try {
				// Cargamos el archivo Controles Din micos
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainPrincipalController.class.getResource("/Clasificacion/ControlesDinamicos.fxml"));
				GridPane listadoControles = (GridPane) loader.load();

				// Se sit a en el centro del dise o principal
				rootLayout2.setCenter(listadoControles);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

	 //Inicio
	   @FXML
	    void PaginaPrincipal(ActionEvent event) {
		   /*try {
				// Cargamos el archivo Controles Din micos
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainPrincipalController.class.getResource("/Clasificacion/ControlesDinamicos.fxml"));
				GridPane listadoControles = (GridPane) loader.load();

				// Se sit a en el centro del dise o principal
				rootLayout2.setCenter(listadoControles);
			} catch (IOException e) {
				e.printStackTrace();
			}*/
	    }
	   
	   //paginas 
	    @FXML
	    private void abrirFormulario(ActionEvent event) {    	
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainPrincipalController.class.getResource("/PaginaUno/ControlesPagUno.fxml"));
				GridPane listadoControles = (GridPane) loader.load();

				rootLayout2.setCenter(listadoControles);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    @FXML
	    void ReservarPartido(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainPrincipalController.class.getResource("/AltaPartido/MainReserva.fxml"));
				BorderPane abrirreserva = (BorderPane) loader.load();

				rootLayout2.setCenter(abrirreserva);
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	    @FXML
	    void abrirTutorial(ActionEvent event) {    	
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainPrincipalController.class.getResource("/PaginaTres/MainLayouts_Controles.fxml"));
				BorderPane controlavanzado = (BorderPane) loader.load();

				rootLayout2.setCenter(controlavanzado);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    // Graficos
	    
	    @FXML
	    void pieChart(ActionEvent event) {
	     try {
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(MainPrincipalController.class.getResource("/pieChart/pieChart.fxml"));
			 AnchorPane tutorial=(AnchorPane) loader.load();
			 tutorial.getStylesheets().add("/pieChart/pie.css");
			 rootLayout2.setCenter(tutorial);
		
		
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	    }
	    
	    // barChart
	    @FXML
	    void barChart(ActionEvent event) {
	     try {
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(MainPrincipalController.class.getResource("/barChart/barChart.fxml"));
			 TabPane tutorial=(TabPane) loader.load();
			 tutorial.getStylesheets().add("/barChart/bar.css");
			 rootLayout2.setCenter(tutorial);
		
		
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	    }


}
