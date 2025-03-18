
package es.ies.puerto.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class UsuarioService {

    private ObjectMapper objectMapper;
    private String path = "src/main/resources/Usuarios.json";
    private File file;
    private List<Usuario> listUsuarios;

    public UsuarioService(){
        objectMapper = new ObjectMapper();
        file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        listUsuarios = leerUsuarios();
    }

    /**
     * Lee el archivo donde se guardan todos los usuarios
     * @return List<Usuario>
     */
    public List<Usuario> leerUsuarios() {
        List<Usuario> usuarioList = new ArrayList<>();
        try {
            usuarioList = objectMapper.readValue(file,
                new TypeReference<List<Usuario>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>(usuarioList);
    }

    /**
     * Escribe informacion en el fichero json
     * @param usuarios
     */
    public void escribirUsuarios(List<Usuario> usuarios) {
        try {
            objectMapper.writeValue(file, usuarios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Aniade un usuario al archivo
     * @param usuario usuario a aniadir
     * @return true/false
     */
    private boolean add(Usuario usuario) {
        if (usuario == null) {
            return false;
        }
        if (listUsuarios.contains(usuario)) {
            return false;
        }
        boolean insertar = listUsuarios.add(usuario);
        if (insertar) {
            escribirUsuarios(listUsuarios);
        }
        return insertar;
    }

    /**
     * crea un usuario y lo aniade si e sposible
     * @param usuario del usuario
     * @param password del usuario
     * @param nombre del usuario
     * @param email del usuario
     * @return true/false
     */
    public boolean aniadirUsuario(String usuario,  String password, String nombre, String email){
        if (usuario == null || usuario.isEmpty() || password == null || password.isEmpty() ||
            nombre == null || nombre.isEmpty() || email == null || email.isEmpty()) {
            return false;
        }
        Usuario usuarioAniadir = new Usuario(usuario, password, nombre, email);
        return add(usuarioAniadir);
    }

    /**
     * aniade un usuario
     * @param usuario
     * @return true/false
     */
    public boolean aniadirUsuario(Usuario usuario){
        if (usuario == null) {
            return false;
        }
        return add(usuario);
    }
    /**
     * busca a un usuario por si email
     * @param email del usuario
     * @return Usuario/null
     */
    public Usuario buscarUsuarioEmail(String email){
        if(email == null || email.isEmpty()){
            return null;
        }
        Usuario usuarioBuscar = new Usuario(email);
        int posicion = listUsuarios.indexOf(usuarioBuscar);
        if (posicion < 0) {
            return null;
        }
        return listUsuarios.get(posicion);
    }

    public Usuario buscarUsuarioUsuarioPassword(String usuario,String password){
        if(usuario == null || password.isEmpty()){
            return null;
        }
        Usuario usuarioBuscar = new Usuario(usuario,password);
        int posicion = listUsuarios.indexOf(usuarioBuscar);
        if (posicion < 0) {
            return null;
        }
        return listUsuarios.get(posicion);
    }
}
