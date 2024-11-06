package es.ies.puerto.cincuenta;
import java.util.Objects;

/**
 * Crea una clase Hospital que tenga listas de
 *  médicos y pacientes. Implementa métodos para
 *  agregar, eliminar y listar médicos y pacientes,
 *  y usa toString() para mostrar los detalles del
 *  hospital.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Medico {
    private String nombre;
    private String specialidad;

    /**
     * Constructor vacio
     */
    public Medico() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param specialidad
     */
    public Medico(String nombre, String specialidad) {
        this.nombre = nombre;
        this.specialidad = specialidad;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSpecialidad() {
        return this.specialidad;
    }

    public void setSpecialidad(String specialidad) {
        this.specialidad = specialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return Objects.equals(nombre, medico.nombre) && Objects.equals(specialidad, medico.specialidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, specialidad);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", specialidad='" + getSpecialidad() + "'" +
            "}";
    }

    
}
