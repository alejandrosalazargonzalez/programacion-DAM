
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Métodos a utilizar: equals
 *
 *   Crea dos ArrayList<String> con elementos iguales.
 *   Usa el método equals para verificar si ambas listas son iguales.
 *   Imprime el resultado de la comparación.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        ArrayList<String> nombres2 = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        System.out.println("¿Ambas listas son iguales? " + nombres.equals(nombres2));
    }
}