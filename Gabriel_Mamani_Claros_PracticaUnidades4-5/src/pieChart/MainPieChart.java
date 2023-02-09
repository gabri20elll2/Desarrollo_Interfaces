package pieChart;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainPieChart extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Carga el XML con el diseño principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainPieChart.class.getResource("PieChart.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();

			// Descomentar para ver CSS
			//rootLayout.getStylesheets().addAll(this.getClass().getResource("pie.css").toExternalForm());
			
			// Se añade el diseño principal a la escena
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
