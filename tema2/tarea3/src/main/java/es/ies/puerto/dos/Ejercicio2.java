package es.ies.puerto.dos;

/**
 * Crea una clase Producto con los atributos
 *  id, nombre y precio, y cantidad. Implementa
 *  el método equals() para comparar dos productos
 *  según su nombre y precio, y también toString()
 *  para mostrar su información
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Producto producto = new Producto("id","producto",10,2);
        
        Producto producto2 = new Producto("id","producto",10,2);

        System.out.println("Producto 1:" + producto);
        System.out.println("Producto 2:" + producto2);
        
        System.out.println("¿Son iguales? " + producto.equals(producto2));
    }    
}