package es.ies.puerto.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.abstractas.AbstractController;
import es.ies.puerto.model.OperacionesFile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class RegistroController extends AbstractController{

    @FXML 
    private TextField textFieldUsuario;
    
    @FXML 
    private Text textMensaje;
    
    @FXML 
    private PasswordField textFieldPassword;
   
    @FXML 
    private PasswordField textFieldPassword2;
    
    @FXML 
    private TextField textFieldNombre;
   
    @FXML 
    private TextField textFieldEmail;
   
    @FXML 
    private TextField textFieldEmail2;

    OperacionesFile operacionesFile;


    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    public void initialize(){
        cambiarIdiomaRegistro();
    }

    /**
     * Cosntructor vacio
     */
    public RegistroController(){
        operacionesFile = new OperacionesFile();
    }

    /**
     * Funcion para registrar un usuario
     */
    @FXML
    protected void onClickRegistrar() {
        if (textFieldUsuario == null || textFieldUsuario.getText().isEmpty()) {
            textMensaje.setText("¡El nombre de usuario no puede ser nulo o vacio!");
            return;
        }

        if (operacionesFile.verificarUsuario(textFieldUsuario.getText())) {
            textMensaje.setText("El usuario ya esta registrado.");
            return;
        }

        if (textFieldPassword == null || textFieldPassword.getText().isEmpty()|| textFieldPassword2 == null || textFieldPassword2.getText().isEmpty()) {
            textMensaje.setText("¡El password no puede ser nulo o vacio!");
            return;
        }

        if (textFieldNombre == null || textFieldNombre.getText().isEmpty()) {
            textMensaje.setText("¡El nombre no puede ser nulo o vacio!");
            return;
        }

        if (textFieldEmail == null || textFieldEmail.getText().isEmpty()|| textFieldEmail2 == null || textFieldEmail2.getText().isEmpty()) {
            textMensaje.setText("¡El email no puede ser nulo o vacio!");
            return;
        }

        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(textFieldEmail.getText());

        if (!m.matches()) {
            textMensaje.setText("El correo electrónico no es válido.");
            return;
        }

        if (operacionesFile.verificarEmail(textFieldEmail2.getText())) {
            textMensaje.setText("El email ya esta registrado.");
            return;
        }

        if (!textFieldPassword.getText().equals(textFieldPassword2.getText())) {
            textMensaje.setText("¡La passwords no son iguales!");
            return;
        }

        boolean registro = operacionesFile.add(textFieldUsuario.getText(), textFieldPassword.getText(), textFieldNombre.getText(), textFieldEmail.getText());
        if (registro == false) {
            textMensaje.setText("Ya hay una cuenta con ese usuario e email");
        } else{
            textMensaje.setText("¡Usuario registrado!");
        }
    }

    /**
     * Funcion para volver a la pagina anterior
     */
    @FXML
    protected void volverAtrasClick(){
        try {
            Stage stage = (Stage) buttonVolverAtras.getScene().getWindow();
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
