package es.ies.puerto;

/**
 * Ejercicio 15
 * Crea una clase Producto con los atributos nombre,
 *  precio y stock. El precio no puede ser negativo
 * y el stock debe ser al menos 0.
 *
 * Ejercicio 16
 * Añade a la clase Producto un método para vender
 *  productos, que disminuya el stock y retorne el
 *  total de la venta.
 *
 * @author alejandrosalazargonzalez
 * @version 1.1.0
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000, 50);
        Producto producto2 = new Producto("Camara", 300, 20);

        System.out.println(producto);
        System.out.println(producto2);

        System.out.println();

        System.out.println( "Se realiza una venta del primer producto por valor de : "+ producto.venta(30));
        System.out.println( "Se realiza una venta del segundo producto por valor de : "+ producto2.venta(10));

        System.out.println();

        System.out.println(producto);
        System.out.println(producto2);

    }
}
