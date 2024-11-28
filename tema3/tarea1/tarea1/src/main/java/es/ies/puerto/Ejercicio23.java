package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Métodos a utilizar: hashCode
 *
 *   Usa el método hashCode para obtener un código hash del ArrayList.
 *   Imprime el código hash obtenido.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres.hashCode());
    }
}