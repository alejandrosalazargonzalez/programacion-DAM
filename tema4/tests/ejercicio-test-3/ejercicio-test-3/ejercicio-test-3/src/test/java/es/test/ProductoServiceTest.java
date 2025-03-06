
package es.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
class ProductoServiceTest {
    private ProductoRepository productoRepository;
    private ProductoService productoService;

    @BeforeEach
    void setUp() {
        productoRepository = new ProductoRepository();
        productoService = new ProductoService(productoRepository);
    }

    @Test
    void testCrearProducto() {
        Producto producto = productoService.crearProducto(1, "Laptop", 1200.50);

        assertNotNull(producto);
        assertEquals(1, producto.getId());
        assertEquals("Laptop", producto.getNombre());
        assertEquals(1200.50, producto.getPrecio());
    }


    @Test
    void obtenerProductoTest(){
        Producto producto1 = productoService.crearProducto(1, "Laptop", 1200.50);
        Producto producto2 = productoService.crearProducto(2, "Lampara", 50.50);
        Producto producto3 = productoService.crearProducto(3, "PlayStation 5", 600.50);

        Assertions.assertEquals(producto2,productoService.obtenerProducto(2).get());
    }

    @Test
    void obtenerProductoInexistenteTest(){
        Producto producto1 = productoService.crearProducto(1, "Laptop", 1200.50);
        Producto producto2 = productoService.crearProducto(2, "Lampara", 50.50);
        Producto producto3 = productoService.crearProducto(3, "PlayStation 5", 600.50);

        Assertions.assertTrue(productoService.obtenerProducto(99).isEmpty());
    }

    @Test 
    void obtenerTodosLosProductosTest()
    {
        Producto producto1 = productoService.crearProducto(1, "Laptop", 1200.50);
        Producto producto2 = productoService.crearProducto(2, "Lampara", 50.50);
        Producto producto3 = productoService.crearProducto(3, "PlayStation 5", 600.50);

        Assertions.assertEquals(3,productoService.obtenerTodosLosProductos().size());
    }

    @Test
    void eliminarProductoTest(){
        Producto producto1 = productoService.crearProducto(1, "Laptop", 1200.50);
        Producto producto2 = productoService.crearProducto(2, "Lampara", 50.50);
        Producto producto3 = productoService.crearProducto(3, "PlayStation 5", 600.50);

        Assertions.assertTrue(productoService.eliminarProducto(2));
    }

    @Test
    void eliminarProductoInexistenteTest(){
        Producto producto1 = productoService.crearProducto(1, "Laptop", 1200.50);
        Producto producto2 = productoService.crearProducto(2, "Lampara", 50.50);
        Producto producto3 = productoService.crearProducto(3, "PlayStation 5", 600.50);

        Assertions.assertFalse(productoService.eliminarProducto(99));
    }

    @Test
    void eliminarProductoIdNegativo(){
            Producto producto1 = productoService.crearProducto(1, "Laptop", 1200.50);
            Producto producto2 = productoService.crearProducto(2, "Lampara", 50.50);
            Producto producto3 = productoService.crearProducto(3, "PlayStation 5", 600.50);
    
            Assertions.assertFalse(productoService.eliminarProducto(-1));
    }
}