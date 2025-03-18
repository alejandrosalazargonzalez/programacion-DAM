package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.controller.abstractas.AbstractController;
import es.ies.puerto.model.UsuarioService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class LoginController extends AbstractController{

    private final String usuario = "pokemon";
    private final String password = "pokemon";

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private PasswordField textFieldPassword;

    @FXML
    private Text textFieldMensaje;

    @FXML Button openButtonRegistrar;

    @FXML Button recuperarPasswordButton;

    @FXML 
    private Text textUsuario;
    @FXML
    private Text textContrasenia;

    @FXML
    private ComboBox comboIdioma;

    UsuarioService usuarioService;
    
    public LoginController() {
        System.out.println("first");
    }

    @FXML
    /**
     * inicializa usuario list y comboIdioma
     */
    public void initialize() {
        usuarioService = new UsuarioService();
        List<String> idiomas = new ArrayList<>(Arrays.asList("es","en","fr"));
        comboIdioma.getItems().addAll(idiomas);
        /**
         *comboIdioma.getItems().add("es");
         *comboIdioma.getItems().add("en");
         *comboIdioma.getItems().add("fr");
         */
    }

    @FXML
    /**
     * cambia el idioma del fichero
     */
    protected void cambiarIdioma(){
        setPropertiesIdioma(loadIdioma("idioma", comboIdioma.getValue().toString()));
        textUsuario.setText(getPropertiesIdioma().getProperty("textUsuario"));
        textContrasenia.setText(getPropertiesIdioma().getProperty("textContrasenia"));
    }

    @FXML
    /**
     * loguea al usuario
     */
    protected void onLoginButtonClick() {
        if (textFieldUsuario== null || textFieldUsuario.getText().isEmpty() ||
            textFieldPassword == null || textFieldPassword.getText().isEmpty() ) {
                textFieldMensaje.setText("Credenciales null o vacias");
                return;
        }
        if (usuarioService.buscarUsuarioUsuarioPassword(textFieldUsuario.getText(), textFieldPassword.getText()) == null) {
            textFieldMensaje.setText("Credenciales invalidas");
            return;
        }
        textFieldMensaje.setText("Usuario validado correctamente");
    }

    @FXML
    /**
     * cambia a la pantalla de registrar
     */
    protected void openRegistrarClick(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            
            RegistroController registroController = fxmlLoader.getController();
            registroController.setPropertiesIdioma(this.getPropertiesIdioma());
            
            Stage stage = (Stage) openButtonRegistrar.getScene().getWindow();
            stage.setTitle("Pantalla registro");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    /**
     * cambia a la panatalla de recuperarPassword
     */
    protected void recuperarPasswordClick(){
        try {
            Stage stage = (Stage) recuperarPasswordButton.getScene().getWindow();
            
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("recuperarPassword.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla recuperar password");
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}