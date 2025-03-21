package es.ies.puerto.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("¡Bienvenidos al mundo de la programación!");
    }
}