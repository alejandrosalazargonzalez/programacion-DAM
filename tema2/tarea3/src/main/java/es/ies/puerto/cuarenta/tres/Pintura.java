package es.ies.puerto.cuarenta.tres;
import java.util.Objects;

/**
 * Crea una clase Galeria que almacene una lista (array)
 *  de pinturas (clase Pintura, con las propiedades: anio,
 *  artista, precio ). Implementa métodos para agregar,
 *  eliminar y listar pinturas. Usa toString() para
 *  describir la galería.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Pintura {
    private int anio;
    private String artista;
    private float precio;

    /**
     * Constructor vacio
     */
    public Pintura() {
    }

    /**
     * Constructor completo
     * @param anio
     * @param artista
     * @param precio
     */
    public Pintura(int anio, String artista, float precio) {
        this.anio = anio;
        this.artista = artista;
        this.precio = precio;
    }

    //Getters y Setters
    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pintura)) {
            return false;
        }
        Pintura pintura = (Pintura) o;
        return anio == pintura.anio && Objects.equals(artista, pintura.artista) && precio == pintura.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anio, artista, precio);
    }

    @Override
    public String toString() {
        return "{" +
            " anio='" + getAnio() + "'" +
            ", artista='" + getArtista() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
    
}
