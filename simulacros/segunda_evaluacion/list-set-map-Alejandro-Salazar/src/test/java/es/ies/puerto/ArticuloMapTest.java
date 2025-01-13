package es.ies.puerto;

import es.ies.puerto.Articulo;
import es.ies.puerto.map.ArticuloMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ArticuloMapTest {

    private ArticuloMap articuloMap;
    private Articulo articulo1;
    private Articulo articulo2;
    private Articulo articulo3;

    @BeforeEach
    void setUp() {
        articuloMap = new ArticuloMap();
        articulo1 = new Articulo("Articulo 1", 10.0, "001");
        articulo2 = new Articulo("Articulo 2", 20.0, "002");
        articulo3 = new Articulo("Articulo 3", 30.0, "003");
    }

    @Test
    void testAgregarArticulo() {
        // Caso: Agregar un artículo al mapa
        assertTrue(articuloMap.agregar(articulo1), "El artículo deberia agregarse correctamente.");
        
        // Caso: Verificar que el artículo se ha agregado
        Map<String, Articulo> articulos = articuloMap.listar();
        assertTrue(articulos.containsKey(articulo1.getCodigo()), "El artículo debe existir en el mapa.");
    }

    @Test
    void testListarArticulos() {
        // Caso: Mapa vacío
        Map<String, Articulo> mapaVacio = articuloMap.listar();
        assertTrue(mapaVacio.isEmpty(), "El mapa deberia estar vacío al inicio.");

        // Caso: Agregar artículos y verificar que se mantenga el tamaño correcto
        articuloMap.agregar(articulo1);
        articuloMap.agregar(articulo2);
        articuloMap.agregar(articulo3);

        Map<String, Articulo> mapaConArticulos = articuloMap.listar();
        assertEquals(3, mapaConArticulos.size(), "El mapa deberia tener 3 artículos.");
    }

    @Test
    void testBuscarArticulo() {
        // Caso: Buscar artículo que no existe
        assertNull(articuloMap.buscar("001"), "No se deberia encontrar un artículo que no existe.");

        // Caso: Buscar artículo que sí existe
        articuloMap.agregar(articulo1);
        assertEquals(articulo1, articuloMap.buscar("001"), "Deberia encontrar el artículo por su codigo.");
    }

    @Test
    void testActualizarArticulo() {
        // Caso: Intentar actualizar un artículo que no existe
        assertFalse(articuloMap.actualizar("001", articulo2), "No se deberia poder actualizar un artículo que no existe.");

        // Caso: Actualizar un artículo existente
        articuloMap.agregar(articulo1);
        Articulo nuevoArticulo = new Articulo("Articulo 1 Actualizado", 15.0, "001");
        assertTrue(articuloMap.actualizar("001", nuevoArticulo), "Deberia actualizar el artículo correctamente.");
        assertEquals(nuevoArticulo, articuloMap.buscar("001"), "El artículo deberia haberse actualizado.");
    }

    @Test
    void testEliminarArticulo() {
        // Caso: Intentar eliminar un artículo que no existe
        assertFalse(articuloMap.eliminar("001"), "No se deberia poder eliminar un artículo que no existe.");

        // Caso: Eliminar un artículo existente
        articuloMap.agregar(articulo1);
        assertTrue(articuloMap.eliminar("001"), "Deberia eliminar el artículo correctamente.");
        assertNull(articuloMap.buscar("001"), "El artículo eliminado no deberia estar en el mapa.");
    }
}

