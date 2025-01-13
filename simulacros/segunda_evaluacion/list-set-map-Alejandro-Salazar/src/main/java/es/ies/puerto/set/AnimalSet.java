package es.ies.puerto.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.ies.puerto.*;

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
        /* Animal animalBuscado = new Animal(identificador);
        for (int i = 0; i < animales.size(); i++) {
            animales.
            if (animalBuscado.equals()) {
                
            }
        }
        */
        return false;
    }

    public boolean eliminar(String identificador) {
        return false;
    }

}
