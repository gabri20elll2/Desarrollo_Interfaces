package Presupuesto;
	
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class PieChartController {
	
	@FXML
    private PieChart pieChart;
	
	@FXML
    private void initialize() {
		// Rellenamos los datos del gr�fico
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("RMadrid", 40),
                new PieChart.Data("Barca",25 ),
                new PieChart.Data("Betis", 18),
                new PieChart.Data("Atletico",10 ),
                new PieChart.Data("Valencia", 7));
		
		pieChart.setData(pieChartData);

    }

}
