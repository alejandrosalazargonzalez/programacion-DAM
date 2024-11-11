package es.ies.puerto;
import java.util.Objects;

/**
 *  Crea una clase Producto con los siguientes atributos:
 *
 *   codigo (String)
 *   nombre (String)
 *   precio (double)
 *   identificador (String)
 *
 *  Define los métodos necesarios:
 *
 *  Constructor para inicializar todos los atributos, y para obteber los valores de estos en cualquier momento(get/set).
 *  Método aplicarDescuento(double porcentaje) que reduzca el precio del producto en el porcentaje indicado.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private String identificador;

    /**
     * Constructor vacio
     */
    public Producto() {
    }

    /**
     * Constructor completo
     * @param codigo
     * @param nombre
     * @param precio
     * @param identificador
     */
    public Producto(String codigo, String nombre, double precio, String identificador) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.identificador = identificador;
    }

    //Getters y Setters
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Metodo que retorna el precio con el descuento
     * @param porcentaje
     * @return double
     */
    public double aplicarDescuento(double porcentaje)
    {
        return precio - (precio * porcentaje);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo) && Objects.equals(identificador, producto.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, precio, identificador);
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", identificador='" + getIdentificador() + "'" +
            "}";
    }
    
}
