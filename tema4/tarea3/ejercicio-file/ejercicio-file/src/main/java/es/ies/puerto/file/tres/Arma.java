
package es.ies.puerto.file.tres;

import java.util.Objects;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class Arma {
    private String id;
    private String nombre;
    private String descripcion;
    private String origen;
    private int fuerza;

    /**
     * Constructor vacio
     */
    public Arma() {
    }

    /**
     * Constructor con la id
     * @param id del arma
     */
    public Arma(String id) {
        this.id = id;
    }

    /**
     * Constructor completo
     * @param id del arma
     * @param nombre del arma
     * @param descripcion del arma
     * @param origen del arma
     * @param fuerza del arma
     */
    public Arma(String id, String nombre, String descripcion, String origen, int fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.origen = origen;
        this.fuerza = fuerza;
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripion) {
        this.descripcion = descripion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Arma)) {
            return false;
        }
        Arma arma = (Arma) o;
        return Objects.equals(id, arma.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return getId() + "," + getNombre() + ",\""
            + getDescripcion() + "\"," 
            + getOrigen() + "," 
            +getFuerza();
    }


}
