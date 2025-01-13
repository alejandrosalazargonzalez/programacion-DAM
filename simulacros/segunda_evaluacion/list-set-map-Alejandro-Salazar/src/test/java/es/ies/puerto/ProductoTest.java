package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

    @Test
    void testEquals() {
        Producto producto1 = new Producto("Producto A", 20.5, "ABC123");
        Producto producto2 = new Producto("Producto A", 20.5, "ABC123");
        Producto producto3 = new Producto("Producto B", 30.0, "XYZ456");

        assertTrue(producto1.equals(producto2), "Productos should be equal with same codigo");
        assertFalse(producto1.equals(producto3), "Productos should not be equal with different codigo");
    }

    @Test
    void testToString() {
        Producto producto = new Producto("Producto A", 20.5, "ABC123");
        String expectedString = "Producto{nombre='Producto A', precio=20.5, codigo='ABC123'}";
        assertEquals(expectedString, producto.toString(), "toString should return the correct string");
    }
}
