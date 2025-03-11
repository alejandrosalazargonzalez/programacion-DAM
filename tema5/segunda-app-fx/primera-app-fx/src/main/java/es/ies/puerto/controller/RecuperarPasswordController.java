
package es.ies.puerto.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class RecuperarPasswordController {
    
    @FXML TextField introducirEmailField;
    @FXML Button enviarPassword;
    @FXML Text envioText;

    @FXML
    protected void enviarPasswordOnClick (){
        if (introducirEmailField == null || introducirEmailField.getText().isEmpty()) {
            envioText.setText("Error al enviar, ¡El email no puede ser nulo ni estar vacio!");
            return;
        }

        envioText.setText("Password enviada");
    }     
    
}
