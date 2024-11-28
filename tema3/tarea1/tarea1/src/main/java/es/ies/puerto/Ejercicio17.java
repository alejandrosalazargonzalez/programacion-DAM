
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Métodos a utilizar: replaceAll
 *
 *  Usa el método replaceAll para reemplazar todos los elementos del ArrayList con el valor "Sin Nombre".
 *  Imprime la lista resultante.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        Collections.replaceAll(nombres, "Francisco", "Paco Pill");

        System.out.println(nombres);
    }
}