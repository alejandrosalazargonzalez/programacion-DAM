
package es.test.dos;

import java.util.Objects;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class Producto {
    private int id;
    private String nombre;
    private int stock;

    /**
     * constructor con id
     * @param id del producto
     */
    public Producto(int id){
        if (id < 0) {
            throw new IllegalArgumentException("Detalles del producto inválidos");
        }
        this.id = id;
    }

    /**
     * Constructor entero
     * @param id del producto
     * @param nombre del producto
     * @param stock del producto
     */
    public Producto(int id, String nombre, int stock) {
        if (id < 0 || nombre == null || nombre.isEmpty() || stock < 0) {
            throw new IllegalArgumentException("Detalles del producto inválidos");
        }
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return id == producto.id;
    }
}
