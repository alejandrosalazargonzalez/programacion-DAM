package es.ies.puerto.cuarenta.cuatro;

import es.ies.puerto.diez.seis.Fecha;
import java.util.Objects;

/**
 * Crea una clase Viaje que tenga una lista (array)
 *  de destinos (clase Destinocon las propiedades
 * : pais, ciudad, fecha ). Implementa métodos para
 *  agregar destinos al itinerario y usa toString()
 *  para describir el viaje.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Destino {

    private String pais;
    private String ciudad;
    private Fecha fecha;

    /**
     * Constructor vacio
     */
    public Destino() {
    }

    /**
     * Constructor completo
     * @param pais
     * @param ciudad
     * @param fecha
     */
    public Destino(String pais, String ciudad, Fecha fecha) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    //Getters y Setters
    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Fecha getFecha() {
        return this.fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Destino)) {
            return false;
        }
        Destino destino = (Destino) o;
        return Objects.equals(pais, destino.pais) && Objects.equals(ciudad, destino.ciudad) && Objects.equals(fecha, destino.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pais, ciudad, fecha);
    }

    @Override
    public String toString() {
        return "{" +
            " pais='" + getPais() + "'" +
            ", ciudad='" + getCiudad() + "'" +
            ", fecha='" + getFecha() + "'" +
            "}";
    }
    
    
}
