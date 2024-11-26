package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Métodos a utilizar: isEmpty
 *  
 *   Usa el método isEmpty para verificar si el ArrayList está vacío.
 *   Imprime un mensaje indicando si lo está o no.
 *  
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        if (nombres.isEmpty())
        {
            System.out.println("La lista está vacia");    
        }else
        {
            System.out.println("La lista tiene elementos");
        }
    }
}