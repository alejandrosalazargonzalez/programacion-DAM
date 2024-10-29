package es.ies.puerto.cuatro;

/**
 * Crea una clase Rectangulo con atributos ancho y alto.
 *  Implementa los métodos carea() y perimetro().
 *  Sobrescribe equals() para comparar rectángulos por
 *  sus dimensiones y toString() para describir el rectángulo.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(20, 50);
        System.out.println(rectangulo);

        Rectangulo rectangulo2 = new Rectangulo(20, 40);
        System.out.println("¿El rectangulo 1 es igual al rectangulo 2?" + rectangulo.equals(rectangulo2));
    }
}
