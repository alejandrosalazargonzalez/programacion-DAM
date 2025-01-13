package es.ies.puerto;

import es.ies.puerto.Animal;
import es.ies.puerto.set.AnimalSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnimalSetTest {

    private AnimalSet animalSet;
    private Animal animal1;
    private Animal animal2;

    @BeforeEach
    void setUp() {
        animalSet = new AnimalSet();
        animal1 = new Animal("Perro", 5, "1");
        animal2 = new Animal("Gato", 3, "2");
    }

    @Test
    void testAgregarAnimal() {
        // Caso: Agregar un animal no existente
        assertTrue(animalSet.agregar(animal1), "El animal deberia ser agregado correctamente.");
        // Caso: Intentar agregar un animal existente (por set, no se deberian permitir duplicados)
        assertFalse(animalSet.agregar(animal1), "No se deberia agregar un animal ya existente.");
    }

    @Test
    void testListarAnimales() {
        // Caso: Lista vacia
        Set<Animal> listaVacia = animalSet.listarAnimales();
        assertTrue(listaVacia.isEmpty(), "El set deberia estar vacío al inicio.");

        // Caso: Lista con animales
        animalSet.agregar(animal1);
        animalSet.agregar(animal2);
        Set<Animal> listaConAnimales = animalSet.listarAnimales();
        assertEquals(2, listaConAnimales.size(), "El set deberia contener 2 animales.");
        assertTrue(listaConAnimales.contains(animal1), "El set deberia contener al animal1.");
        assertTrue(listaConAnimales.contains(animal2), "El set deberia contener al animal2.");
    }

    @Test
    void testBuscarAnimal() {
        // Caso: Animal no encontrado
        assertNull(animalSet.buscar("1"), "No deberia encontrar un animal que no existe.");

        // Caso: Animal encontrado
        animalSet.agregar(animal1);
        assertEquals(animal1, animalSet.buscar("1"), "Deberia encontrar al animal1 por su identificador.");
    }

    @Test
    void testActualizarAnimal() {
        // Caso: Actualizar un animal que no existe
        assertFalse(animalSet.actualizar("1", animal2), "No se deberia actualizar un animal que no existe.");

        // Caso: Actualizar un animal existente
        animalSet.agregar(animal1);
        Animal nuevoAnimal = new Animal("Perro", 6, "1");
        assertTrue(animalSet.actualizar("1", nuevoAnimal), "Deberia actualizar al animal existente.");
        assertEquals(nuevoAnimal, animalSet.buscar("1"), "El animal deberia haberse actualizado correctamente.");
    }

    @Test
    void testEliminarAnimal() {
        // Caso: Eliminar un animal que no existe
        assertFalse(animalSet.eliminar("1"), "No se deberia poder eliminar un animal que no existe.");

        // Caso: Eliminar un animal existente
        animalSet.agregar(animal1);
        assertTrue(animalSet.eliminar("1"), "Deberia eliminarse el animal existente.");
        assertNull(animalSet.buscar("1"), "El animal eliminado no deberia estar en el set.");
    }
}

