package es.test.dos;

import org.junit.jupiter.api.*;

class InventarioTest {
    
    Inventario inventario;

    @BeforeEach
    void beforeEach() {
        inventario = new Inventario();
        inventario.agregarProducto(new Producto(1, "Pan", 10));
        inventario.agregarProducto(new Producto(2, "Espada de diamante", 1));
    }

    @Test
    void agregarProductoTest() {
        inventario.agregarProducto(new Producto(3,"enderpel",16));
        Assertions.assertEquals(3, inventario.loadLista().size());
    }

    @Test
    void agregarProductoNullTest() {
        try {
            Producto producto = null;
            inventario.agregarProducto(producto);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválido"));
        }
    }
    @Test
    void agregarProductoSinStockTest() {
        try {
            Producto producto = new Producto(3,"enderpel",-2);
            inventario.agregarProducto(producto);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválido"));
        }
    }

    @Test 
    void obtenerProductoPorIdTest(){
        Producto producto = new Producto(3,"enderpel",16);
        inventario.agregarProducto(producto);
        Assertions.assertEquals(producto, inventario.obtenerProductoPorId(3));
    }

    @Test 
    void obtenerProductoInexistentePorIdTest(){
        Producto producto = new Producto(3,"enderpel",16);
        inventario.agregarProducto(producto);
        Assertions.assertNull(inventario.obtenerProductoPorId(22));
    }

    @Test
    void eliminarProductoTest() {
        inventario.eliminarProducto(2);
        Assertions.assertEquals(1, inventario.loadLista().size());
    }
    
    @Test
    void eliminarProductoInexistenteTest(){
        Assertions.assertFalse(inventario.eliminarProducto(99));
    }
}
