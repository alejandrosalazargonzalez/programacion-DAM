package es.ies.puerto.treinta.tres;
import java.util.Objects;

/**
 * Crea una clase Computadora con atributos marca,
 *  modelo y una lista (array) de componentes (como 
 *  Procesador, RAM, etc.). Implementa métodos para
 *  agregar componentes y usar toString() para
 *  describir la computadora.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Componente {
    private String nombre;
    private int id;


    public Componente() {
    }

    public Componente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Equals modificado para que sea por el id
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Componente)) {
            return false;
        }
        Componente componentes = (Componente) o;
        return id == componentes.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
    
    
}
