package es.ies.puerto.abstractas;

import java.util.Properties;

import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.model.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */

public abstract class AbstractController {
    static final String PATH_DB="src/main/resources/usuario.db";
    
    private UsuarioServiceModel usuarioServiceModel;

    private Properties propertiesIdioma;

    /**
     * crea el usuario service model con una base de datos
     */
    protected AbstractController(){
        try {
            usuarioServiceModel = new UsuarioServiceModel(PATH_DB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Log in
     */
    @FXML public ComboBox comboIdioma;
    @FXML public Text textUsuario;
    @FXML public TextField textFieldUsuario;
    @FXML public Text textContrasenia;
    @FXML public TextField textFieldContrasenia;


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
