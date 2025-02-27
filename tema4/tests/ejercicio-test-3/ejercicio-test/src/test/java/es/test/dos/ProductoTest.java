package es.test.dos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
    
    Producto producto;

    @BeforeEach
    void beforeEach() {
        producto = new Producto(1, "Pan", 10);
    }

    @Test
    void productoIdNegativaTest(){
        try {
            Producto error = new Producto(-1," null", 10);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void productoNombreNullTest(){
        try {
            Producto error = new Producto(1,null, 10);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void productoNombreVacioTest(){
        try {
            Producto error = new Producto(1,"", 10);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void productoStockNegativoTest(){
        try {
            Producto error = new Producto(1," null", -2);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void productoIdErrorTest(){
        try {
        Producto nuevoProducto = new Producto(-1);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void productoEqualsTrueTest() {
        Producto nuevoProducto = new Producto(1);
        Assertions.assertEquals(nuevoProducto, producto);
    }

    @Test
    void productoEqualsTrueMismoTest() {
        Assertions.assertEquals(producto, producto);
    }

    @Test
    void productoEqualsFalseTest(){
        Producto nuevProducto = new Producto(2, "null", 10);
        Assertions.assertFalse(nuevProducto.equals(producto));
    }

    @Test
    void productoEqualsFalseOtroTest(){
        String nuevProducto = "Hola Mundo";
        Assertions.assertFalse(producto.equals(nuevProducto));
    }

    @Test
    void getIdTest(){
        Assertions.assertEquals(1,producto.getId());
    }

    @Test
    void getNombreTest(){
        Assertions.assertEquals("Pan",producto.getNombre());
    }

    @Test
    void getStockTest(){
        Assertions.assertEquals(10,producto.getStock());
    }
    

}
