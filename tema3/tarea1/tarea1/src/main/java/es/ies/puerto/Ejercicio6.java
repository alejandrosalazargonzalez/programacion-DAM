package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: size
 *
 *  Usa el método size para mostrar el número total de elementos en el ArrayList.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        System.out.println("El ArrayList tiene un total de: " + nombres.size() + " elementos");
    }
}