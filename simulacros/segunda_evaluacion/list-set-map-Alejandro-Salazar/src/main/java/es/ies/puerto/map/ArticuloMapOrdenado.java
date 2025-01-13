package es.ies.puerto.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import es.ies.puerto.Articulo;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class ArticuloMapOrdenado {
    Map<String, Articulo> articulos;

    /**
     * Constructor vacio
     */
    public ArticuloMapOrdenado() {
        this.articulos = new TreeMap();
    }

    /**
     * Agrega un articulo
     * @param articulo
     * @return true/false
     */
    public boolean agregar(Articulo articulo) {
        if (articulo == null) {
            return false;
        }
        articulos.put(articulo.getCodigo(), articulo);
        return true;
    }

    /**
     * Retorna el hashmap 
     * @return copia del hasmap
     */
    public Map<String, Articulo> listar() {
        return new TreeMap(articulos);
    }

    /**
     * Busca a un articulo por su codigo
     * @param codigo
     * @return un articulo o null
     */
    public Articulo buscar(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        Articulo articuloBuscar = articulos.get(codigo);
        if (articuloBuscar != null) {
            return articuloBuscar;
        }
        return null;     
    }

    /**
     * Actualiza un articulo
     * @param codigo
     * @param nuevoArticulo
     * @return true/false
     */
    public boolean actualizar(String codigo, Articulo nuevoArticulo) {
        if (codigo == null || codigo.isEmpty() || nuevoArticulo == null) {
            return false;
        }
        if (articulos.containsKey(codigo)) {
            articulos.put(codigo, nuevoArticulo);
            return true;
        }

        return false;
    }

    /**
     * Elimina un articulo
     * @param codigo
     * @return true/false
     */
    public boolean eliminar(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return false;
        }
        if (articulos.containsKey(codigo)) {
            articulos.remove(codigo);
            return true;
        }
        return false;
    }
}
