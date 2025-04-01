package es.ies.puerto.model;

import java.util.Objects;

/**
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Usuario {

    private String nick;
    private String contrasenia;
    private String nombre;
    private String email;

    /**
     * Constructor vacio.
     */
    public Usuario() {
    }

    /**
     * Constructor general.
     * 
     * @param nick        nick del usuario
     * @param contrasenia contrasenia del usuario
     * @param nombre      nombre del usuario
     * @param email       email del usuario
     */
    public Usuario(String nick, String contrasenia, String nombre, String email) {
        this.nick = nick;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNick() {
        return this.nick;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEMail() {
        return this.email;
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
        return "Nick: " + getNick() + ", Contraseña: " + getContrasenia() +
                ", Nombre: " + getNombre() + ", EMail: " + getEMail();
    }

}
