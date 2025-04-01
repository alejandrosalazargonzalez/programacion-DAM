package es.ies.puerto.controller;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.model.UsuarioManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class RecuperarController {

    @FXML
    private TextField textFieldIngresarEmail;
    @FXML
    private Button buttonEnviar;
    @FXML
    private Text textText;
    @FXML
    private Button buttonInicio;

    UsuarioManager usuarioManager;

    /**
     * Constructor general.
     */
    public RecuperarController() throws SQLException {
        this.usuarioManager = new UsuarioManager();
    }

    /**
     * Ejecuta el envio
     */
    @FXML
    protected void buttonEnviarClick() {
        if (textFieldIngresarEmail == null || textFieldIngresarEmail.getText().isBlank()) {
            textText.setText("¡El Email no puede ser nulo o vacio!");
            return;
        }

        if (!validarEmail(textFieldIngresarEmail.getText())) {
            textText.setText("El correo electrónico no es válido");
            return;
        }

        if (!usuarioManager.buscarEmail(textFieldIngresarEmail.getText())) {
            textText.setText("El correo electrónico no esta registrado.");
            return;
        }
        textText.setText("¡Mensaje enviado!, revisa el email");
    }

    /**
     * Valida el formato del email.
     * 
     * @param email El email a validar.
     * @return true si el formato es válido, false en caso contrario.
     */
    private boolean validarEmail(String email) {
        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Cambia a la pantalla principal.
     */
    @FXML
    protected void buttonInicioClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("inicio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 250, 400);
            Stage stage = (Stage) buttonInicio.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
