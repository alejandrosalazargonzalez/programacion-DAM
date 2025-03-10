package es.ies.puerto.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {
    
    private final String usuario = "pokemon";
    private final String password = "pokemon";

    @FXML
    private TextField textFieldUsuario;
    
    @FXML
    private PasswordField textFieldPassword;

    @FXML
    private Text textFieldMensaje;

    @FXML
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
}