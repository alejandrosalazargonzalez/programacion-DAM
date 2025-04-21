package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.controller.abstractas.AbstractController;
import es.ies.puerto.model.UsuarioEntity;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController extends AbstractController {
    
    @FXML
    private TextField textFieldUsuario;
    
    @FXML
    private PasswordField textFieldPassword;

    @FXML
    private Text textFieldMensaje;

    @FXML
    private Button openRegistrarButton;

    @FXML
    private Text textUsuario;

    @FXML
    private Text textContrasenia;

    @FXML
    private ComboBox comboIdioma;

    @FXML
    public void initialize() {
        List<String> idiomas = new ArrayList<>();
        idiomas.add("es");
        idiomas.add("en");
        idiomas.add("fr");
        comboIdioma.getItems().addAll(idiomas);
    }

    @FXML
    protected void cambiarIdioma() {
        String path = "src/main/resources/idioma-"+comboIdioma.getValue().toString()+".properties";

        ConfigManager.ConfigProperties.setPath(path);

        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
    }

    @FXML
    protected void onLoginButtonClick() {

        if (textFieldUsuario== null || textFieldUsuario.getText().isEmpty() || 
            textFieldPassword == null || textFieldPassword.getText().isEmpty() ) {
                textFieldMensaje.setText("Credenciales null o vacias");
                return;
        }

        UsuarioEntity usuarioEntity = getUsuarioServiceModel().obtenerUsuarioPorEmail(textFieldUsuario.getText());

        if (usuarioEntity == null) {
            textFieldMensaje.setText("El usuario no existe");
            return;
        }

        if (!textFieldUsuario.getText().equals(usuarioEntity.getEmail())
         || !textFieldPassword.getText().equals(usuarioEntity.getContrasenia())) {
            textFieldMensaje.setText("Credenciales invalidas");
            return;
        } 

        textFieldMensaje.setText("Usuario validado correctamente");
    }

    @FXML
    protected void openRegistrarClick() {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            
//            RegistroController registroController = fxmlLoader.getController();
//            registroController.setpropertiesIdioma(this.getPropertiesIdioma());
            
//            registroController.postConstructor();

            Stage stage = (Stage) openRegistrarButton.getScene().getWindow();
            stage.setTitle("Pantalla Registro");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    }
    
}