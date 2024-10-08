package es.ies.puerto;

/**
 * Crea un programa que dada la frase "Viva la
 *  Resistencia", cuente cuántas veces aparece
 *  la letra "a".
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        String frase = "Viva la Resistencia";
        frase = frase.trim();
        char[] arrayFrase = frase.toCharArray();
        int contador = 0;

        for (int i = 0; i < arrayFrase.length; i++)
        {
            if (arrayFrase[i] == 'a') 
            {
                contador++;
            }
        }
        System.out.println("hay: " + contador + " a");
    }
}