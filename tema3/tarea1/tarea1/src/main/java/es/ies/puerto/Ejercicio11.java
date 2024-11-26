package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Métodos a utilizar: Collections.reverse
 *  
 *  Invierte el orden de los elementos del ArrayList utilizando el método Collections.reverse.
 *  Imprime la lista invertida.
 *  
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres);

        Collections.reverse(nombres);
        System.out.println(nombres);
    }
}