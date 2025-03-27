package es.ies.puerto.abstractas;

import java.util.Properties;

import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.model.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public abstract class AbstractController {
    static final String PATH_DB="src/main/resources/usuario.db";
    
    private UsuarioServiceModel usuarioServiceModel; 

    private Properties propertiesIdioma;


    protected AbstractController(){
        try {
            usuarioServiceModel = new UsuarioServiceModel(PATH_DB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public Text textUsuario;

    @FXML
    public Text textContrasenia;

    public void cambiarIdioma() {
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
    }

    public UsuarioServiceModel getUsuarioServiceModel(){
        return this.usuarioServiceModel;
    }

    public Properties getPropertiesIdioma(){
        return this.propertiesIdioma;
    }
}
