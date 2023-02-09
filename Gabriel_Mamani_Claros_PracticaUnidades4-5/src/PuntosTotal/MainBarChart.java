package PuntosTotal;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;


public class MainBarChart extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Carga el XML con el dise�o principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainBarChart.class.getResource("BarChart.fxml"));
			TabPane rootLayout = (TabPane) loader.load();

			// Descomentar para ver CSS
			rootLayout.getStylesheets().addAll(this.getClass().getResource("bar.css").toExternalForm());
			
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
