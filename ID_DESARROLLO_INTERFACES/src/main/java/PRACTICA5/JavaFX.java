package PRACTICA5;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFX extends Application {

	private static Stage stage;

	public void start(Stage primeraStage) throws Exception {

		stage = primeraStage;
		primeraStage.setResizable(false);
		Parent root = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
		primeraStage.setTitle("Pantalla Login");
		primeraStage.setScene(new Scene(root, 650, 500));
		primeraStage.show();

	}
	
	public void changeScene(String fxml) throws IOException {
		
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stage.getScene().setRoot(pane);
		
	}
	

	public static void main(String[] args) { launch(args); }

	
}
