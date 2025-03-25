package es.ies.puerto.controller;

import es.ies.puerto.abstractas.AbstractController;
import es.ies.puerto.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegistroController extends AbstractController {


    @FXML
    TextField textFiledUsuario;

    @FXML
    Text textMensaje;

    @FXML
    Button buttonRegistrar;

    @FXML
    PasswordField textFieldPassword;

    @FXML
    PasswordField textFieldPasswordRepit;

    @FXML
    public void initialize() {
        cambiarIdioma();
    }


    @FXML
    protected void onClickRegistar() {

        if (textFieldPassword == null || textFieldPassword.getText().isEmpty()
                || textFieldPasswordRepit == null || textFieldPasswordRepit.getText().isEmpty()) {
            textMensaje.setText("¡El password no puede ser nulo o vacio!");
            return;
        }

        if (textFieldPassword.getText().equals(textFieldPasswordRepit.getText())) {
            textMensaje.setText("¡El password es correcto");
            return;
        }

        textMensaje.setText("Valores no validos");
    }
}
