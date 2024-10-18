package es.ies.puerto;

/**
 * Crea una clase llamada Rectangulo con los atributos
 *  base y altura. Implementa un método que calcule el
 *  área del rectángulo. Usa getters y setters para 
 * los atributos.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.1.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Rectangulo rectangulo;
        rectangulo = new Rectangulo(5, 10);
        
        System.out.println(rectangulo);
        System.out.println("Area: " + rectangulo.area());
        System.out.println("Perimetro: " + rectangulo.perimetro());
    }
}
