package es.test.uno;

import org.junit.jupiter.api.*;

class ProcesadorDePedidosTest {
    
    ProcesadorDePedidos procesadorDePedidos;
    Pedido pedido1;
    Pedido pedido2;

    @BeforeEach
    void beforeEach() {
        pedido1 = new Pedido(1, 10, "Juan");
        pedido2 = new Pedido(2, 20, "Nico");
        
        procesadorDePedidos = new ProcesadorDePedidos();
        procesadorDePedidos.agregarPedido(pedido1);
        procesadorDePedidos.agregarPedido(pedido2);
    }

    @Test
    void agregarPedidoTest() {
        Assertions.assertEquals(2, 
            procesadorDePedidos.obtenerPedidos().size());
    }

    @Test
    void agregarPedidoIllegalArgumentExeption1Test() {
        Pedido pedido3 = null;
        try {
            procesadorDePedidos.agregarPedido(pedido3);
            Assertions.fail("Error no controlado");
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException)) {
                Assertions.fail("Error no controlado");
            }
            Assertions.assertEquals(2, 
                procesadorDePedidos.obtenerPedidos().size());
        }
    }

    @Test
    void calcularTotalTest(){
        Assertions.assertEquals(30, 
            procesadorDePedidos.calcularTotal(),"La suma es incorrecta");
    }

    @Test
    void obtenerPedidoPorIdTest(){
        Pedido pedidoNumero1 = procesadorDePedidos.obtenerPedidoPorId(1);
        Assertions.assertEquals(pedido1,pedidoNumero1);
        Assertions.assertEquals(pedido1.getPrecio(), pedidoNumero1.getPrecio());
        Assertions.assertEquals(pedido1.getCliente(), pedidoNumero1.getCliente());
    }

    @Test
    void obtenerPedidoPorIdNullTest(){
        Pedido pedidoNumero99 = procesadorDePedidos.obtenerPedidoPorId(99);
        Assertions.assertNull(pedidoNumero99);
    }

    @Test
    void eliminarPedidoTest(){
        boolean eliminado = procesadorDePedidos.eliminarPedido(2);
        Assertions.assertTrue(eliminado);
        Assertions.assertEquals(1, procesadorDePedidos.obtenerPedidos().size());
    }

    @Test
    void eliminarPedidoInexistenteTest(){
        boolean eliminado = procesadorDePedidos.eliminarPedido(99);
        Assertions.assertFalse(eliminado);
        Assertions.assertEquals(2, procesadorDePedidos.obtenerPedidos().size());
    }
}
