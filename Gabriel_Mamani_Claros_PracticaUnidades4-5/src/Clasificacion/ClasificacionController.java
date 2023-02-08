package Clasificacion;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;


public class ClasificacionController {

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> list1;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Clasificacion> table1;
    
    @FXML
    private TableColumn<Clasificacion, String> nombreEquipoCol;
    
    @FXML
    private TableColumn<Clasificacion, Integer> partidosJugadosCol;
    
    @FXML
    private TableColumn<Clasificacion, Integer> partidosVencidosCol;

    @FXML
    private TableColumn<Clasificacion, Integer> partidosEmpatadosCol;
    
    @FXML
    private TableColumn<Clasificacion, Integer> partidosPerdidosCol;
    
    @FXML
    private TableColumn<Clasificacion, Integer> totalPuntosCol;
    
    @FXML
    private TreeView<String> tree1;
    
     // Lista auxiliar para TableView
    private ObservableList<Clasificacion> data = FXCollections.observableArrayList(
    	    new Clasificacion("Real Madrid", 11, 10, 1, 0, 31),
    	    new Clasificacion("Barcelona", 11, 19, 1, 1, 28),
    	    new Clasificacion("Atletico de Madrid", 11, 7, 2, 2, 23),
    	    new Clasificacion("Real Sociedad", 11, 7, 1, 3, 22),
    	    new Clasificacion("Betis", 11, 7, 2, 3, 20),
    	    new Clasificacion("Atletic", 11, 5, 3, 3, 18),
    	    new Clasificacion("Villareal", 11, 5, 3, 3, 18),
    	    new Clasificacion("Osasuna", 11, 5, 2, 4, 17),
    	    new Clasificacion("Valencia", 11, 4, 3, 4, 15),
    	    new Clasificacion("Rayo Vallecano", 11, 4, 3, 4, 15)
    	);

    @FXML
    private void initialize() {  
        // Asociamos cada columna del TableView a una propiedad de la clase Clasificacion 
    	nombreEquipoCol.setCellValueFactory(new PropertyValueFactory<Clasificacion,String>("nombreEquipo"));
    	partidosJugadosCol.setCellValueFactory(new PropertyValueFactory<Clasificacion,Integer>("partidosJugados"));
    	partidosVencidosCol.setCellValueFactory(new PropertyValueFactory<Clasificacion,Integer>("partidosVencidos"));
    	partidosEmpatadosCol.setCellValueFactory(new PropertyValueFactory<Clasificacion,Integer>("partidosEmpatados"));
    	partidosPerdidosCol.setCellValueFactory(new PropertyValueFactory<Clasificacion,Integer>("partidosPerdidos"));
    	totalPuntosCol.setCellValueFactory(new PropertyValueFactory<Clasificacion,Integer>("totalPuntos"));
        // Se rellena la tabla con objetos de la clase Clasificacion
        table1.setItems(data);     
    
    }
    
}
