package es.ies.puerto.abstractas;

import es.ies.puerto.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

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

    public void cambiarIdioma() {

        // Login
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
    }

    public void cambiarIdiomaLogin() {
        try {
            if (textUsuario != null) {
                textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
            }
            if (textContrasenia != null) {
                textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
            }
            if (buttonAceptar != null) {
                buttonAceptar.setText(ConfigManager.ConfigProperties.getProperty("buttonAceptar"));
            }
            if (openRegistrarButton != null) {
                openRegistrarButton.setText(ConfigManager.ConfigProperties.getProperty("openRegistrarButton"));
            }
            if (buttonRecuperar != null) {
                buttonRecuperar.setText(ConfigManager.ConfigProperties.getProperty("buttonRecuperar"));
            }
            if (textFieldMensaje != null) {
                textFieldMensaje.setText(ConfigManager.ConfigProperties.getProperty("textFieldMensaje"));
            }
        } catch (Exception e) {
            System.err.println("Error al cambiar el idioma del login: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Método específico para cambiar el idioma de la pantalla de recuperar
     * contraseña
     */
    public void cambiarIdiomaRecuperarPassword() {
        try {
            if (textEmail != null) {
                textEmail.setText(ConfigManager.ConfigProperties.getProperty("textEmail"));
            }
            if (buttonAtras != null) {
                buttonAtras.setText(ConfigManager.ConfigProperties.getProperty("buttonAtras"));
            }
            if (buttonRecuperar != null) {
                buttonRecuperar.setText(ConfigManager.ConfigProperties.getProperty("buttonRecuperar"));
            }
            if (textMensajeEmail != null) {
                textMensajeEmail.setText(ConfigManager.ConfigProperties.getProperty("textMensajeEmail"));
            }
        } catch (Exception e) {
            System.err.println("Error al cambiar el idioma de recuperar contraseña: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Método específico para cambiar el idioma de la pantalla de registro
     */
    public void cambiarIdiomaRegistro() {
        try {
            if (textUsuario != null) {
                textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
            }
            if (textContrasenia != null) {
                textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
            }
            if (buttonAceptar != null) {
                buttonAceptar.setText(ConfigManager.ConfigProperties.getProperty("buttonAceptar"));
            }
            if (textContraseniaRepetir != null) {
                textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("buttonAceptar"));
            }
            if (textContraseniaCreada != null) {
                textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContraseniaCreada"));
            }
            if (textEmail != null) {
                textEmail.setText(ConfigManager.ConfigProperties.getProperty("textEmail"));
            }
            if (textMensajeEmail != null) {
                textMensajeEmail.setText(ConfigManager.ConfigProperties.getProperty("textMensajeEmail"));
            }
        } catch (Exception e) {
            System.err.println("Error al cambiar el idioma de recuperar contraseña: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
