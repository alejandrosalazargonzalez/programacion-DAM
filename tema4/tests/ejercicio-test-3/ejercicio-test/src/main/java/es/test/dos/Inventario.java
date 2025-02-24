package es.test.dos;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (producto == null || producto.getStock() < 0) {
            throw new IllegalArgumentException("Producto inválido");
        }
        productos.add(producto);
    }

    public Producto obtenerProductoPorId(int id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarProducto(int id) {
        return productos.removeIf(producto -> producto.getId() == id);
    }
}
