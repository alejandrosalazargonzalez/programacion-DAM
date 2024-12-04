package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio17 {
    static List <String> nombres = new ArrayList<>(Arrays.asList("uno","dos","tres"));
    static List <String> nombres2 = new ArrayList<>(Arrays.asList("uno"));

    public static void main(String[] args) {
        nombres.removeAll(nombres2);
        System.out.println(nombres);
    }
}