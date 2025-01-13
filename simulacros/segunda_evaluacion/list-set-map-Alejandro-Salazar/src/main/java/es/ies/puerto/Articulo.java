package es.ies.puerto;

public class Articulo {
    private String nombre;
    private double precio;
    private String codigo; 

    /**
     * Constructor por defecto
     */
    public Articulo() {
    }

    /**
     * Constructor con todos los atributos
     * @param nombre del producto
     * @param precio del producto
     * @param codigo del producto
     */
    public Articulo(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    /**
     * Constructor con solo el codigo
     * @param codigo del articulo
     */
    public Articulo(String codigo) {
        this.codigo = codigo;
    }

    // Getters y Setters
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Articulo [nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Articulo articulo = (Articulo) obj;
        return codigo.equals(articulo.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
