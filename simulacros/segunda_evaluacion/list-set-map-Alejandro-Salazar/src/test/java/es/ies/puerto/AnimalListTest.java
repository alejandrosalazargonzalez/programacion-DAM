package es.ies.puerto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.list.AnimalList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    private AnimalList animalList;
    private Animal animal1;
    private Animal animal2;

    @BeforeEach
    void setUp() {
        animalList = new AnimalList();
        animal1 = new Animal("Perro", 5, "1");
        animal2 = new Animal("Gato", 3, "2");
    }

    @Test
    void testAgregarAnimal() {
        // Caso: Agregar un animal no existente
        assertTrue(animalList.agregar(animal1), "El animal deberia ser agregado correctamente.");
        // Caso: Intentar agregar un animal existente
        assertFalse(animalList.agregar(animal1), "No se deberia agregar un animal ya existente.");
    }

    @Test
    void testListarAnimales() {
        // Caso: Lista vacia
        List<Animal> listaVacia = animalList.listar();
        assertTrue(listaVacia.isEmpty(), "La lista deberia estar vacia al inicio.");

        // Caso: Lista con animales
        animalList.agregar(animal1);
        animalList.agregar(animal2);
        List<Animal> listaConAnimales = animalList.listar();
        assertEquals(2, listaConAnimales.size(), "La lista deberia contener 2 animales.");
        assertTrue(listaConAnimales.contains(animal1), "La lista deberia contener al animal1.");
        assertTrue(listaConAnimales.contains(animal2), "La lista deberia contener al animal2.");
    }

    @Test
    void testBuscarAnimal() {
        // Caso: Animal no encontrado
        assertNull(animalList.buscar("1"), "No deberia encontrar un animal que no existe.");

        // Caso: Animal encontrado
        animalList.agregar(animal1);
        assertEquals(animal1, animalList.buscar("1"), "Deberia encontrar al animal1 por su identificador.");
    }

    @Test
    void testActualizarAnimal() {
        // Caso: Actualizar un animal que no existe
        assertFalse(animalList.actualizar("1", animal2), "No se deberia actualizar un animal que no existe.");

        // Caso: Actualizar un animal existente
        animalList.agregar(animal1);
        Animal nuevoAnimal = new Animal("Perro", 6, "1");
        assertTrue(animalList.actualizar("1", nuevoAnimal), "Deberia actualizar al animal existente.");
        assertEquals(nuevoAnimal, animalList.buscar("1"), "El animal deberia haberse actualizado correctamente.");
    }

    @Test
    void testEliminarAnimal() {
        // Caso: Eliminar un animal que no existe
        assertFalse(animalList.eliminar("1"), "No se deberia poder eliminar un animal que no existe.");

        // Caso: Eliminar un animal existente
        animalList.agregar(animal1);
        assertTrue(animalList.eliminar("1"), "Deberia eliminarse el animal existente.");
        assertNull(animalList.buscar("1"), "El animal eliminado no deberia estar en la lista.");
    }

    @Test
    void testConstructorConIdentificador() {
        // Caso: Crear un animal solo con el identificador
        Animal animalConId = new Animal("3");
        assertEquals("3", animalConId.getIdentificador(), "El identificador deberia ser '3'.");
        assertNull(animalConId.getEspecie(), "La especie deberia ser nula.");
        assertEquals(0, animalConId.getEdad(), "La edad deberia ser 0.");
    }

    @Test
    void testConstructorCompleto() {
        // Caso: Crear un animal con todos los atributos
        Animal animalCompleto = new Animal("Ave", 2, "4");
        assertEquals("Ave", animalCompleto.getEspecie(), "La especie deberia ser 'Ave'.");
        assertEquals(2, animalCompleto.getEdad(), "La edad deberia ser 2.");
        assertEquals("4", animalCompleto.getIdentificador(), "El identificador deberia ser '4'.");
    }
}
