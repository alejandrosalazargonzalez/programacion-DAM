package es.ies.puerto.treinta.cuatro;
import java.util.Objects;

/**
 * Crea una clase Restaurante con una lista (array)
 *  de platos (clase Plato). Implementa métodos
 *  para agregar y eliminar platos del menú y usar
 *  toString() para mostrar los detalles del
 *  restaurante.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Plato {
    private String  nombre;
    private int precio;


    public Plato() {
    }

    public Plato(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Plato)) {
            return false;
        }
        Plato plato = (Plato) o;
        return Objects.equals(nombre, plato.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
    
}
