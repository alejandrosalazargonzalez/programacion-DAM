package es.ies.puerto.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.model.abtrastas.Conexion;
/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class UsuarioServiceModel extends Conexion{
    Set<UsuarioEntity> usuarioModels;
    
    
    /**
     * Constructor vacio
     */
    public UsuarioServiceModel(){
        super();
        usuarioModels = new HashSet<>(obtenerTodosLosUsuarios());
    }

    /**
     * Funcion que obtiene una lista de usuario de la base de datos 
     * usando una sentencia sql
     * @param sql Sentencia sql a utilizar
     * @return lista de Usuarios
     */
    public ArrayList<UsuarioEntity> obtenerListaUsuarios(String sql){
        ArrayList<UsuarioEntity> usuarios = new ArrayList<UsuarioEntity>();
        try {
            PreparedStatement sentencia = getconnection().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
    
            while (resultado.next()){
                String nombreUsuarioStr = resultado.getString("nombreUsuario");
                String contraseniaStr = resultado.getString("contrasenia");
                String nombreStr = resultado.getString("nombre");
                String emailStr = resultado.getString("email");
                UsuarioEntity usuario = new UsuarioEntity(nombreUsuarioStr,contraseniaStr,nombreStr,emailStr);
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            cerrar();
        }
        return usuarios;
    }

    public ArrayList<UsuarioEntity> obtenerTodosLosUsuarios(){
        String sql = "Select * from usuario ";
        return obtenerListaUsuarios(sql);
    }
    /**
     * Funcion que devuelve el usuario por el nombre de usuario y contraseña
     * @param nombreUsuario a buscar
     * @param contrasenia a buscar
     * @return usuario buscado
     */
    public UsuarioEntity obtenerUsuarioPorNombreUsuario(String nombreUsuario, String contrasenia){
        String sql = "Select * from usuario " + "where nombreUsuario ='" + nombreUsuario +
                    "' and contrasenia = '" + contrasenia + "'";
        ArrayList<UsuarioEntity> usuarios = obtenerListaUsuarios(sql);
        if (usuarios.isEmpty()) {
            return null;
        }
        return usuarios.get(0);
    }

    /**
     * Funcion que te devuelve el usuario por el email y la contrasenia
     * @param email a buscar
     * @param contrasenia a buscar
     * @return usuario buscado
     */
    public UsuarioEntity obtenerUsuarioPorEmail(String email,String contrasenia){
        String sql = "Select * from usuario " + "where email='" + email + "' and contrasenia = '" + contrasenia + "'";
        ArrayList<UsuarioEntity> usuarios = obtenerListaUsuarios(sql);
        if (usuarios.isEmpty()) {
            return null;
        }
        return usuarios.get(0);
    }

    /**
     * Funcion que agrega un usuario a la base de datos
     * @param usuario a agregar
     */
    public void agregarUsuario(UsuarioEntity usuario){
        agregarUsuario(usuario.getNombreUsuario(), usuario.getPassword(), usuario.getNombre(), usuario.getEmail());
    }


    /**
     * Funcion que agrega un usuario sabiendo sus propiedades a la base de datos
     * @param nombreUsuario a agregar
     * @param contrasenia a agregar
     * @param nombre a agregar
     * @param email a agregar
     */
    public boolean agregarUsuario(String nombreUsuario,String contrasenia,String nombre, String email){
        try {
            PreparedStatement sentencia = getconnection().prepareStatement("INSERT INTO usuario "+
                "(nombreUsuario, contrasenia, nombre, email) values (?,?,?,?)");
            sentencia.setString(1, nombreUsuario);
            sentencia.setString(2, contrasenia);
            sentencia.setString(3, nombre);
            sentencia.setString(4, email);
            sentencia.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            cerrar();
        }
    }

    /**
     * Funcion que elimina un usuario de la base de datos
     * @param usuario a eliminar
     * @return true/false
     */
    public boolean eliminarUsuario(UsuarioEntity usuario){
        if (usuario == null) {
            return false;
        }
        String sql = "Delete from Usuario where email = '" + usuario.getEmail() + "'";
        ArrayList<UsuarioEntity> usuarios = obtenerListaUsuarios(sql);
        if (!usuarios.contains(usuario)) {
            return false;
        }
        try {
            PreparedStatement sentencia = getconnection().prepareStatement(sql);
            sentencia.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            cerrar();
        }
    }

    /**
     * Funcion para actualizar los datos de un usuario
     * @param usuario a actualizar
     * @return true/false
     */
    public boolean actualizarUsuario(UsuarioEntity usuario){
        if (!eliminarUsuario(usuario)) {
            return false;
        }
        agregarUsuario(usuario);
        return true;
    }
    /**
     * Funcion que verifica si existe el usuario en los ficheros
     * @param nombreUsuario a verificar
     * @return true/false
     */
    public boolean verificarUsuario(String nombreUsuario){
        for (UsuarioEntity usuarioModelBuscar : usuarioModels) {
            if (usuarioModelBuscar.getNombreUsuario().equals(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Funcion que verifica si existe el emai asi en los ficheros
     * @param email a verificar
     * @return true/false
     */
    public boolean verificarEmail(String email){
        for (UsuarioEntity usuarioModelBuscar : usuarioModels) {
            if (usuarioModelBuscar.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}