
package es.ies.puerto.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class RegistroController {
    
    @FXML TextField textFieldUsuario;
    @FXML Text textMensaje;

    @FXML Button buttonRegistrar;

    @FXML PasswordField password;
    @FXML PasswordField repetirPassword;

    @FXML
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

}