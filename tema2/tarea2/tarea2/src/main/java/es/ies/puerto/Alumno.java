package es.ies.puerto;

/**
 * Ejercicio 13
 *  Crea una clase Alumno con los atributos nombre y nota.
 *  Implementa un método que determine si el alumno
 *  ha aprobado (nota >= 6).
 * 
 * Ejercicio 14
 * Modifica la clase Alumno para que la nota no pueda 
 *  ser mayor a 10 ni menor a 0 en el setter.
 * @author alejandrosalazargonzalez
 * @version 1.1.0
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
        setNota(nota);
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

    //metodo que comprueba si el alumno está aprobado
    public boolean aprobado()
    {
        if (nota < 6.0f) {
            return false;
        } else
        {
            return true;
        }
    }

    public String mensajeError()
    {
        return "Asegúrate de que la nota no pueda ser mayor que 10 ni menor que 0.";
    }

    @Override
    public String toString() {
        if (nota > 0f && nota < 10f) {
            return "{" +
                " nombre del Alumno='" + getNombre() + "'" +
                ", nota='" + getNota() + "'" +
                " Está aprovado=" + aprobado() +
                "}";
        } else
        {
            return "{" +
                " nombre del Alumno='" + getNombre() + "'" +
                ", nota='" + getNota() + "'" +
                " Está aprovado=" + aprobado() +
                " " + mensajeError() +
                "}";
        }
    }

}
