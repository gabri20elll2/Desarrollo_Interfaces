package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainPrincipal extends Application {
	
	private GridPane rootLayout1;	//InicioSesion
	private BorderPane rootLayout2; //PantallaPrincipal
	private Stage primaryStage;
	 
	@Override
	public void start(Stage primaryStage) { 
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Pagina principal");
		IniciarSesionPantalla();
		
	}
	
	//PAGINA INICIO SESION
	public void IniciarSesionPantalla() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainPrincipal.class.getResource("IniciarSesion.fxml"));
			rootLayout1 = (GridPane) loader.load();
			
			MainPrincipalController controller =  loader.getController();
			controller.setMain(this);
			
			Scene scene = new Scene(rootLayout1);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			scene.setOnMouseClicked(
			        new EventHandler<MouseEvent>() {

			            @Override
			            public void handle(MouseEvent event) {
			           System.out.println(event.getPickResult());
			            }
			          });
			primaryStage.setTitle("Iniciar sesión");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//PAGINA PRINCIAL 
	public void  PaginaPrincipal() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainPrincipal.class.getResource("Menu.fxml"));
			rootLayout2 = (BorderPane) loader.load();
			
			MainPrincipalController controller = loader.getController();
			controller.setRootLayout(rootLayout2);
			
			
			Scene scene = new Scene(rootLayout2);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Página principal");
			stage.show();
			
			//
			stage.setOnCloseRequest(e-> PaginaPrincipal());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
	
	public BorderPane getRootLayout() {
		return rootLayout2;
	}


	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout2 = rootLayout;
	}
	
	
		public static void main(String[] args) {
			launch(args);
		}
	
}
