package es.ies.puerto.cuarenta.seis;

import es.ies.puerto.diez.seis.Fecha;
import java.util.Objects;

/**
 * Crea una clase Restaurante que tenga una
 *  lista (array) de reservas (clase Reserva,
 *  con las propiedades: fecha, numero,
 *  comensales ). Implementa métodos para
 *  agregar y eliminar reservas y usa toString()
 *  para mostrar los detalles del restaurante.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Reserva {
    private Fecha fecha;
    private int numero;
    private int comensales;

    /**
     * Constructor vacio
     */
    public Reserva() {
    }

    /**
     * Constructor completo
     * @param fecha
     * @param numero
     * @param comensales
     */
    public Reserva(Fecha fecha, int numero, int comensales) {
        this.fecha = fecha;
        this.numero = numero;
        this.comensales = comensales;
    }

    //Getters y Setters
    public Fecha getFecha() {
        return this.fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getComensales() {
        return this.comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reserva)) {
            return false;
        }
        Reserva reserva = (Reserva) o;
        return Objects.equals(fecha, reserva.fecha) && numero == reserva.numero && comensales == reserva.comensales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, numero, comensales);
    }

    @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            ", numero='" + getNumero() + "'" +
            ", comensales='" + getComensales() + "'" +
            "}";
    }
    
}
