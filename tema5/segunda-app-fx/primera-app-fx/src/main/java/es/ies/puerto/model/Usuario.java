package es.ies.puerto.model;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class Usuario {
    
    @JsonProperty("nombreUsuario")
    private String nombreUsuario;
    @JsonProperty("password")
    private String password;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("email")
    private String email;

    /**
     * constructor vacio
     */
    public Usuario() {
    }

    public Usuario(String email){
        this.email = email;
    }

    /**
     * constructor completo
     * @param nombreUsuario del usuario
     * @param password del usuario
     * @param nombre del usuario
     * @param email del usuario
     */
    public Usuario(String nombreUsuario, String password, String nombre, String email) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.nombre = nombre;
        this.email = email;
    }

    //getters
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public String getPassword() {
        return this.password;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getEmail() {
        return this.email;
    }

    //Setters
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Usuario: " + getNombreUsuario() + ", " +
            "password: " + getPassword() + ", " +
            "nombre: " + getNombre() + ", " +
            "email: " + getEmail();
    }
    
}
