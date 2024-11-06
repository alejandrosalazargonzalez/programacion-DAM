package es.ies.puerto.veinte.tres;

import es.ies.puerto.dos.Producto;

/**
 * Crea una clase Pedido que tenga una lista (array)
 *  de productos y la cantidad de cada uno. Implementa 
 *  métodos para agregar productos, calcular el total
 *  y usar toString() para mostrar el pedido.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio23 {

    static Producto[] productos;
    public static void main(String[] args) {
        productos = new Producto[2];
        for (int i = 0; i < productos.length; i++)
        {
            int valor = 1 + i;
            Producto producto = new Producto("id" + valor, "nombre" + valor,10f * valor, 1 * valor);
            productos[i] = producto;
        }
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
