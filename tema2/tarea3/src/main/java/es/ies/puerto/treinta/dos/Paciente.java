package es.ies.puerto.treinta.dos;
import java.util.Objects;

/**
 * Crea una clase Hospital que almacene una lista 
 * (array) de pacientes (clase Paciente). Implementa
 *  métodos para agregar, eliminar y listar pacientes.
 *  Usa toString() para describir el hospital.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Paciente {
    private String nombre;
    private String dni;
    private String enfermedad;

    /**
     * Constructor vacio
     */
    public Paciente() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param dni
     * @param enfermedad
     */
    public Paciente(String nombre, String dni, String enfermedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.enfermedad = enfermedad;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEnfermedad() {
        return this.enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     * Metodo equaks modificado
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Paciente)) {
            return false;
        }
        Paciente paciente = (Paciente) o;
        return  Objects.equals(dni, paciente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, enfermedad);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", dni='" + getDni() + "'" +
            ", enfermedad='" + getEnfermedad() + "'" +
            "}";
    }
    

}
