package es.ies.puerto.uno;

public class Persona {
    private String nombre;   
    private int edad;       
    private String genero;

    /**
     * Constructor por defecto
     */
    public Persona() {}

    /**
     * Constructor general
     * @param nombre de la persona
     * @param edad de la persona
     * @param genero de la persona
     */
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    /**
     * Muestra la informacion de la persona
     */
    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Género='" + genero + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan Pérez", 28, "Masculino");
        System.out.println(persona.toString()); // Muestra: Persona{Nombre='Juan Pérez', Edad=28, Género='Masculino'}
    }
}
