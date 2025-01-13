
package es.ies.puerto.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.ies.puerto.*;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class AnimalSet {
    private Set<Animal> animales;

    /**
     * Constructor vacio
     */
    public AnimalSet() {
        this.animales = new HashSet<>();
    }

    /**
     * Agrega un animal
     * @param animal
     * @return
     */
    public boolean agregar(Animal animal) {
        if (animal == null) {
            return false;
        }
        return animales.add(animal);
    }

    /**
     * Lista los animales
     * @return
     */
    public Set<Animal> listarAnimales() {
        return new HashSet(animales);
    }

    /**
     * busca a un animal por el identificador
     * @param identificador
     * @return
     */
    public Animal buscar(String identificador) {
        if (identificador == null || identificador.isEmpty()) {
            return null;
        }
        Animal animalBuscado = new Animal(identificador);
        for (Animal animal : animales) {
            if (animal.equals(animalBuscado)) {
                return animal;
            }
        }
        return null;     
        
        /** return animales.stream()
         *          .filter(a -> a.getIdentificador()
         *          .equals(identificador))
         *          .findFirst().orElse(null;)
         */
    }

    /**
     * actualiza un animal
     * @param identificador
     * @param nuevoAnimal
     * @return
     */
    public boolean actualizar(String identificador, Animal nuevoAnimal) {
        if (identificador == null || identificador.isEmpty() || nuevoAnimal == null) {
            return false;
        }
        Animal animalBuscado = new Animal(identificador);
        if(animales.contains(animalBuscado)){
            animales.remove(animalBuscado);
            return animales.add(nuevoAnimal);
        }
        return false;
    }

    /**
     * elimina un animal
     * @param identificador
     * @return
     */
    public boolean eliminar(String identificador) {
        if (identificador == null || identificador.isEmpty()) {
            return false;
        }
        Animal animalEliminar = new Animal(identificador);
        if (animales.contains(animalEliminar)) {
            return animales.remove(animalEliminar);
        }
        return false;
    }

}
