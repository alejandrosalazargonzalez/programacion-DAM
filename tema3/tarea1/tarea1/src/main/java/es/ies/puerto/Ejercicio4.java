package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: remove
 *  
 *  Elimina el cuarto elemento del ArrayList utilizando el método remove.
 *  Imprime la lista para confirmar que el elemento fue eliminado correctamente.
 *  
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres);

        nombres.remove(4);
        System.out.println(nombres);
    }
}