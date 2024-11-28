package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        System.out.println(nombres);
        nombres.clear();
        System.out.println(nombres);
        System.out.println("Resultado isEmpty(): " + nombres.isEmpty());
    }
}