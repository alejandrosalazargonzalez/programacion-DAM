package es.ies.puerto.model;

import java.util.Objects;


/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */

public class UsuarioEntity {

    String email;
    String nombre;
    String contrasenia;

    /**
     * Constructor vacio
     */
    public UsuarioEntity() {
    }

    /**
     * constructor completo
     * @param email del usuario
     * @param nombre del usuario
     * @param contrasenia del usuario
     */
    public UsuarioEntity(String email, String nombre, String contrasenia) {
        this.email = email;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    /*getter y setters */
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioEntity)) {
            return false;
        }
        UsuarioEntity usuarioModel = (UsuarioEntity) o;
        return Objects.equals(email, usuarioModel.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", contrasenia='" + getContrasenia() + "'" +
            "}";
    }


}
