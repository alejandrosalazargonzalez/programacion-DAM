package es.test;

import java.util.Objects;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    /**
     * constructor vacio
     */
    public Producto(){
    }

    /**
     * constructor de busqueda
     * @param id del producto
     */
    public Producto(int id){
        this.id = id;
    }

    /**
     * constructor completo
     * @param id del producto
     * @param nombre del producto
     * @param precio del producto
     */
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}