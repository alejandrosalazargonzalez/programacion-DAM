package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.controller.abstractas.AbstractController;
import es.ies.puerto.model.Usuario;
import es.ies.puerto.model.UsuarioService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class RegistroController extends AbstractController {

    @FXML TextField textFieldUsuario;
    @FXML TextField nombreRegistroTextField;
    @FXML TextField emailRegistroTextField;
    @FXML Text textMensaje;

    @FXML Text textUsuario;
    @FXML Text nombreRegistroUsuario;
    @FXML Text emailRegistrarText;
    @FXML Text textContrasenia;

    @FXML Button buttonRegistrar;
    @FXML Button registroToLoginButton;

    @FXML PasswordField passwordRegistroTextField;
    @FXML PasswordField repetirPasswordRegistroTextField;

    UsuarioService usuarioService;

    public RegistroController() {
        System.out.println("first");
    }

    @FXML
    public void initialize() {
        usuarioService = new UsuarioService();

        cambiarIdioma();
    }

    @FXML
    /**
     * registra el usuario
     */
    protected void onClicRegistrar(){
        if (passwordRegistroTextField == null || passwordRegistroTextField.getText().isEmpty()
            || repetirPasswordRegistroTextField == null || repetirPasswordRegistroTextField.getText().isEmpty()) {
            textMensaje.setText("¡El password no puede ser nulo ni estar vacio!");
            return;
        }
        if (!passwordRegistroTextField.getText().equals(repetirPasswordRegistroTextField.getText())) {
            textMensaje.setText("¡Las password tienen que ser iguales !");
            return;
        }
        if (textFieldUsuario == null || textFieldUsuario.getText().isEmpty()) {
            textMensaje.setText("¡El usuario no puede ser nulo ni estar vacio!");
            return;
        }
        if (nombreRegistroTextField == null || nombreRegistroTextField.getText().isEmpty()) {
            textMensaje.setText("¡El nombre no puede ser nulo ni estar vacio!");
            return;
        }
        if (emailRegistroTextField == null || emailRegistroTextField.getText().isEmpty()) {
            textMensaje.setText("¡El email no puede ser nulo ni estar vacio!");
            return;
        }

        textMensaje.setText("USUARIO REGISTRADO");
        usuarioService.aniadirUsuario(textFieldUsuario.getText(), passwordRegistroTextField.getText(),
            nombreRegistroTextField.getText(), emailRegistroTextField.getText());
    }

    @FXML
    /**
     * vuelve a la pagina de login
     */
    protected void registroToLoginOnClick(){
        try {
            Stage stage = (Stage) registroToLoginButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla inicio");
            stage.setScene(scene);
            stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}