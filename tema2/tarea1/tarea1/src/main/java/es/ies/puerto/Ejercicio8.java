package es.ies.puerto;

/**
 * Escribe un programa que reciba una entrada del
 *  usuario y convierta la primera letra de cada
 *  palabra en mayúscula (como si fuera el diario
 *  del Capitán Kirk).
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {

        String frase = "en un universo alterno";

        String[] arrayFrase = frase.split(" ");
        for (int i = 0; i < arrayFrase.length; i++) 
        {
            String palabra = arrayFrase[i];
            String primeraLetra = palabra.substring(0, 1);
            String primeraMayuscula = primeraLetra.toUpperCase();
            palabra = palabra.replaceFirst( primeraLetra, " " + primeraMayuscula );
            System.out.print( palabra );        
        }
        System.out.println();
    }
}