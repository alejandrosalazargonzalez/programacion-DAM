package es.ies.puerto;

/**
 * Clase persona
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni; 

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    /**
     * Constructor con todos los atributos
     * @param nombre de la persona
     * @param edad de la persona
     * @param dni de la persona
     */
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    /**
     * Constructor con solo el DNI
     * @param dni de la persona
     */
    public Persona(String dni) {
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // toString
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return dni.equals(persona.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }
}
