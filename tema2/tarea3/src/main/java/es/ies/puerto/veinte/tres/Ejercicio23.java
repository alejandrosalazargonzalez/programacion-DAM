package es.ies.puerto.veinte.tres;

import es.ies.puerto.dos.Productos;

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

    static Productos[] productos;
    public static void main(String[] args) {
        productos = new Productos[2];
        for (int i = 0; i < productos.length; i++)
        {
            int valor = 1 + i;
            Productos producto = new Productos("id" + valor, "nombre" + valor,10f * valor, 1 * valor);
            productos[i] = producto;
        }
        for (Productos producto : productos) {
            System.out.println(producto);
        }
    }
}
