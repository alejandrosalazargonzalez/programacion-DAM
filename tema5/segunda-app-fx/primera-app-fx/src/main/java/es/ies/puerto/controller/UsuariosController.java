
package es.ies.puerto.controller;

import java.sql.SQLException;
import java.util.List;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.model.Usuario;
import es.ies.puerto.model.UsuarioManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class UsuariosController {

    @FXML
    private Text textLista;
    @FXML
    private Button buttonInicio;

    private UsuarioManager usuarioManager;
    private List<Usuario> usuarios;
    private String usuariosString;

    /**
     * Constructor general.
     * @throws SQLException error controlado.
     */
    public UsuariosController() throws SQLException {
        this.usuarioManager = new UsuarioManager();
        this.usuarios = usuarioManager.obtenerUsuarios();
        mostrarUsuarios();
    }

    /**
     * Muestra todos los usuarios.
     */
    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuariosString += usuario.toString() ;
        }
        textLista.setText(usuariosString);
    }

    /**
     * Cambia a la pantalla de inicio.
     */
    public void buttonInicioClick() {
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