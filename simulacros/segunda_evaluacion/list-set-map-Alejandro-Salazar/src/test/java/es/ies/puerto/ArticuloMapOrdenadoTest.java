package es.ies.puerto;

import es.ies.puerto.Articulo;
import es.ies.puerto.map.ArticuloMapOrdenado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ArticuloMapOrdenadoTest {

    private ArticuloMapOrdenado articuloMapOrdenado;
    private Articulo articulo1;
    private Articulo articulo2;
    private Articulo articulo3;

    @BeforeEach
    void setUp() {
        articuloMapOrdenado = new ArticuloMapOrdenado();
        articulo1 = new Articulo("Articulo 1", 10.0, "001");
        articulo2 = new Articulo("Articulo 2", 20.0, "002");
        articulo3 = new Articulo("Articulo 3", 30.0, "003");
    }

    @Test
    void testAgregarArticulo() {
        // Caso: Agregar un artículo al mapa
        assertTrue(articuloMapOrdenado.agregar(articulo1), "El artículo deberia agregarse correctamente.");
        
        // Caso: Verificar que el artículo se ha agregado
        Map<String, Articulo> articulos = articuloMapOrdenado.listar();
        assertTrue(articulos.containsKey(articulo1.getCodigo()), "El artículo debe existir en el mapa.");
    }

    @Test
    void testListarArticulos() {
        // Caso: Mapa vacío
        Map<String, Articulo> mapaVacio = articuloMapOrdenado.listar();
        assertTrue(mapaVacio.isEmpty(), "El mapa deberia estar vacío al inicio.");

        // Caso: Agregar artículos y verificar que se mantenga el orden
        articuloMapOrdenado.agregar(articulo1);
        articuloMapOrdenado.agregar(articulo2);
        articuloMapOrdenado.agregar(articulo3);

        Map<String, Articulo> mapaConArticulos = articuloMapOrdenado.listar();
        assertEquals(3, mapaConArticulos.size(), "El mapa deberia tener 3 artículos.");
        
        // Verificar que los artículos se mantengan en el orden de insercion
        String[] expectedOrder = {"001", "002", "003"};
        int index = 0;
        for (String key : mapaConArticulos.keySet()) {
            assertEquals(expectedOrder[index], key, "El orden de los artículos debe mantenerse.");
            index++;
        }
    }

    @Test
    void testBuscarArticulo() {
        // Caso: Buscar artículo que no existe
        assertNull(articuloMapOrdenado.buscar("001"), "No se deberia encontrar un artículo que no existe.");

        // Caso: Buscar artículo que sí existe
        articuloMapOrdenado.agregar(articulo1);
        assertEquals(articulo1, articuloMapOrdenado.buscar("001"), "Deberia encontrar el artículo por su codigo.");
    }

    @Test
    void testActualizarArticulo() {
        // Caso: Intentar actualizar un artículo que no existe
        assertFalse(articuloMapOrdenado.actualizar("001", articulo2), "No se deberia poder actualizar un artículo que no existe.");

        // Caso: Actualizar un artículo existente
        articuloMapOrdenado.agregar(articulo1);
        Articulo nuevoArticulo = new Articulo("Articulo 1 Actualizado", 15.0, "001");
        assertTrue(articuloMapOrdenado.actualizar("001", nuevoArticulo), "Deberia actualizar el artículo correctamente.");
        assertEquals(nuevoArticulo, articuloMapOrdenado.buscar("001"), "El artículo deberia haberse actualizado.");
    }

    @Test
    void testEliminarArticulo() {
        // Caso: Intentar eliminar un artículo que no existe
        assertFalse(articuloMapOrdenado.eliminar("001"), "No se deberia poder eliminar un artículo que no existe.");

        // Caso: Eliminar un artículo existente
        articuloMapOrdenado.agregar(articulo1);
        assertTrue(articuloMapOrdenado.eliminar("001"), "Deberia eliminar el artículo correctamente.");
        assertNull(articuloMapOrdenado.buscar("001"), "El artículo eliminado no deberia estar en el mapa.");
    }
}

