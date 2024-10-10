package es.ies.puerto;

/**
 * Dada una lista de personajes en una batalla
 *  (separados por comas), imprime cuántos personajes
 *  hay en la batalla usando split().
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {

        String frase = "Goku, Vegeta, Broly, Freezer";
        String[] fraseArray = frase.split(",");

        System.out.println(fraseArray.length);

    }
}