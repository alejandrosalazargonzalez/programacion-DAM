
package es.ies.puerto.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class RegistroController {
    
    @FXML TextField textFieldUsuario;
    @FXML Text textMensaje;

    @FXML Button buttonRegistrar;

    @FXML
    protected void onClicRegistrar(){
        textMensaje.setText("USUARIO REGISTRADO");
    }                                                                         
}