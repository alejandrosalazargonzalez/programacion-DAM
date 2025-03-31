package es.ies.puerto.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.ies.puerto.model.abtrastas.Conexion;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */

public class UsuarioServiceModel extends Conexion {

    /**
     * Constructor vacio
     */
    public UsuarioServiceModel() {
    }

    /**
     * Constructor vacio
     *
     * @param unaRutaArchivoBD
     * @throws SQLException
     */
    public UsuarioServiceModel(String unaRutaArchivoBD) throws SQLException {
        super(unaRutaArchivoBD);
    }

    /**
     * Busca a un usuario en la base de datos por su email
     * 
     * @param email del usuario
     * @return UsuarioEntity
     */
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

    /**
     * Retorna todos los usuarios de la base de datos
     * 
     * @return ArrayList<UsuarioEntity>
     * @throws SQLException
     */
    public ArrayList<UsuarioEntity> obtenerUsarios() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        return obtenerUsuario(sql);
    }

    /**
     * Obtiene los usuarios segun la sentencia sql introducida
     *
     * @param sql a ejecutar
     * @return ArrayList<UsuarioEntity>
     * @throws SQLException
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

}
