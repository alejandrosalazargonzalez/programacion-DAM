package es.ies.puerto.treinta.seis;
import java.util.Objects;

/**
 * Crea una clase ColeccionMonedas que almacene
 *  una lista (array) de monedas (clase Moneda).
 *  Implementa métodos para agregar monedas y
 *  listar todas las monedas. Usa toString()
 *  para mostrar detalles de la colección.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Moneda {
    private float valor;
    private String nombre;

    /**
     * Constructor vacio
     */
    public Moneda() {
    }

    /**
     * Constructor completo
     * @param valor
     * @param nombre
     */
    public Moneda(float valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    // Getters y Setters
    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo equals modificado
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Moneda)) {
            return false;
        }
        Moneda moneda = (Moneda) o;
        return Objects.equals(nombre, moneda.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " valor='" + getValor() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
    
}
