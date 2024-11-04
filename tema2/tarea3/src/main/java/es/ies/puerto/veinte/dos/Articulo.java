package es.ies.puerto.veinte.dos;
import java.util.Objects;

/**
 * Crea una clase Articulo con atributos nombre, precio, y stock.
 *  Implementa métodos aumentarStock() y disminuirStock(). Usa equals()
 *  para comparar artículos por su nombre y toString() para mostrar
 *  su información
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Articulo {
    private String nombre;
    private float precio;
    private int stock;

    /**
     * Constructor vacío
     */
    public Articulo() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param precio
     * @param stock
     */
    public Articulo(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        if (this.stock < 0)
        {
            this.stock = 0;
        }
    }

    /**
     * Metodo que aumentar el Stock
     * @param stock
     */
    public void aumentarStock(int stock)
    {
        setStock(getStock() + stock);
    }

    /**
     * Metodo que dismnuye el stock
     * @param stock
     */
    public void disminuirStockStock(int stock)
    {
        setStock(getStock() - stock);
    }

    /**
     * Metodo equal modificado
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Articulo)) {
            return false;
        }
        Articulo articulo = (Articulo) o;
        return Objects.equals(nombre, articulo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, stock);
    }
    

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", stock='" + getStock() + "'" +
            "}";
    }

}
