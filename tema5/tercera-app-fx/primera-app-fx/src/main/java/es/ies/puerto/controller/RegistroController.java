package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.controller.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegistroController extends AbstractController {
    
    @FXML TextField textFiledUsuario;

    @FXML Text textMensaje;

    @FXML Button buttonRegistrar;

    @FXML PasswordField textFieldPassword;

    @FXML PasswordField textFieldPasswordRepit;


    @FXML
    private Text textUsuario;

    @FXML
    private Text textContrasenia;

    @FXML
    public void initialize() {
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
    }

    /**
    public void postConstructor() {
        textUsuario.setText(getPropertiesIdioma().getProperty("textUsuario"));
        textContrasenia.setText(getPropertiesIdioma().getProperty("textContrasenia"));
    }
    **/

    @FXML
    protected void onClickRegistar()  {

        if (textFieldPassword == null ||  textFieldPassword.getText().isEmpty() 
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
