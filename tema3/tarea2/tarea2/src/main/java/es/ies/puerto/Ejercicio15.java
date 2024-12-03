package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio15 {

    static List<List<String>> productos = new ArrayList<>();
    static int electronica = 0;
    static int libro = 1;
    static int ropa = 2;
    public static void main(String[] args) {

        productos.add(creaLista());
        productos.add(creaLista());
        productos.add(creaLista());
        System.out.println(productos);
        addProducto(productos.get(ropa),"pantalon");
        System.out.println(productos);
    }

    /**
     * crea una lista vacia
     * @return lista vacia
     */
    static List<String> creaLista()
    {
        return new ArrayList<>();
    }

    /**
     *  añade un producto a la lista
     * @param lista
     * @param producto
     * @return true/false
     */
    static boolean addProducto(List<String> lista, String producto)
    {
        if (lista == null || producto == null || producto.isEmpty())
        {
            return false;
        }
        return lista.add(producto);
    }

    /**
     *  elimina un producto a la lista
     * @param lista
     * @param producto
     * @return true/false
     */
    static boolean eliminarProducto(List<String> lista, String producto)
    {
        if (lista == null || producto == null || producto.isEmpty())
        {
            return false;
        }
        return lista.remove(producto);
    }

    /**
     * Mueve un producto de una lista a otra
     * @param listaOrigen
     * @param listaDestino
     * @param producto
     * @return true/false
     */
    static boolean moverProducto(List<String> listaOrigen, List<String> listaDestino, String producto)
    {
        if (!listaOrigen.contains(producto) || listaDestino.contains(producto))
        {
            return false;
        }
        eliminarProducto(listaOrigen,producto);
        return addProducto(listaDestino, producto);
    }

    /**
     * Elimina una lista de la lista
     * @param lista
     * @param posicion
     * @return true/false
     */
    static boolean deleteListaEmpty(List<List<String>> lista, int posicion)
    {
        if (lista == null || !lista.isEmpty()) {
            return false;
        }
        if (lista.get(posicion).isEmpty())
        {
            lista.remove(posicion);
            return true;
        }
        return false;
    }
}