package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Métodos a utilizar: remove
 *
 *   Usa el método remove para eliminar un elemento del ArrayList basado en su índice.
 *   Imprime la lista tras la eliminación.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        System.out.println(nombres);
        nombres.remove(3);
        System.out.println(nombres);
    }
}