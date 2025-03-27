
package es.ies.puerto.controller.abstractas;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import org.controlsfx.control.textfield.TextFields;

import es.ies.puerto.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class AbstractController {

    @FXML
    public Text textUsuario;

    @FXML
    public Text textContrasenia;

    @FXML public ComboBox comboIdioma;
    @FXML public TextField textFieldUsuario;
    @FXML public TextField textFieldPassword;
    @FXML public Text textFieldMensaje;
    @FXML public Button openButtonRegistrar;
    @FXML public Button recuperarPasswordButton;
    @FXML public Button aceptarLoginButton;
    @FXML public Text emailText;
    @FXML public TextField introducirEmailField;
    @FXML public Button enviarPassword;
    @FXML public Button recuperarToLoginButton;


    /**
     * cambia el idioma de los textos en la pantalla log in
     */
    public void cambiarIdiomaLogIn(){
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
        comboIdioma.setPromptText(ConfigManager.ConfigProperties.getProperty("comboIdioma"));
        textFieldUsuario.setPromptText(ConfigManager.ConfigProperties.getProperty("textFieldUsuario"));
        textFieldPassword.setPromptText(ConfigManager.ConfigProperties.getProperty("textFieldPassword"));
        textFieldMensaje.setText(ConfigManager.ConfigProperties.getProperty("textFieldMensaje"));
        openButtonRegistrar.setText(ConfigManager.ConfigProperties.getProperty("openButtonRegistrar"));
        recuperarPasswordButton.setText(ConfigManager.ConfigProperties.getProperty("recuperarPasswordButton"));
    }

    /**
     * Cambia el idioma de los textos en la pantalla registrar
     */
    public void cambiarIdiomaRegistrar(){
        emailText.setText(ConfigManager.ConfigProperties.getProperty("emailText"));
        introducirEmailField.setPromptText(ConfigManager.ConfigProperties.getProperty("introducirEmailField"));
        enviarPassword.setText(ConfigManager.ConfigProperties.getProperty("enviarPassword"));
        recuperarToLoginButton.setText(ConfigManager.ConfigProperties.getProperty("recuperarToLoginButton"));
    }

    /**
     * Cambia el idioma de los textos en la pantalla recuperar password
     */
    public void cambiarIdiomaRecuperarPassword(){

    }
}
