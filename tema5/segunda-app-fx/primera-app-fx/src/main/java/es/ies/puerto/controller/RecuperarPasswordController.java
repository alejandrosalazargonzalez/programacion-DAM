package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class RecuperarPasswordController {
    
    @FXML TextField introducirEmailField;

    @FXML Button enviarPassword;
    @FXML Button recuperarToLoginButton;
    
    @FXML Text envioText;

    @FXML
    /**
     * comprueba que el campo del email no este vacio y cambia un texto 
     * dependiendo del resultado
     */
    protected void enviarPasswordOnClick (){
        if (introducirEmailField == null || introducirEmailField.getText().isEmpty()) {
            envioText.setText("Error al enviar, ¡El email no puede ser nulo ni estar vacio!");
            return;
        }
        envioText.setText("Password enviada");
    }     
    
    @FXML
    /**
     * cambia a la pantalla login
     */
    protected void recuperarToLoginOnClick(){
        try {
        Stage stage = (Stage) recuperarToLoginButton.getScene().getWindow();
        
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
