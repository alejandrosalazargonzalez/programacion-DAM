
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: removeIf
 *  
 *   Usa el método removeIf para eliminar todos los nombres del ArrayList que tengan más de 5 caracteres.
 *   Imprime la lista resultante.
 *  
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        nombres.removeIf(nombre -> (nombre.length() > 4));
        System.out.println(nombres);

    }
}