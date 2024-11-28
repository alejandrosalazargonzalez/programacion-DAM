package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static List<String> clonar(ArrayList<String> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return new ArrayList<>();    
        }
        return (ArrayList)lista.clone();
    }
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));
        System.out.println(nombres);

        List<String> nombresClon = clonar(nombres) ;

        System.out.println(nombresClon);
    }
}