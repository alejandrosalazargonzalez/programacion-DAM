package es.ies.puerto.file.dos;

import java.util.List;
import java.util.Objects;

public class Pokemon {

    private String id;
    private String nombre;
    private List<String> tipos;
    private String descripcion;

    /**
     * Constructor vacio
     */
    public Pokemon() {
    }

    /**
     * Constructor solo con la id
     * @param id de la criatura
     */
    public Pokemon(String id) {
        this.id = id;
    }

    /**
     * Constructor completo
     * @param id de la criatura
     * @param nombre de la criatura
     * @param tipos de la criatura
     * @param descripcion de la criatura
     */
    public Pokemon(String id, String nombre, List<String> tipos, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.tipos = tipos;
        this.descripcion = descripcion;
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

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pokemon)) {
            return false;
        }
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", tipos='" + getTipos() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            "}";
    }

}
