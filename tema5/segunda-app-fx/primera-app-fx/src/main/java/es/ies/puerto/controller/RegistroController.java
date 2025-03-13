
package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class RegistroController {
    
    @FXML TextField textFieldUsuario;
    @FXML Text textMensaje;

    @FXML Button buttonRegistrar;
    @FXML Button registroToLoginButton;

    @FXML PasswordField password;
    @FXML PasswordField repetirPassword;

    @FXML
    /**
     * registra el usuario
     */
    protected void onClicRegistrar(){
        if (password == null || password.getText().isEmpty() || repetirPassword == null || repetirPassword.getText().isEmpty()) {
            textMensaje.setText("¡El password no puede ser nulo ni estar vacio!");
            return;
        }
        if (!password.getText().equals(repetirPassword.getText())) {
            textMensaje.setText("¡Las password tienen que ser iguales !");
            return;
        }
        textMensaje.setText("USUARIO REGISTRADO");
    }     

    @FXML
    protected void registroToLoginOnClick(){
        try {
            Stage stage = (Stage) registroToLoginButton.getScene().getWindow();
            
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla inicio");
            stage.setScene(scene);
            stage.show();
            
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}