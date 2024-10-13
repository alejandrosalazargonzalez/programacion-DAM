package es.ies.puerto;

import java.util.Scanner;

/**
 * Dado el código Sith: "La paz es una mentira,
 *  solo hay pasión", crea un programa que cuente
 *  cuántas veces aparece la palabra "es".
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio23 {
    public static void main(String[] args) {

        String frase = "La paz es una mentira, solo hay pasión";
        frase = frase.trim();
        String[] arrayFrase = frase.split(" ");
        int contador = 0;

        for (int i = 0; i < arrayFrase.length; i++)
        {
            if (arrayFrase[i].equals("es")) 
            {
                contador++;
            }
        }
        System.out.println(contador);
    }
}