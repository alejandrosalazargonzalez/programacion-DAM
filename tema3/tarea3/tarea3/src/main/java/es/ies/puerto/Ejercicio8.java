package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio8 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(invertirLista(lista));
    }

    /**
     * Metodo que invierte el orden de la lista y la retorna
     * @param lista
     * @return lista invertida
     */
    static List<Integer> invertirLista(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        Collections.reverse(lista);
        return lista;
    }
}