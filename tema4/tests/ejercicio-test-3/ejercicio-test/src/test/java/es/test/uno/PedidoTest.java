package es.test.uno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoTest {

    Pedido pedido;

    @BeforeEach
    void beforeEach() {
        pedido = new Pedido(1,1,"Juan");
    }

    @Test
    void pedidoEqualObjectTest() {
        Assertions.assertEquals(pedido, pedido);
    }

    @Test
    void pedidoEqualTest(){
        Pedido pedido2 = new Pedido(1,1,"Juan");
        Assertions.assertEquals(pedido2, pedido);
    }

    @Test
    void pedidoEqualDiferentTest(){
        Assertions.assertFalse(pedido.equals("pedido2"));
    }

    @Test
    void pedidoConstructorIllegalArgumentExceptionTest(){
        try {
            Pedido pedido2 = new Pedido(0, 0, "null");
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles del pedido"));
        }
    }

    @Test
    void pedidoConstructorIllegalArgumentExceptionTest2(){
        try {
            Pedido pedido2 = new Pedido(-1, 10, "null");
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles del pedido"));
        }
    }

    @Test
    void pedidoConstructorIllegalArgumentExceptionTest3(){
        try {
            Pedido pedido2 = new Pedido(1, 10, "");
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles del pedido"));
        }
    }

    @Test
    void pedidoConstructorIllegalArgumentExceptionTest4(){
        try {
            Pedido pedido2 = new Pedido(1, 10, null);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles del pedido"));
        }
    }
}
