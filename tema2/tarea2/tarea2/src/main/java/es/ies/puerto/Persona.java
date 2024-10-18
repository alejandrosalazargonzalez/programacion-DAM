package es.ies.puerto;

public class Persona {

    String nombre;
    int edad;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    /**
     * Constructor del nombre de la persona
     * @param nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor con todos los atributos
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    /**
     * Metodo que no forma parte de la tarea, solo es un ejemplo.
     * Metodo que muestra la informacion de la persona
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

}
