package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Métodos a utilizar: retainAll
 *
 *   Crea dos ArrayList<String> con algunos elementos en común.
 *   Usa el método retainAll para conservar solo los elementos comunes en el primer ArrayList.
 *  Imprime la lista resultante.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        ArrayList<String> nombres2 = new ArrayList<>(Arrays.asList("Frañisco", "Nicolas", "Alexander", "Saitama","Ricardo"));

        nombres.retainAll(nombres2);
        System.out.println(nombres);
    }
}