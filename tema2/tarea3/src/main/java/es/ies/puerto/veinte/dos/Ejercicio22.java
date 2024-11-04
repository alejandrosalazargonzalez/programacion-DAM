package es.ies.puerto.veinte.dos;

/**
 * Crea una clase Articulo con atributos nombre, precio, y stock.
 *  Implementa métodos aumentarStock() y disminuirStock(). Usa equals()
 *  para comparar artículos por su nombre y toString() para mostrar
 *  su información
 *
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("pan", 10, 4);
        Articulo articulo2 = new Articulo("pan", 2, 3);

        System.out.println( articulo1);
        System.out.println( articulo2);

        articulo1.aumentarStock(4);
        articulo2.disminuirStockStock(5);

        System.out.println(articulo1);
        System.out.println( articulo2);

        System.out.println("¿son iguales?" + articulo1.equals(articulo2));
    }
}
