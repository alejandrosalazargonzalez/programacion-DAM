package es.ies.puerto.veinte.cuatro;
import java.util.Objects;

/**
 * Crea una clase Zoologico que almacene una lista (array)
 *  (array) de animales (clase Animal) con atributos nombre
 *  y especie. Implementa métodos para agregar, eliminar y
 *  listar animales. Usa toString() para describir el zoológico.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Animal {
    private String nombre;
    private String espacie;

    /**
     * Constructor vacio
     */
    public Animal() {
    }

    /**
     * Constructor completo
     * @param nombre del animal 
     * @param espacie del animal
     */
    public Animal(String nombre, String espacie) {
        this.nombre = nombre;
        this.espacie = espacie;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(nombre, animal.nombre) && Objects.equals(espacie, animal.espacie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, espacie);
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", espacie='" + espacie + "'" +
            "}";
    }


}
