package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class LoginController {
	@FXML
	private	TextField		ID;
	@FXML
	private	PasswordField	password;
	@FXML
	private Button			btnLogin;
	
	public void Login(ActionEvent event) throws Exception {
		if(ID.getText().equals("user") && password.getText().equals("pass")){
			showMainPage();
        }else{
            System.out.println("Login Failed");
        }
	}
	public void keyPressHandler(KeyEvent event) throws Exception {
		if(event.getCode() == KeyCode.ENTER) {
			Login(new ActionEvent());
		}
	}
	
	private void showMainPage() throws IOException {
		System.out.println("Login Success");
        Stage primaryStage = (Stage)btnLogin.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
	}
}
