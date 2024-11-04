package es.ies.puerto.treinta.cero;
import java.util.Objects;

public class Cancion {
    private String titulo;
    private String artista;
    private float duracion;

    /**
     * Constructor vacio
     */
    public Cancion() {
    }

    /**
     * Constructor completo
     * @param titulo
     * @param artista
     * @param duracion
     */
    public Cancion(String titulo, String artista, float duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    //Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public float getDuracion() {
        return this.duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cancion)) {
            return false;
        }
        Cancion cancion = (Cancion) o;
        return Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista) && duracion == cancion.duracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, duracion);
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", artista='" + getArtista() + "'" +
            ", duracion='" + getDuracion() + "'" +
            "}";
    }
    
}
