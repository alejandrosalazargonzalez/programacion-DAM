package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Métodos a utilizar: subList
 *
 *   Usa el método subList para obtener una sublista con los tres primeros elementos del ArrayList.
 *   Imprime la sublista.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        ArrayList<String> nombres2 = new ArrayList<>(nombres.subList(0, 3));
        System.out.println(nombres2);
    }
}