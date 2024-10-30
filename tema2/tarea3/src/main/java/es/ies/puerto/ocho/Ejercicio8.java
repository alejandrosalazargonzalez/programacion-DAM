package es.ies.puerto.ocho;

/**
 * Crea una clase Fraccion con atributos numerador y denominador.
 *  Implementa métodos para sumar, restar, multiplicar y dividir
 *  fracciones. Sobrescribe toString() para mostrar la fracción 
 *  en formato numerador/denominador.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(2, 4);
        System.out.println(fraccion);

        Fraccion fraccion2 = new Fraccion(4, 5);
        System.out.println(fraccion2);

        Fraccion fraccion3 = fraccion.multiplicar(fraccion2);
        System.out.println("multiplicacion = " + fraccion3);
        
        Fraccion fraccion4 = fraccion.dividir(fraccion2);
        System.out.println("Division = " + fraccion4);
    }
}
