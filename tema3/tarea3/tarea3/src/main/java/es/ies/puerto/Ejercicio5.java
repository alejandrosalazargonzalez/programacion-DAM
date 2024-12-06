
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println("Contiene el numero 3?: " + contieneValor(lista, 3));
    }

    /**
     * Metodo que dice si hay un numero concreto en la lista introducida
     * @param lista
     * @param valor
     * @return
     */
    static boolean contieneValor(List<Integer> lista, int valor)
    {
        if (lista == null || lista.isEmpty())
        {
            return false;
        }
        return lista.contains(valor);
    }
}