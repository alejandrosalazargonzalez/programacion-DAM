package es.ies.puerto.cuarenta.dos;

import es.ies.puerto.diez.seis.Fecha;
import java.util.Objects;

/**
 * Crea una clase Cine que almacene una lista (array)
 *  de proyecciones (clase Proyeccion, clase con propiedades:
 *  ciudad, hora, y fecha). Implementa métodos para agregar
 *  y eliminar proyecciones, y usa toString() para mostrar
 *  los detalles del cine.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Proyeccion {
    private String ciudad;
    private float hora;
    private Fecha fecha;

    /**
     * Constructor vacio
     */
    public Proyeccion() {
    }

    /**
     * Constructor completo
     * @param ciudad
     * @param hora
     * @param fecha
     */
    public Proyeccion(String ciudad, float hora, Fecha fecha) {
        this.ciudad = ciudad;
        this.hora = hora;
        this.fecha = fecha;
    }

    //Getters setters
    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getHora() {
        return this.hora;
    }

    public void setHora(float hora) {
        this.hora = hora;
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
        if (!(o instanceof Proyeccion)) {
            return false;
        }
        Proyeccion proyecciones = (Proyeccion) o;
        return Objects.equals(ciudad, proyecciones.ciudad) && hora == proyecciones.hora && Objects.equals(fecha, proyecciones.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, hora, fecha);
    }

    @Override
    public String toString() {
        return "{" +
            " ciudad='" + getCiudad() + "'" +
            ", hora='" + getHora() + "'" +
            ", fecha='" + getFecha() + "'" +
            "}";
    }
    
}
