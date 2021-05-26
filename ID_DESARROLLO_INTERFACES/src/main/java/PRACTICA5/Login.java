package PRACTICA5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Login {
	
	public Login() {}
	
	@FXML
	private Button button;
	
	@FXML
	private Label mensaje;
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	public void userLogin(ActionEvent event) throws IOException {
		
		checkLogin();
		
	}
	
	private void checkLogin() throws IOException {
		
		JavaFX JFX = new JavaFX();
		
		if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
			mensaje.setText("Correcto!");
			
			JFX.changeScene("Create.fxml");
			
		} else if (username.getText().isEmpty() && password.getText().isEmpty()) {
			mensaje.setText("Por favor, introduce datos.");
			
			
		} else {
			
			mensaje.setText("Usuario o contraseña incorrectos.");
			
		}
		
	}

}
