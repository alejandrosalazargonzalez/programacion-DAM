
package es.ies.puerto.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author: alejandrosalazargonzalez
 * @version: 1.0.0
 */
public class UsuarioServiceModel extends ConexionModel {

    public UsuarioServiceModel() {
    }

    public UsuarioServiceModel(String unaRutaArchivoBD) throws SQLException {
        super(unaRutaArchivoBD);
    }

    /*
     * public ArrayList<UsuarioModel> obtenerUsuarios() throws SQLException {
     * ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
     * try {
     * PreparedStatement sentencia =
     * getConnection().prepareStatement("SELECT * FROM Perros");
     * ResultSet resultado = sentencia.executeQuery();
     * 
     * while (resultado.next()) {
     * String nombreStr = resultado.getString("nombre");
     * String contraseniaStr = resultado.getString("contrasenia");
     * String emailStr = resultado.getString("email");
     * UsuarioModel usuarioModel = new UsuarioModel(emailStr, nombreStr,
     * contraseniaStr);
     * usuarios.add(usuarioModel);
     * }
     * } catch (Exception e) {
     * e.printStackTrace();
     * } finally {
     * cerrar();
     * }
     * return usuarios;
     * }
     */

    public ArrayList<UsuarioEntity> obtenerUsuario(String sql) throws SQLException {
        ArrayList<UsuarioEntity> usuarios = new ArrayList<>();
        try {
            PreparedStatement sentencia = getConnection().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombreStr = resultado.getString("nombre");
                String contraseniaStr = resultado.getString("contrasenia");
                String emailStr = resultado.getString("email");
                UsuarioEntity usuarioModel = new UsuarioEntity(emailStr, nombreStr, contraseniaStr);
                usuarios.add(usuarioModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cerrar();
        }
        return usuarios;
    }

    public UsuarioEntity obtenerUsuarioPorEmail(String email) throws SQLException {
        String sql = "SELECT * FROM Usuario " + "where email='" + email + "';";
        ArrayList<UsuarioEntity> usuarios = obtenerUsuario(sql);
        if (usuarios.isEmpty()) {
            return null;
        }
        return usuarios.get(0);
    }

    public ArrayList<UsuarioEntity> obtenerUsuarios() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        return obtenerUsuario(sql);
    }
}
