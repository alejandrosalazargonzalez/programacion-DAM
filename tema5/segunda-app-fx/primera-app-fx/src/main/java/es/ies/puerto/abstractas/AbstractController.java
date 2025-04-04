package es.ies.puerto.abstractas;

import es.ies.puerto.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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

    @FXML
    public Text textEmail;

    @FXML
    public Button buttonAtras;

    @FXML
    public Button buttonRecuperar;

    @FXML
    public Button openRegistrarButton;

    @FXML
    public Button buttonAceptar;

    @FXML
    public Text textMensajeEmail;

    @FXML
    public Text textFieldMensaje;

    @FXML
    public Text textContraseniaRepetir;

    @FXML
    public Text textContraseniaCreada;

    @FXML
    public Text textNombre;

    /**
     * cambia el idioma en el log in
     */
    public void cambiarIdiomaLogin() {
        try {
            textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
            textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
            buttonAceptar.setText(ConfigManager.ConfigProperties.getProperty("buttonAceptar"));
            openRegistrarButton.setText(ConfigManager.ConfigProperties.getProperty("openRegistrarButton"));
            buttonRecuperar.setText(ConfigManager.ConfigProperties.getProperty("buttonRecuperar"));
            textFieldMensaje.setText(ConfigManager.ConfigProperties.getProperty("textFieldMensaje"));
        } catch (Exception e) {
            System.err.println("Error al cambiar el idioma del login: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * cambia el idioma en la pantalla de recuperar contraseña
     */
    public void cambiarIdiomaRecuperarPassword() {
        try {
            textEmail.setText(ConfigManager.ConfigProperties.getProperty("textEmail"));
            buttonAtras.setText(ConfigManager.ConfigProperties.getProperty("buttonAtras"));
            buttonRecuperar.setText(ConfigManager.ConfigProperties.getProperty("buttonRecuperar"));
            textMensajeEmail.setText(ConfigManager.ConfigProperties.getProperty("textMensajeEmail"));
        } catch (Exception e) {
            System.err.println("Error al cambiar el idioma de recuperar contraseña: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * cambia el idioma en la pantalla de registro
     */
    public void cambiarIdiomaRegistro() {
        try {
            textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
            textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
            buttonAceptar.setText(ConfigManager.ConfigProperties.getProperty("buttonAceptar"));
            textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("buttonAceptar"));
            textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContraseniaCreada"));
            textEmail.setText(ConfigManager.ConfigProperties.getProperty("textEmail"));
            textMensajeEmail.setText(ConfigManager.ConfigProperties.getProperty("textMensajeEmail"));
        } catch (Exception e) {
            System.err.println("Error al cambiar el idioma de recuperar contraseña: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void cambiarIdiomaPerfil() {
        cambiarIdiomaLogin();
        cambiarIdiomaRecuperarPassword();
        textNombre.setText(ConfigManager.ConfigProperties.getProperty("textNombre"));
    }
}
