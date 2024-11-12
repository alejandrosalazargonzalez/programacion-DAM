package es.ies.puerto;

import java.util.Scanner;

/**
 * Programa que al introducir una frase primero ponga
 *  todas las primeras letras de cada palabra en mayuscula,
 *  luego toda la frase y por ultimo cuente cuantas palabras
 *  tiene la frase.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Frase{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    /**
     * combierte la frase a un array de string
     * @param frase
     * @return
     */
    public static String[] toArray(String frase)
    {
        return frase.trim().split(" ");
    }
    /*
    public static String primeraLetra(String frase)
    {
        String[] palabras = toArray(frase);
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            Character letra = palabra.charAt(0);
            letra.toUpperCase(0);
            palabra.replaceFirst(palabra, letra);
        }
    }
    */
    
    /**
     * retorna cuantas palabras hay en la frase
     * @param frase
     * @return
     */
    public static int contarPalabras(String frase)
    {
        String[] palabras = frase.trim().split(" ");
        return palabras.length;
    }
}