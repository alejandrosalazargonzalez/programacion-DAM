package es.ies.puerto;


/**
 *  Crea una clase Producto con los siguientes atributos:
 *
 *   codigo (String)
 *   nombre (String)
 *   precio (float)
 *   identificador (String)
 *
 * Define los métodos necesarios:
 *
 *   Constructor para inicializar todos los atributos, y para obteber los valores de estos en cualquier momento(get/set).
 *   Método aplicarDescuento(double porcentaje) que reduzca el precio del producto en el porcentaje indicado.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Producto producto = new Producto("12345", "sarten", 30, "sarten");
        System.out.println(producto);
        System.out.println("Se aplica un descuento del 5%, el precio ahora es: " + producto.aplicarDescuento(0.05));
    }
}
