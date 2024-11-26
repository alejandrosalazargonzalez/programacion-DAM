package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Métodos a utilizar: Collections.sort
 *
 *  Ordena el ArrayList en orden alfabético utilizando el método Collections.sort.
 *  Imprime la lista ordenada.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio9 {
    public static void main(String[] args) {
    
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres);
        
        Collections.sort(nombres);
        System.out.println(nombres);
    }
}