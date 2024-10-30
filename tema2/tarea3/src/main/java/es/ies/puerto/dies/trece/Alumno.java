package es.ies.puerto.dies.trece;
import java.util.Objects;

/**
 * Crea una clase Alumno con los atributos nombre,
 *  notaMatematicas, notaCiencias y notaProgramacion.
 *  Implementa un método promedio() y usa equals()
 *  para comparar alumnos por sus notas.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Alumno {
    private String nombre;
    private float notaMatematicas;
    private float notaCiencias;
    private float notaProgramacion;

    /**
     * Constructor vacio
     */
    public Alumno() {
    }

    /**
     * Constructor completo
     * @param nombre del alumno
     * @param notaMatematicas del alumno
     * @param notaCiencias del alumno
     * @param notaProgramacion del alumno
     */
    public Alumno(String nombre, float notaMatematicas, float notaCiencias, float notaProgramacion) {
        this.nombre = nombre;
        this.notaMatematicas = notaMatematicas;
        this.notaCiencias = notaCiencias;
        this.notaProgramacion = notaProgramacion;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotaMatematicas() {
        return this.notaMatematicas;
    }

    public void setNotaMatematicas(float notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public float getNotaCiencias() {
        return this.notaCiencias;
    }

    public void setNotaCiencias(float notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public float getNotaProgramacion() {
        return this.notaProgramacion;
    }

    public void setNotaProgramacion(float notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    /**
     * Metodo que calcula el promedio de la nota
     * @return float del promedio
     */
    public float promedio()
    {
        return ( notaCiencias + notaMatematicas + notaProgramacion ) / 3;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alumno)) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return notaMatematicas == alumno.notaMatematicas && notaCiencias == alumno.notaCiencias && notaProgramacion == alumno.notaProgramacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, notaMatematicas, notaCiencias, notaProgramacion);
    }
    

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", notaMatematicas='" + getNotaMatematicas() + "'" +
            ", notaCiencias='" + getNotaCiencias() + "'" +
            ", notaProgramacion='" + getNotaProgramacion() + "'" +
            "}";
    }


}
