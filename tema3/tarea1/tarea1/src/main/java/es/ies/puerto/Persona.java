package es.ies.puerto;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    /**
     * Constructor vacio
     */
    public Persona() {
    }

    /**
     * Constructor solo con solo el dni
     * @param dni
     */
    public Persona(String dni)
    {
        this.dni = dni;
    }

    /**
     * constructor completo
     * @param nombre
     * @param edad
     * @param dni
     */
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, dni);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", dni='" + getDni() + "'" +
            "}";
    }
    
}
