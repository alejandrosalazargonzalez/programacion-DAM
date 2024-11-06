package es.ies.puerto.seis;
import java.util.Objects;

/**
 * Crea una clase Estudiante con atributos
 *  privados nombre, matricula y calificacion.
 *  Proporciona getters y setters para acceder
 *  a estos valores y un método toString() para
 *  mostrar la información.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Estudiante {
    private String nombre;
    private String matricula;
    private float calificacion;

    /**
     * Constructor vacio
     */
    public Estudiante() {
    }

    /**
     * Construtor completo
     * @param nombre del alumno
     * @param matricula del alumno
     * @param calificacion del alumno
     */
    public Estudiante(String nombre, String matricula, float calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    //getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estudiante)) {
            return false;
        }
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(nombre, estudiante.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, matricula, calificacion);
    }
    

    /**
     * Metodo toString que muestra la informacion de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", calificacion='" + getCalificacion() + "'" +
            "}";
    }

}
