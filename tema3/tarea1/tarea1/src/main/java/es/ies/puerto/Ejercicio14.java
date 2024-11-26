package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: addAll
 *  
 *  Crea un segundo ArrayList<String> con cinco nombres diferentes.
 *  Usa el método addAll para agregar todos los elementos de esta lista al primer ArrayList.
 *  Imprime la lista combinada.
 *  
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        List<String> nombres2 = new ArrayList<>(Arrays.asList("Aday", "Harby", "Diego", "Gabriel","Marcos"));
        System.out.println(nombres);
        System.out.println(nombres2);

        nombres.addAll(nombres2);
        System.out.println(nombres);
    }
}