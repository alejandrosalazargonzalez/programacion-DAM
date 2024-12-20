package es.ies.puerto.dos;
import java.util.Objects;

/**
 * Crea una clase Producto con los atributos
 *  id, nombre y precio, y cantidad. Implementa
 *  el método equals() para comparar dos productos
 *  según su nombre y precio, y también toString()
 *  para mostrar su información
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Producto {
    private String id;
    private String nombre;
    private float precio;
    private int cantidad;
    
    /**
     * Constructor por defecto
     */
    public Producto() {
    }

    /**
     * Constructor general
     * @param id del producto
     * @param nombre del producto
     * @param precio del producto
     * @param cantidad del producto
     */
    public Producto(String id, String nombre, float precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //Getters y Setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return this.id.equals(producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, cantidad);
    }
    

    /**
     * Muestra la información de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            "}";
    }


}
