package es.ies.puerto.model;

/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.model.abstractas.Conexion;

public class UsuarioManager extends Conexion {

    private DatabaseManager databaseManager;
    
    public UsuarioManager(String unaRutaArchivoBD) throws SQLException {
        super(unaRutaArchivoBD);
    }

    /**
     * Constructor general.
     * 
     * @throws SQLException Si ocurre un error al conectar con la base de datos.
     */
    public UsuarioManager() throws SQLException {
        this.databaseManager = new DatabaseManager();
    }

    /**
     * Crea un nuevo usuario.
     * 
     * @param usuario usuario a crear.
     * @return retorna true si el usuario fue creado.
     */
    public boolean crearUsuario(Usuario usuario) {
        if (usuario == null || usuario.getEMail() == null || usuario.getEMail().isBlank()) {
            return false;
        }
        String sql = "INSERT INTO Usuario (nick, contrasenia, nombre, email) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pStatement = databaseManager.conectar().prepareStatement(sql);
            pStatement.setString(1, usuario.getNick());
            pStatement.setString(2, usuario.getContrasenia());
            pStatement.setString(3, usuario.getNombre());
            pStatement.setString(4, usuario.getEMail());
            int rowsAffected = pStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Inicio de sesion.
     * 
     * @param nick        nick del usuario a iniciarse.
     * @param contrasenia contrasenia del usuario a iniciarse.
     * @return retorna el usuario si este existe.
     */
    public Usuario inicio(String nick, String contrasenia) {
        if (nick == null || nick.isBlank() || contrasenia == null || contrasenia.isBlank()) {
            return null;
        }
        String sql = "SELECT * FROM Usuario WHERE nick = ? AND contrasenia = ?";
        try (PreparedStatement pStatement = databaseManager.conectar().prepareStatement(sql)) {
            pStatement.setString(1, nick);
            pStatement.setString(2, contrasenia);
            try (ResultSet rSet = pStatement.executeQuery()) {
                if (rSet.next()) {
                    String nombre = rSet.getString("nombre");
                    String email = rSet.getString("email");
                    return new Usuario(nick, contrasenia, nombre, email);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Busca un email en la base de datos.
     * 
     * @param email email a buscar.
     * @return retorna true si encontro el email.
     */
    public boolean buscarEmail(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        String sql = "SELECT COUNT(*) FROM Usuario WHERE email = ?";
        try (PreparedStatement pStatement = databaseManager.conectar().prepareStatement(sql)) {
            pStatement.setString(1, email);
            try (ResultSet rSet = pStatement.executeQuery()) {
                if (rSet.next()) {
                    int count = rSet.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Obtiene todos los usuarios.
     * 
     * @return retorna todos los usuarios.
     * @throws SQLException error controlado.
     */
    public List<Usuario> obtenerUsuarios() throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM Usuario";
        try (PreparedStatement sentencia = databaseManager.conectar().prepareStatement(sql);
                ResultSet resultSet = sentencia.executeQuery()) {
            while (resultSet.next()) {
                String nick = resultSet.getString("nick");
                String contrasenia = resultSet.getString("contrasenia");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                Usuario usuario = new Usuario(nick, contrasenia, nombre, email);
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }

}