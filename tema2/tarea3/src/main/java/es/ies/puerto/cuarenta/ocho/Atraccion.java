package es.ies.puerto.cuarenta.ocho;
import java.util.Objects;

/**
 * Crea una clase Parque con una lista (array) de
 *  atracciones (clase Atraccion, con las propiedades:
 * precio, nombre). Implementa métodos para agregar y
 *  eliminar atracciones, y usa toString() para describir
 *  el parque.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Atraccion {
    private float precio;
    private String nombre;

    /**
     * Constructor vacio
     */
    public Atraccion() {
    }

    /**
     * Constructor completo
     * @param precio
     * @param nombre
     */
    public Atraccion(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    //Getters y Setters
    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Atraccion)) {
            return false;
        }
        Atraccion atraccion = (Atraccion) o;
        return precio == atraccion.precio && Objects.equals(nombre, atraccion.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " precio='" + getPrecio() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
    
}
