package AltaPartido;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author gabriel mamani claros
 *
 */
public class MainReserva extends Application {
	private BorderPane rootLayout;	
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {
		/**
		 * 
		 */
		try {
			// Carga el dise�o del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainReserva.class.getResource("MainLayouts_Controles.fxml"));
			rootLayout = (BorderPane) loader.load();				
			
			// Mostramos la escena del BorderPane de la variable rootLayot
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ejemplo sobre controles");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
