
package es.ies.puerto.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author: alejandrosalazargonzalez
 * @version: 1.0.0
 */
public class UsuarioDto extends ConexionModel {

    public UsuarioDto() {
    }

    public UsuarioDto(String unaRutaArchivoBD) throws SQLException {
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

    public ArrayList<UsuarioModel> obtenerUsuario(String sql) throws SQLException {
        ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
        try {
            PreparedStatement sentencia = getConnection().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombreStr = resultado.getString("nombre");
                String contraseniaStr = resultado.getString("contrasenia");
                String emailStr = resultado.getString("email");
                UsuarioModel usuarioModel = new UsuarioModel(emailStr, nombreStr, contraseniaStr);
                usuarios.add(usuarioModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cerrar();
        }
        return usuarios;
    }

    public UsuarioModel obtenerUsuarioPorEmail(String email) throws SQLException {
        String sql = "SELECT * FROM Usuario " + "where email='" + email + "';";
        ArrayList<UsuarioModel> usuarios = obtenerUsuario(sql);
        if (usuarios.isEmpty()) {
            return null;
        }
        return usuarios.get(0);
    }

    public ArrayList<UsuarioModel> obtenerUsuarios() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        return obtenerUsuario(sql);
    }
}
