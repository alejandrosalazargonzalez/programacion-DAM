package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: indexOf
 *
 *  Busca el índice de un elemento específico en el ArrayList utilizando el método indexOf.
 *  Imprime el elemento encontrado.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));


        System.out.println(nombres.indexOf("Alexander"));
    }
}