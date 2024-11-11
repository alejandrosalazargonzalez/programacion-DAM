package es.ies.puerto;
import java.util.Objects;

/**
 * Crea una clase Persona con los siguientes atributos:
 *
 *   nombre (String)
 *   edad (int)
 *   dni (String)
 *
 * Define los métodos necesarios:
 *
 *   Constructor que permita inicializar todos los atributos.
 *   Método esMayorDeEdad que devuelva true si la persona es mayor de edad (edad >= 18) y false en caso contrario.
 *
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
     * Constructor dni
     * @param dni
     */
    public Persona(String dni)
    {
        this.dni = dni;
    }
    /**
     * Constructor completo
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

    /**
     * Metodo que comprueba si la persona es mayor de edad
     * @return true/false
     */
    public boolean esMayorDeEdad()
    {
        return getEdad() >= 18;
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
        String mensaje = "{";
        mensaje += " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", dni='" + getDni() + "'" +
            ", es mayor de edad='" + esMayorDeEdad() +"'" +
            "}";
        return mensaje;
    }


}
