package es.ies.puerto.list;

import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.*;

public class AnimalList {
    private List<Animal> animales;

    /**
     * Constructor vacio
     */
    public AnimalList() {
        this.animales = new ArrayList<>();
    }

    /**
     * Metodo para agregar un animal a la lista
     * @param animal
     * @return
     */
    public boolean agregar(Animal animal) {
        if (animales.contains(animal)) {
            return false;
        }
        if (animal == null) {
            return false;
        }
        return animales.add(animal);
    }

    /**
     * Lista los animales
     * @return
     */
    public List<Animal> listar() {
        return new ArrayList<>(animales);
    }

    /**
     * Busca a un animal por el identificador
     * @param identificador
     * @return animal
     */
    public Animal buscar(String identificador) {
        if (identificador == null || identificador.isEmpty()) {
            return null;
        }

        Animal animalBuscado = new Animal(identificador);
        if (!animales.contains(animalBuscado)) {
            return null;
        }

        for (Animal animal : animales) {
            if (animal.equals(animalBuscado)){
                return animal;
            }
        }
        return null;     
    }

    /**
     * actualiza la informacion de un animal
     * @param identificador
     * @param nuevoAnimal
     * @return
     */
    public boolean actualizar(String identificador, Animal nuevoAnimal) {
        if (identificador == null || identificador.isEmpty()) {
            return false;
        }
        Animal animalBuscado = new Animal(identificador);
        int posicion = animales.indexOf(animalBuscado);
        if (posicion < 0) {
            
        }
        return false;
    }

    /**
     * elimina a un animal
     * @param identificador
     * @return
     */
    public boolean eliminar(String identificador) {
        if (identificador == null || identificador.isEmpty()) {
            return false;
        }
        return animales.remove(new Animal(identificador));
    }

}
