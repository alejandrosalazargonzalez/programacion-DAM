package es.ies.puerto.treinta.uno;
import java.util.Objects;

/**
 * Crea una clase Pelicula con atributos titulo,
 *  director, y duracion. Implementa métodos
 *  para comparar películas por duración con
 *  equals() y usar toString() para mostrar detalles.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Pelicula {
    private String titulo;
    private String director;
    private float duracion;

    /**
     * Constructor vacio
     */
    public Pelicula() {
    }

    /**
     * Constructor completo
     * @param titulo
     * @param director
     * @param duracion
     */
    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    //Getters Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return this.duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    /**
     * Metodo equals modificado
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pelicula)) {
            return false;
        }
        Pelicula pelicula = (Pelicula) o;
        return duracion == pelicula.duracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director, duracion);
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", director='" + getDirector() + "'" +
            ", duracion='" + getDuracion() + "'" +
            "}";
    }
    
}
