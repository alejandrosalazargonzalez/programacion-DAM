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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * @author nexphernandez
 * @version 1.0.0
 */

public class RecuperarContraseniaController  extends AbstractController{
    
    @FXML 
    private TextField textFieldEmailRecover;
    
    @FXML 
    private Text textFieldMensajeRecover;


    OperacionesFile operacionesFile;

    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    public void initialize(){
        cambiarIdiomaRecuperar();

    }

    /**
     * Constructor vacio
     */
    public RecuperarContraseniaController(){
        operacionesFile = new OperacionesFile();
    }

    /**
     * Funcion para recuperar la contraseña
     */
    @FXML
    protected void onRecoverButtonClick(){
        if (textFieldEmailRecover == null || textFieldEmailRecover.getText().isEmpty()) {
            textFieldMensajeRecover.setText("¡El Email no puede ser nulo o vacio!");
            return;
        }

        if (!operacionesFile.verificarEmail(textFieldEmailRecover.getText())) {
            textFieldMensajeRecover.setText("El correo electrónico no es válido o no esta registrado.");
            return;
        }

        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(textFieldEmailRecover.getText());

        if (!m.matches()) {
            textFieldMensajeRecover.setText("El correo electrónico no es válido.");
            return;
        }

        textFieldMensajeRecover.setText("¡Mensaje enviado!, revisa el email");
    }

    /**
     * Funcion para volver a la pagina anterior
     */
    @FXML
    protected void atrasClick(){
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
