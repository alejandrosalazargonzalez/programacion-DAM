package es.ies.puerto.abstractas;

import es.ies.puerto.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class AbstractController {

    @FXML
    public Text textUsuario;

    @FXML
    public Text textContrasenia;

    @FXML
    public Text textContrasenia2;
    @FXML
    public Text textNombre;
    @FXML
    public Text textEmail;
    @FXML
    public Text textEmail2;

    @FXML
    public ComboBox comboIdioma;

    @FXML
    public TextField textFieldUsuario;
    
    @FXML
    public PasswordField textFieldPassword;

    @FXML
    public Button ButtonAceptar;

    @FXML
    public Button RecoverPassWordButton;

    @FXML
    public Text textFieldMensaje;

    @FXML
    public Button buttonRegistrar;

    @FXML 
    public Button buttonVolverAtras;

    /**
     * Funcion para cambiar el idioma del recuperar
     */
    public void cambiarIdiomaRecuperar(){
        textEmail.setText(ConfigManager.ConfigProperties.getProperty("textEmail"));
        buttonVolverAtras.setText(ConfigManager.ConfigProperties.getProperty("buttonVolverAtras"));
    }
    /**
     * Funcion para cambiar el idioma del login
     */
    public void cambiarIdiomaLogin() {
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
            
    }

    /**
     * Funcion para cambiar el idioma del perfil
     */
    public void cambiarIdiomaPerfil() {
        cambiarIdiomaLogin();
        cambiarIdiomaRecuperar();
        textNombre.setText(ConfigManager.ConfigProperties.getProperty("textNombre"));
    }

    /**
     * Funcion para cambiar el idioma del registro
     */
    public void cambiarIdiomaRegistro(){
        cambiarIdiomaPerfil();
        textContrasenia2.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia2"));
        textEmail2.setText(ConfigManager.ConfigProperties.getProperty("textEmail2"));
        buttonRegistrar.setText(ConfigManager.ConfigProperties.getProperty("buttonRegistrar"));
    }  

    /**
     * Funcion para cambiar el idioma de los botones del login
     */
    public void buttonIdiomaLogin(){
        comboIdioma.setPromptText(ConfigManager.ConfigProperties.getProperty("comboIdioma"));
        buttonRegistrar.setText(ConfigManager.ConfigProperties.getProperty("buttonRegistrar"));
        RecoverPassWordButton.setText(ConfigManager.ConfigProperties.getProperty("RecoverPassWordButton"));
        ButtonAceptar.setText(ConfigManager.ConfigProperties.getProperty("ButtonAceptar"));
    }

}