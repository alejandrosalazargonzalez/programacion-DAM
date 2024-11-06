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
public class Ejercicio39 {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(3);

        tienda.agregarArticulo(new Articulo("Manzana", 10, 20));
        tienda.agregarArticulo(new Articulo("Peras", 3, 10));
        tienda.agregarArticulo(new Articulo("Sandia", 8, 7));
        System.out.println(tienda);

        tienda.eliminarArticulo(new Articulo("Peras", 20000, 70));
        System.out.println(tienda);

    }
}
