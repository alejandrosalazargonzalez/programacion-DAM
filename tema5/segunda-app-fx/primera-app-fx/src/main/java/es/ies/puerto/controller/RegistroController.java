package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegistroController extends AbstractController{
    
    @FXML TextField textFiledUsuario;

    @FXML Text textMensaje;

    @FXML Button buttonRegistrar;

    @FXML PasswordField textFieldPassword;

    @FXML PasswordField textFieldPasswordRepit;

    @FXML Button buttonAtras;

    @FXML TextField textFiledEmail;

    @FXML Text textMensajeEmail;

    @FXML TextField textFiledEmailRepetido;
    protected void onClickRegistar() {

        if (textFieldPassword == null ||  textFieldPassword.getText().isEmpty() 
            || textFieldPasswordRepit == null || textFieldPasswordRepit.getText().isEmpty()) {
            textMensaje.setText("¡El password no puede ser nulo o vacio!");
            return;
        }

        if (textFieldPassword.getText().equals(textFieldPasswordRepit.getText())) {
            textMensaje.setText("¡El password es correcto");
            return;
        }

        if (textFiledEmail == null ||  textFiledEmail.getText().isEmpty() 
        || textFiledEmailRepetido == null || textFiledEmailRepetido.getText().isEmpty()) {
        textMensajeEmail.setText("¡El email no puede ser nulo o vacio!");
        return;
        }

        if (textFiledEmail.getText().equals(textFiledEmailRepetido.getText())) {
            textMensajeEmail.setText("¡El email es correcto");
            return;
        }

        textMensaje.setText("Valores no validos");
    }

    @FXML
    protected void onButtonAtrasClick() {

        try {
            Stage stage = (Stage) buttonAtras.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla Registro");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize(){
        cambiarIdiomaRegistro();
    }
}
