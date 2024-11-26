package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: contains
 * 
 *  Verifica si el nombre "Ana" está presente en el ArrayList.
 *  Imprime un mensaje indicando si el elemento está o no en la lista.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        if (nombres.contains("Ana"))
        {
            System.out.println("Ana está en la lista");
        }else
        {
            System.out.println("Ana no está en la lista");
        }
    }
}