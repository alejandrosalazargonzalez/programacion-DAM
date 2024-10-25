package es.ies.puerto.dos;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Productos producto = new Productos("id","producto",10,2);
        
        Productos producto2 = new Productos("id","producto",10,2);

        System.out.println("Producto 1:" + producto);
        System.out.println("Producto 2:" + producto2);
        
        System.out.println("¿Son iguales? " + producto.equals(producto2));
    }    
}