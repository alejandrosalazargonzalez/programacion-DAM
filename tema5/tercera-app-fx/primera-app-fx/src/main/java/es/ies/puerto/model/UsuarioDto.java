package es.ies.puerto.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioServiceModel.java
import es.ies.puerto.model.abtrastas.Conexion;

public class UsuarioServiceModel extends Conexion {
=======
/**
 * @author: alejandrosalazargonzalez
 * @version: 1.0.0
 */
public class UsuarioDto extends ConexionModel {
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioDto.java

    public UsuarioDto() {
    }

    public UsuarioDto(String unaRutaArchivoBD) throws SQLException {
        super(unaRutaArchivoBD);
    }

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

<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioServiceModel.java
=======
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
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioDto.java
}
