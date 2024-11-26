package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: set
 *  
 *   Cambia el segundo elemento del ArrayList por otro nombre utilizando el método set.
 *   Imprime la lista completa para verificar el cambio.
 *  
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres);

        nombres.set(1,"Barbara");
        System.out.println(nombres);
    }
}