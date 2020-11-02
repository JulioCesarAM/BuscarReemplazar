package dad.BYC.app;

import dad.BYC.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

	Controller controller=new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene escena = new Scene(controller.getView(), 530, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.getIcons().add(new Image("/images/mrPops.png"));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
