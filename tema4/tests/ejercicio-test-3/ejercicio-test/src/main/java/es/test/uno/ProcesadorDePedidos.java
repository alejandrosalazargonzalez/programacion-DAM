package es.test.uno;

import java.util.*;

public class ProcesadorDePedidos {
    private List<Pedido> pedidos;

    public ProcesadorDePedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido inválido");
        }
        pedidos.add(pedido);
    }

    public double calcularTotal() {
        return pedidos.stream().mapToDouble(Pedido::getPrecio).sum();
    }

    public Pedido obtenerPedidoPorId(int id) {
        return pedidos.stream()
                .filter(pedido -> pedido.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarPedido(int id) {
        return pedidos.removeIf(pedido -> pedido.getId() == id);
    }

    public List<Pedido> obtenerPedidos() {
        return new ArrayList<>(pedidos);
    }
}

