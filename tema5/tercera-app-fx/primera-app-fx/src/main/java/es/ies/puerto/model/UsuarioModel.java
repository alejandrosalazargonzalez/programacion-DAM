package es.ies.puerto.model;

import java.util.Objects;

<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioEntity.java

public class UsuarioEntity {
=======
/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class UsuarioModel {
<<<<<<< HEAD
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioModel.java
=======
>>>>>>> parent of df7c205 (avances 27/03)

    String email;
    String nombre;
    String contrasenia;

<<<<<<< HEAD
<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioEntity.java

    public UsuarioEntity() {
=======
    public UsuarioModel() {
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioModel.java
=======
    public UsuarioModel() {
>>>>>>> parent of df7c205 (avances 27/03)
    }

    public UsuarioModel(String email, String nombre, String contrasenia) {
        this.email = email;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

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
        if (!(o instanceof UsuarioModel)) {
            return false;
        }
<<<<<<< HEAD
<<<<<<< HEAD:tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioEntity.java
        UsuarioEntity usuarioModel = (UsuarioEntity) o;
        return Objects.equals(email, usuarioModel.email);
=======
=======
>>>>>>> parent of df7c205 (avances 27/03)
        UsuarioModel usuarioModel = (UsuarioModel) o;
        return Objects.equals(email, usuarioModel.email) && Objects.equals(nombre, usuarioModel.nombre)
                && Objects.equals(contrasenia, usuarioModel.contrasenia);
>>>>>>> parent of df7c205 (avances 27/03):tema5/tercera-app-fx/primera-app-fx/src/main/java/es/ies/puerto/model/UsuarioModel.java
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
