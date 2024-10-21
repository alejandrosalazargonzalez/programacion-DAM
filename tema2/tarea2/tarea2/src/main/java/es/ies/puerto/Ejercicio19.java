package es.ies.puerto;

/**
 * Ejercicio 19
 * Crea una clase Circulo con un atributo radio.
 *  Implementa un método que calcule el área y
 *  el perímetro del círculo. Usa getters y
 *  setters para el radio.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.1.0
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5);
        Circulo circulo2 = new Circulo(-3);

        System.out.println(circulo);
        System.out.println(circulo2);
    }
}
