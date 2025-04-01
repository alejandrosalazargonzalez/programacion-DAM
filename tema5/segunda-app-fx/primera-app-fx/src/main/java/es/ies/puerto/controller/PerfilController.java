package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class PerfilController {

    @FXML
    private Text textUsuario;
    @FXML
    private Text textContrasenia;
    @FXML
    private Text textNombre;
    @FXML
    private Text textEmail;
    @FXML
    private Button buttonInicio;

    private Usuario usuario;

    /**
     * Recibe los datos del Usuario desde el Inicio
     * 
     * @param usuario usuario validado.
     */
    public void setUsuario(Usuario usuario) {
        if (usuario == null) {
            return;
        }
        this.usuario = usuario;
        cargarDatos();
    }

    /**
     * Carga datos
     */
    private void cargarDatos() {
        if (usuario != null) {
            textUsuario.setText(usuario.getNick());
            textContrasenia.setText(usuario.getContrasenia());
            textNombre.setText(usuario.getNombre());
            textEmail.setText(usuario.getEMail());
        }
    }

    /**
     * Cambia a la pantalla principal.
     */
    @FXML
    protected void buttonInicioClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("inicio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 250, 400);
            Stage stage = (Stage) buttonInicio.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}