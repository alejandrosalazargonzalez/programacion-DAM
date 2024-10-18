package es.ies.puerto;

/**
 * Ejercicio 13
 *  Crea una clase Alumno con los atributos nombre y nota. Implementa un método que determine si el alumno ha aprobado (nota >= 6).
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Alumno {
    
    private String nombre;
    private float nota;

    /**
     * Constructor vacio
     */
    public Alumno() {
    }

    /**
     * Constructor con el nombre
     * @param nombre del alumno
     */
    public Alumno( String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor con el nombre y la nota
     * @param nombre del alumno
     * @param nota del alumno
     */
    public Alumno(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean aprobado()
    {
        if (nota < 4.9f) {
            return false;
        } else
        {
            return true;
        }
    }

}
