package es.test;

import java.util.List;
import java.util.Optional;

public class ProductoService {
    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto crearProducto(int id, String nombre, double precio) {
        Producto producto = new Producto(id, nombre, precio);
        return productoRepository.save(producto);
    }

    public Optional<Producto> obtenerProducto(int id) {
        return productoRepository.findById(id);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public boolean eliminarProducto(int id) {
        return productoRepository.delete(id);
    }
}