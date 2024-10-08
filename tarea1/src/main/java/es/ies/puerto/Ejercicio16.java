package es.ies.puerto;


/**
 * Declara dos variables de tipo int y realiza una 
 * división entre ambas. Muestra el resultado de
 *  la división entera y el residuo.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio16 {
    public static void main(String[] args) {
   
        int numerador = 15;
        int denominador = 2;

        int cosiente = numerador / denominador;
        int resto = numerador % denominador;
   
        System.out.println("La division de " + numerador + 
                            " entre " + denominador + " da como cosiente " +
                            cosiente + " y como resto " + resto);
    }
}