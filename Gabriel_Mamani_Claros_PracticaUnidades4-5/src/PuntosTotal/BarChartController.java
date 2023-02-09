package PuntosTotal;

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
    
    // Lista con los pa�ses que se mostrar�n en el eje X de ambos gr�ficos
    private ObservableList<String> paisesNames = FXCollections.observableArrayList();
       
	@FXML
	private void initialize() {
		// Se inicializa el listado de pa�ses que se a�adir�n en el eje X de cada gr�fico
		String[] paises = new String[]{"RealMadrid", "Barcelona", "Valencia", "RealBetis", "Almeria"};
		paisesNames = FXCollections.observableArrayList();              
		paisesNames.addAll(Arrays.asList(paises));
	
		xAxisBar.setCategories(paisesNames);


		barChart.getData().add(initDatos1());
		barChart.getData().add(initDatos2());
		barChart.getData().add(initDatos3());

	
		xAxisStacked.setCategories(paisesNames);
	

		stackedBarChart.getData().add(initDatos1());
		stackedBarChart.getData().add(initDatos2());
		stackedBarChart.getData().add(initDatos3());		
	}

	// M�todos que se encarga de inicializar las series con datos para los gr�ficos
	/**
	 * 
	 * @return serie1
	 */
	private XYChart.Series<String, Double> initDatos1() {
		XYChart.Series<String, Double> series1 = new XYChart.Series<String, Double>();
		
		series1.setName("2003");       
		series1.getData().add(new XYChart.Data<String, Double>("RealMadrid", 56001.34));
		series1.getData().add(new XYChart.Data<String, Double>("Barcelona", 21048.82));
		series1.getData().add(new XYChart.Data<String, Double>("Valencia", 70000.0));
		series1.getData().add(new XYChart.Data<String, Double>("RealBetis", 34007.15));
		series1.getData().add(new XYChart.Data<String, Double>("Almeria", 10000.0));  
		
		return series1;
	}
	/**
	 * 
	 * @return series 2
	 */
	private XYChart.Series<String, Double> initDatos2() {
		XYChart.Series<String, Double> series2 = new XYChart.Series<String, Double>();
		
		series2.setName("2004");
		series2.getData().add(new XYChart.Data<String, Double>("RealMadrid", 94001.85));
		series2.getData().add(new XYChart.Data<String, Double>("Barcelona", 70011.19));
		series2.getData().add(new XYChart.Data<String, Double>("Valencia", 60603.37));
		series2.getData().add(new XYChart.Data<String, Double>("RealBetis", 30020.16));
		series2.getData().add(new XYChart.Data<String, Double>("Almeria", 20450.27));  
		
		return series2;
	}
	
	/**
	 * 
	 * @return serie3
	 */
	private XYChart.Series<String, Double> initDatos3() {
		XYChart.Series<String, Double> series3 = new XYChart.Series<String, Double>();
		
		series3.setName("2005");
		series3.getData().add(new XYChart.Data<String, Double>("RealMadrid", 10000.65));
		series3.getData().add(new XYChart.Data<String, Double>("Barcelona", 88305.76));
		series3.getData().add(new XYChart.Data<String, Double>("Valencia", 70202.18));
		series3.getData().add(new XYChart.Data<String, Double>("RealBetis", 50557.31));
		series3.getData().add(new XYChart.Data<String, Double>("Almeria", 40203.68));  
		
		return series3;
	}

}
