package es.ies.puerto;

import es.ies.puerto.Libro;
import es.ies.puerto.set.LibroSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibroSetTest {

    private LibroSet libroSet;
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;

    @BeforeEach
    void setUp() {
        libroSet = new LibroSet();
        libro1 = new Libro("Titulo 1", "Autor 1", "1234567890");
        libro2 = new Libro("Titulo 2", "Autor 2", "0987654321");
        libro3 = new Libro("Titulo 3", "Autor 3", "1122334455");
    }

    @Test
    void testAgregarLibro() {
        // Caso: Agregar un libro al set
        assertTrue(libroSet.agregar(libro1), "El libro deberia agregarse correctamente.");
        
        // Caso: Verificar que el libro se ha agregado
        Set<Libro> libros = libroSet.listar();
        assertTrue(libros.contains(libro1), "El libro debe existir en el set.");
    }

    @Test
    void testListarLibros() {
        // Caso: Set vacío
        Set<Libro> setVacio = libroSet.listar();
        assertTrue(setVacio.isEmpty(), "El set deberia estar vacío al inicio.");

        // Caso: Agregar libros y verificar que se mantenga el tamaño correcto
        libroSet.agregar(libro1);
        libroSet.agregar(libro2);
        libroSet.agregar(libro3);

        Set<Libro> setConLibros = libroSet.listar();
        assertEquals(3, setConLibros.size(), "El set deberia tener 3 libros.");
    }

    @Test
    void testBuscarLibro() {
        // Caso: Buscar libro que no existe
        assertNull(libroSet.buscar("1234567890"), "No se deberia encontrar un libro que no existe.");

        // Caso: Buscar libro que sí existe
        libroSet.agregar(libro1);
        assertEquals(libro1, libroSet.buscar("1234567890"), "Deberia encontrar el libro por su ISBN.");
    }

    @Test
    void testActualizarLibro() {
        // Caso: Intentar actualizar un libro que no existe
        assertFalse(libroSet.actualizar("1234567890", libro2), "No se deberia poder actualizar un libro que no existe.");

        // Caso: Actualizar un libro existente
        libroSet.agregar(libro1);
        Libro libroActualizado = new Libro("Titulo 1 Actualizado", "Autor 1", "1234567890");
        assertTrue(libroSet.actualizar("1234567890", libroActualizado), "Deberia actualizar el libro correctamente.");
        assertEquals(libroActualizado, libroSet.buscar("1234567890"), "El libro deberia haberse actualizado.");
    }

    @Test
    void testEliminarLibro() {
        // Caso: Intentar eliminar un libro que no existe
        assertFalse(libroSet.eliminar("1234567890"), "No se deberia poder eliminar un libro que no existe.");

        // Caso: Eliminar un libro existente
        libroSet.agregar(libro1);
        assertTrue(libroSet.eliminar("1234567890"), "Deberia eliminar el libro correctamente.");
        assertNull(libroSet.buscar("1234567890"), "El libro eliminado no deberia estar en el set.");
    }
}

