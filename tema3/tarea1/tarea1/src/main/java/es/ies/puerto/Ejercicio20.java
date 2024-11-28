package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

/**
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