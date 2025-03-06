package es.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private List<Producto> productos;

    public ProductoRepository() {
        this.productos = new ArrayList<>();
    }

    public Producto save(Producto producto) {
        productos.add(producto);
        return producto;
    }

    public Optional<Producto> findById(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Producto> findAll() {
        return new ArrayList<>(productos);
    }

    public boolean delete(int id) {
        return productos.removeIf(p -> p.getId() == id);
    }
}