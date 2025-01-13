package es.ies.puerto.map;


import java.util.HashMap;
import java.util.Map;

import es.ies.puerto.Articulo;

public class ArticuloMap {
    Map<String, Articulo> articulos;

    /**
     * Constructor
     */
    public ArticuloMap() {

    }

    public boolean agregar(Articulo articulo) {
        return false;
    }

    public Map<String, Articulo> listar() {
        return new HashMap();
    }

    public Articulo buscar(String codigo) {
        return null;     
    }

    public boolean actualizar(String codigo, Articulo nuevoArticulo) {
        return false;
    }

    public boolean eliminar(String codigo) {
        return false;
    }
}
