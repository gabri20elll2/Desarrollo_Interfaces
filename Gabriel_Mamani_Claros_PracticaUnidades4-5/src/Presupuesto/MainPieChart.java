package Presupuesto;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainPieChart extends Application {
	@Override
	/**
	 * @param arrancar el pie char
	 */
	public void start(Stage primaryStage) {
		try {
			// Carga el XML con el dise�o principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainPieChart.class.getResource("PieChart.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();

			// Descomentar para ver CSS
			//rootLayout.getStylesheets().addAll(this.getClass().getResource("pie.css").toExternalForm());
			
			// Se a�ade el dise�o principal a la escena
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
