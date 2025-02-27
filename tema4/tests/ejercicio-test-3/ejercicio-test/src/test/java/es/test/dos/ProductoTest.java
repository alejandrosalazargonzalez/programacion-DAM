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
    void productoEqualsTest() {
        Assertions.assertEquals(producto, producto);
    }
}
