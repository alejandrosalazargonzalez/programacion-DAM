
package es.ies.puerto.controller.abstractas;

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

    @FXML public ComboBox<String> comboIdioma;
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

    @FXML public Text nombreRegistroText;
    @FXML public TextField nombreRegistroTextField;
    @FXML public Text emailRegistrarText;
    @FXML public TextField emailRegistroTextField;
    @FXML public Text textContrasenia2;
    @FXML public TextField passwordRegistroTextField;
    @FXML public Text textMensaje;
    @FXML public Button buttonRegistrar;
    @FXML public Button registroToLoginButton;

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
     */ /* 
    public void cambiarIdiomaRegistrar(){
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textFieldUsuario.setPromptText(ConfigManager.ConfigProperties.getProperty("textFieldUsuario"));
        nombreRegistroText.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        nombreRegistroTextField.setPromptText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        emailRegistrarText.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        emailRegistroTextField.setPromptText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        passwordRegistroTextField.setPromptText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia2.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textMensaje.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        buttonRegistrar.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        registroToLoginButton.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
    } */

    /**
     * Cambia el idioma de los textos en la pantalla recuperar password
     */ /* 
    public void cambiarIdiomaRecuperarPassword(){
        emailText.setText(ConfigManager.ConfigProperties.getProperty("emailText"));
        introducirEmailField.setPromptText(ConfigManager.ConfigProperties.getProperty("introducirEmailField"));
        enviarPassword.setText(ConfigManager.ConfigProperties.getProperty("enviarPassword"));
        recuperarToLoginButton.setText(ConfigManager.ConfigProperties.getProperty("recuperarToLoginButton"));
    } */
}
