package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.abstractas.AbstractController;
import es.ies.puerto.model.UsuarioEntity;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class PerfilUsuarioController extends AbstractController{
    @FXML
    private TextField textFieldUser;

    @FXML
    private TextField textFieldPasswordUser;

    @FXML
    private TextField textFieldNombre2;
    
    @FXML
    private TextField textFieldEmail3;

    @FXML
    private Button buttonVolverAtras;

    UsuarioEntity usuarioModel;

    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    public void initialize(){
        cambiarIdiomaPerfil();
        usuarioModel = new UsuarioEntity();
    }


    /**
     * Funcion para indicar de que usuario se cargan los datos
     * @param usuario a cargar los datos
     */
    public void setUsuario(UsuarioEntity usuario){
        this.usuarioModel = usuario;
        cargarDatos();
    }

    /**
     * Funcion para cargar los datos del usuario
     */
    private void cargarDatos(){
        if (usuarioModel != null ) {
            textFieldUser.setText(usuarioModel.getNombreUsuario());
            textFieldPasswordUser.setText(usuarioModel.getPassword());
            textFieldNombre2.setText(usuarioModel.getNombre());
            textFieldEmail3.setText(usuarioModel.getEmail());
        }
    }

    /**
     * Funcion para volver a la pagina anterior
     */
    @FXML
    protected void onClickVolver(){
        try {
            Stage stage = (Stage) buttonVolverAtras.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla Usuario");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}