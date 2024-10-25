package es.ies.puerto.dos;
import java.util.Objects;

public class Productos {
    private String id;
    private String nombre;
    private float precio;
    private int cantidad;
    
    /**
     * Constructor por defecto
     */
    public Productos() {
    }

    /**
     * Constructor general
     * @param id del producto
     * @param nombre del producto
     * @param precio del producto
     * @param cantidad del producto
     */
    public Productos(String id, String nombre, float precio, int cantidad) {
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
        if (!(o instanceof Productos)) {
            return false;
        }
        Productos productos = (Productos) o;
        return this.id.equals(productos.id);
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
