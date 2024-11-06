package es.ies.puerto.treinta.nueve;

import es.ies.puerto.veinte.dos.Articulo;

/**
 * Crea una clase Tienda que almacene una lista (array)
 *  de artículos (clase Articulo ejercicio 22). Implementa
 *  métodos para agregar y eliminar artículos y usar
 *  toString() para mostrar los detalles de la tienda.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Tienda {
    private Articulo[] articulos;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Tienda() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Tienda( int tamanioLista) {
        this.articulos = new Articulo[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Articulo[] getArticuloes() {
        return this.articulos;
    }

    public void setArticuloes(Articulo[] articulos) {
        this.articulos = articulos;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un articulo a la lista
     * @param articulo
     */
    public void agregarArticulo(Articulo articulo)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (articulos[i] == null )
            {
                articulos[i] = articulo;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una articulo de la lista
     */
    public void eliminarArticulo(Articulo articulo)
    {
        int i = articulos.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( articulos[i].equals(articulo) )
            {
                articulos[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "articulos: ";
        for (Articulo articulo : articulos) {
            if (articulo != null) {
                mensaje += articulo;
            }
        }
        return mensaje;
    }
    
}
