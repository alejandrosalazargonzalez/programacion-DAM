package es.ies.puerto.abstractas;

import es.ies.puerto.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class AbstractControler {
    
    //log in
    @FXML public Text textUsuario;
    @FXML public Text textContrasenia;

    public void cambiarIdiomaLogIn(){
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
    }

}
