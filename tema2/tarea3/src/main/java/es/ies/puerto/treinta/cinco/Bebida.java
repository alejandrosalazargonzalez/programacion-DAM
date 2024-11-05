package es.ies.puerto.treinta.cinco;
import java.util.Objects;

/**
 * Crea una clase Bebida con atributos nombre,
 *  precio y tamaño. Implementa métodos para 
 *  comparar bebidas por su tamaño con equals()
 *  y usar toString() para mostrar detalles.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Bebida {
    private String nombre;
    private float precio;
    private float tamanio;

    /**
     * Constructor vacio
     */
    public Bebida() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param precio
     * @param tamanio
     */
    public Bebida(String nombre, float precio, float tamanio) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bebida)) {
            return false;
        }
        Bebida bebida = (Bebida) o;
        return tamanio == bebida.tamanio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, tamanio);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", tamanio='" + getTamanio() + "'" +
            "}";
    }
    
}
