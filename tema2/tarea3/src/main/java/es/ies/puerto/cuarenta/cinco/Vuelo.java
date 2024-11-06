package es.ies.puerto.cuarenta.cinco;

import es.ies.puerto.diez.seis.Fecha;
import java.util.Objects;

/**
 * Crea una clase Aeropuerto que almacene una
 *  lista (array) de vuelos (clase Vuelo, con
 *  las propiedades: aerolinea, fecha, numero).
 *  Implementa métodos para agregar y eliminar
 *  vuelos, y usa toString() para mostrar los
 *  detalles del aeropuerto.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Vuelo {
    private String aerolinea;
    private Fecha fecha;
    private int numero;

    /**
     * Constructor vacio
     */
    public Vuelo() {
    }

    /**
     * Constructor completo
     * @param aerolinea
     * @param fecha
     * @param numero
     */
    public Vuelo(String aerolinea, Fecha fecha, int numero) {
        this.aerolinea = aerolinea;
        this.fecha = fecha;
        this.numero = numero;
    }

    //Getters y Setters
    public String getAerolinea() {
        return this.aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vuelo)) {
            return false;
        }
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(aerolinea, vuelo.aerolinea) && Objects.equals(fecha, vuelo.fecha) && numero == vuelo.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aerolinea, fecha, numero);
    }

    @Override
    public String toString() {
        return "{" +
            " aerolinea='" + getAerolinea() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }
    
}
