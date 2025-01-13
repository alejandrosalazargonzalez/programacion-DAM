
package es.ies.puerto.map;


import java.util.HashMap;
import java.util.Map;

import es.ies.puerto.Articulo;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class ArticuloMap {
    Map<String, Articulo> articulos;

    /**
     * Constructor
     */
    public ArticuloMap() {
        this.articulos = new HashMap<>();
    }

    /**
     * Metodo agregar
     * @param articulo
     * @return true/false
     */
    public boolean agregar(Articulo articulo) {
        if (articulo == null) {
            return false;
        }
        articulos.put(articulo.getCodigo(),articulo);
        return true;
    }

    /**
     * Lista los articulos
     * @return HashMap con los articulos
     */
    public Map<String, Articulo> listar() {
        return new HashMap(articulos);
    }

    /**
     * Busca al ariculo por su codigo
     * @param codigo
     * @return null o articulo
     */
    public Articulo buscar(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        return articulos.get(codigo);    
    }

    /**
     *  actualiza un articulo
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
     * elimina un articulo
     * @param codigo
     * @return true/fasle
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
