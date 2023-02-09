package barChart;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

public class BarChartController {

	@FXML
    private BarChart<String, Double> barChart;

    @FXML
    private CategoryAxis xAxisBar;
    
    @FXML
    private StackedBarChart<String, Double> stackedBarChart;

    @FXML
    private CategoryAxis xAxisStacked;
    
    // Lista con los países que se mostrarán en el eje X de ambos gráficos
    private ObservableList<String> paisesNames = FXCollections.observableArrayList();
       
	@FXML
	private void initialize() {
		// Se inicializa el listado de países que se añadirán en el eje X de cada gráfico
		String[] paises = new String[]{"Austria", "Brazil", "France", "Italy", "USA"};
		paisesNames = FXCollections.observableArrayList();              
		paisesNames.addAll(Arrays.asList(paises));
		
		// BarChart estándar
		// Se asignan los valores posibles del eje X
		xAxisBar.setCategories(paisesNames);

		// Se añaden las series al gráfico de tipo BarChart
		barChart.getData().add(initDatos1());
		barChart.getData().add(initDatos2());
		barChart.getData().add(initDatos3());

		// StackedBarChart estándar
		// Se asignan los valores posibles del eje X
		xAxisStacked.setCategories(paisesNames);
	
		// Se añaden las series al gráfico de tipo StackedBarChart
		stackedBarChart.getData().add(initDatos1());
		stackedBarChart.getData().add(initDatos2());
		stackedBarChart.getData().add(initDatos3());		
	}

	// Métodos que se encarga de inicializar las series con datos para los gráficos
	private XYChart.Series<String, Double> initDatos1() {
		XYChart.Series<String, Double> series1 = new XYChart.Series<String, Double>();
		
		series1.setName("2003");       
		series1.getData().add(new XYChart.Data<String, Double>("Austria", 25601.34));
		series1.getData().add(new XYChart.Data<String, Double>("Brazil", 20148.82));
		series1.getData().add(new XYChart.Data<String, Double>("France", 10000.0));
		series1.getData().add(new XYChart.Data<String, Double>("Italy", 35407.15));
		series1.getData().add(new XYChart.Data<String, Double>("USA", 12000.0));  
		
		return series1;
	}
		
	private XYChart.Series<String, Double> initDatos2() {
		XYChart.Series<String, Double> series2 = new XYChart.Series<String, Double>();
		
		series2.setName("2004");
		series2.getData().add(new XYChart.Data<String, Double>("Austria", 57401.85));
		series2.getData().add(new XYChart.Data<String, Double>("Brazil", 41941.19));
		series2.getData().add(new XYChart.Data<String, Double>("France", 45263.37));
		series2.getData().add(new XYChart.Data<String, Double>("Italy", 117320.16));
		series2.getData().add(new XYChart.Data<String, Double>("USA", 14845.27));  
		
		return series2;
	}
		
	private XYChart.Series<String, Double> initDatos3() {
		XYChart.Series<String, Double> series3 = new XYChart.Series<String, Double>();
		
		series3.setName("2005");
		series3.getData().add(new XYChart.Data<String, Double>("Austria", 45000.65));
		series3.getData().add(new XYChart.Data<String, Double>("Brazil", 44835.76));
		series3.getData().add(new XYChart.Data<String, Double>("France", 18722.18));
		series3.getData().add(new XYChart.Data<String, Double>("Italy", 17557.31));
		series3.getData().add(new XYChart.Data<String, Double>("USA", 92633.68));  
		
		return series3;
	}

}
