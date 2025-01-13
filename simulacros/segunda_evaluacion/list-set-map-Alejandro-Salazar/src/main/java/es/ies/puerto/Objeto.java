package es.ies.puerto;

import java.util.Objects;
/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Objeto {
    private String descripcion;
    private String id;

    /**
     * Constructor con todos los atributos
     */ 
    public Objeto(String descripcion, String id) {
        this.descripcion = descripcion;
        this.id = id;
    }

    /**
     * Constructor con solo el ID
     * @param id del objeto
     */
    public Objeto(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Objeto)) {
            return false;
        }
        Objeto objeto = (Objeto) o;
        return Objects.equals(id, objeto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, id);
    }

    @Override
    public String toString() {
        return "Objeto{" +
            "descripcion='" + getDescripcion() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }

}
