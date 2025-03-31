package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.abstractas.AbstractController;
import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.model.OperacionesFile;
import es.ies.puerto.model.UsuarioServiceModel;
import es.ies.puerto.model.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class LoginController extends AbstractController{
    
    private final String pathFichero="src/main/resources/";
    private final String ficheroStr= "idioma-";

    private OperacionesFile operacionesFile;

    private UsuarioServiceModel user;

    /**
     * Funcion para setear el usuario
     * @param usuario a setear
     */
    public void setUsuario(UsuarioServiceModel usuario){
        this.user = usuario;
    }

    /**
     * Metodo para obtener el usuario
     * @return usuario buscado
     */
    public UsuarioServiceModel getUsuario(){
        return user;
    }


    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize(){
        operacionesFile = new OperacionesFile();
        List <String> listaIdiomas = new ArrayList<>(Arrays.asList("es","en","fr"));
        comboIdioma.getItems().addAll(listaIdiomas);
        cargarIdioma("es");
        cambiarIdiomaLogin();
        buttonIdiomaLogin();

        
    }

    /**
     * Funcion para seleccionar el idioma
     */
    @FXML
    protected void seleccionarIdiomaClick() {
        String idioma = comboIdioma.getValue().toString();
        cargarIdioma(idioma);
        cambiarIdiomaLogin();
        buttonIdiomaLogin();
    }

    /**
     * Funcion para cargar el idioma
     * @param idioma a cargar
     */
    private void cargarIdioma(String idioma) {
        String path = pathFichero+ficheroStr+idioma+".properties";
        ConfigManager.ConfigProperties.setPath(path);
    }

    /**
     * Funcion para pasar a la pantalla donde se muestra la informacion del usuario
     */
    @FXML
    protected void onLoginButtonClick() {

        if (textFieldUsuario== null || textFieldUsuario.getText().isEmpty() || 
            textFieldPassword == null || textFieldPassword.getText().isEmpty() ) {
                textFieldMensaje.setText("Credenciales null o vacias");
                return;
        }
        
        user = operacionesFile.findUsuario(textFieldUsuario.getText(), textFieldPassword.getText());

        if (user == null) {
            textFieldMensaje.setText("Credenciales invalidas");
            return;
        } 

        
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("perfil.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            
            PerfilUsuarioController perfilController = fxmlLoader.getController();
            perfilController.setUsuario(user);
    
            Stage stage = (Stage) ButtonAceptar.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
    /**
     * Funcion para pasar a la pantalla donde puede registrar un usuario
     */
    @FXML
    protected void openRegistrarClick() {
        try {
            
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            Stage stage = (Stage) buttonRegistrar.getScene().getWindow();
            stage.setTitle("Pantalla Registro");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Funcion para pasar a la pantalla un usuario puede recuperar la cuenta
     */
    @FXML
    protected void onRecoverButtonClick() {
        try {
            Stage stage = (Stage) buttonRegistrar.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("recuperarConstrasenia.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla Recuperar Contraseña");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}