<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> parent of df7c205 (avances 27/03)
=======

>>>>>>> parent of df7c205 (avances 27/03)
package es.ies.puerto.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioServiceModel.java
import es.ies.puerto.model.abtrastas.Conexion;

public class UsuarioServiceModel extends Conexion {
=======
=======
>>>>>>> parent of df7c205 (avances 27/03)
=======
>>>>>>> parent of df7c205 (avances 27/03)
/**
 * @author: alejandrosalazargonzalez
 * @version: 1.0.0
 */
public class UsuarioDto extends ConexionModel {
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioDto.java
=======
>>>>>>> parent of df7c205 (avances 27/03)
=======
>>>>>>> parent of df7c205 (avances 27/03)

    public UsuarioDto() {
    }

    public UsuarioDto(String unaRutaArchivoBD) throws SQLException {
        super(unaRutaArchivoBD);
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public UsuarioEntity obtenerUsuarioPorEmail(String email) {
        try {
            String sql = "SELECT * FROM Usuario " + "where email='"+email+"'";
        ArrayList<UsuarioEntity> usuarios = obtenerUsuario(sql);
        if (usuarios.isEmpty()) {
            return null;
        }
        return usuarios.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }


    public ArrayList<UsuarioEntity> obtenerUsaarios() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        return obtenerUsuario(sql);
    }

<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioServiceModel.java
    public ArrayList<UsuarioEntity> obtenerUsuario(String sql) throws SQLException {
        ArrayList<UsuarioEntity> usuarios = new ArrayList<UsuarioEntity>();
=======
    public ArrayList<UsuarioModel> obtenerUsuario(String sql) throws SQLException {
        ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioDto.java
=======
=======
>>>>>>> parent of df7c205 (avances 27/03)
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
<<<<<<< HEAD
>>>>>>> parent of df7c205 (avances 27/03)
=======
>>>>>>> parent of df7c205 (avances 27/03)
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

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioServiceModel.java
=======
=======
>>>>>>> parent of df7c205 (avances 27/03)
=======
>>>>>>> parent of df7c205 (avances 27/03)
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
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioDto.java
=======
>>>>>>> parent of df7c205 (avances 27/03)
=======
>>>>>>> parent of df7c205 (avances 27/03)
}
