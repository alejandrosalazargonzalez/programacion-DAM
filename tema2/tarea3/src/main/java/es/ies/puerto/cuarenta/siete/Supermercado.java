package es.ies.puerto.cuarenta.siete;

import es.ies.puerto.dos.Producto;

/**
 * Crea una clase Supermercado con una lista (array)
 *  de productos en un carrito de compras. Implementa
 *  métodos para agregar y eliminar productos, y usa
 *  toString() para describir el contenido del carrito.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Supermercado {
    private Producto[] productos;
    private int tamanioLista;

    /**
     * Constructor vacio
     */
    public Supermercado() {
    }

    /**
     * Constructor completo
     * @param tamanioLista
     */
    public Supermercado( int tamanioLista) {
        this.productos = new Producto[tamanioLista];
        this.tamanioLista = tamanioLista;
    }

    //Getters y Setters
    public Producto[] getProductoes() {
        return this.productos;
    }

    public void setProductoes(Producto[] productos) {
        this.productos = productos;
    }

    public int getTamanioLista() {
        return this.tamanioLista;
    }

    public void setTamanioLista(int tamanioLista) {
        this.tamanioLista = tamanioLista;
    }

    /**
     * Metodo que agrega un producto a la lista
     * @param producto
     */
    public void agregarProducto(Producto producto)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (productos[i] == null )
            {
                productos[i] = producto;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina una producto de la lista
     */
    public void eliminarProducto(Producto producto)
    {
        int i = productos.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( productos[i].equals(producto) )
            {
                productos[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    @Override
    public String toString() {
        String mensaje = "productos: ";
        for (Producto producto : productos) {
            if (producto != null) {
                mensaje += producto;
            }
        }
        return mensaje;
    }
}
