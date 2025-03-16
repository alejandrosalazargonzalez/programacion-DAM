package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class LoginController {

    private final String usuario = "pokemon";
    private final String password = "pokemon";

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private PasswordField textFieldPassword;

    @FXML
    private Text textFieldMensaje;

    @FXML Button openButtonRegistrar;

    @FXML Button recuperarPasswordButton;

    @FXML
    /**
     * loguea al usuario
     */
    protected void onLoginButtonClick() {
        if (textFieldUsuario== null || textFieldUsuario.getText().isEmpty() ||
            textFieldPassword == null || textFieldPassword.getText().isEmpty() ) {
                textFieldMensaje.setText("Credenciales null o vacias");
                return;
        }

        if (!textFieldUsuario.getText().equals(usuario) || !textFieldPassword.getText().equals(password)) {
            textFieldMensaje.setText("Credenciales invalidas");
            return;
        }

        textFieldMensaje.setText("Usuario validado correctamente");
    }

    @FXML
    /**
     * cambia a la pantalla de registrar
     */
    protected void openRegistrarClick(){
        try {
            Stage stage = (Stage) openButtonRegistrar.getScene().getWindow();
            
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla registro");
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        
    @FXML
    /**
     * cambia a la panatalla de recuperarPassword
     */
    protected void recuperarPasswordClick(){
        try {
            Stage stage = (Stage) recuperarPasswordButton.getScene().getWindow();
            
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("recuperarPassword.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla recuperar password");
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}