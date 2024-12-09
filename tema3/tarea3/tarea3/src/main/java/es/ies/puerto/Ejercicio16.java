
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio16 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(intercambiar(lista, 0, 5));
    }

    static List<Integer> intercambiar(List<Integer> lista, int indice1, int indice2)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        if (indice1 > lista.size() || indice1 < 0 || indice2 > lista.size() || indice2 < 0 )
        {
            return lista;
        }

        Integer auxiliar = lista.get(indice1);
        lista.set(indice1, lista.get(indice2));
        lista.set(indice2, auxiliar);
        return lista;
    }
}