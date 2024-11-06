package es.ies.puerto.cuarenta.nueve;
import java.util.Objects;

/**
 * Crea una clase Escuela que almacene una lista (array)
 *  de profesores. Implementa métodos para agregar y
 *  eliminar profesores, y usa toString() para describir
 *  la escuela.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Profesor {
    private String nombre;
    private String asignatura;

    /**
     * Constructor vacio
     */
    public Profesor() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param asignatura
     */
    public Profesor(String nombre, String asignatura) {
        this.nombre = nombre;
        this.asignatura = asignatura;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Profesor asignatura(String asignatura) {
        setAsignatura(asignatura);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return Objects.equals(nombre, profesor.nombre) && Objects.equals(asignatura, profesor.asignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, asignatura);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", asignatura='" + getAsignatura() + "'" +
            "}";
    }
    
}
