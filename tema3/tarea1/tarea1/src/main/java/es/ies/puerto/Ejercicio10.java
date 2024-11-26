package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: toArray
 *
 *   Convierte el ArrayList a un array utilizando el método toArray.
 *   Imprime los elementos del array utilizando un bucle for.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres.toArray());

        Object[] nombresArray = nombres.toArray();
        for (Object nombre : nombresArray) {
            System.out.println(nombre);
        }
    }
}