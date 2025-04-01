package es.ies.puerto.abstractas;

import java.util.Properties;

import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.model.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public abstract class AbstractController {
    static final String PATH_DB="src/main/resources/usuario.db";
    
    private UsuarioManager usuarioManager;

    private Properties propertiesIdioma;

    /**
     * crea el usuario service model con una base de datos
     */
    protected AbstractController(){
        try {
            usuarioManager = new UsuarioManager(PATH_DB);
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

    public UsuarioManager getUsuarioManager(){
        return this.usuarioManager;
    }

    public Properties getPropertiesIdioma(){
        return this.propertiesIdioma;
    }
}
