package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Métodos a utilizar: clone
 *
 *   Crea una copia exacta del ArrayList utilizando el método clone.
 *   Imprime la lista clonada.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres);

        ArrayList nombresClon = (ArrayList)nombres.clone() ;

        System.out.println(nombresClon);
    }
}