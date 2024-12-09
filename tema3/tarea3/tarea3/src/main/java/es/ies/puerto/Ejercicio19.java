package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio19 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    static List<Integer> subLista = new ArrayList<>(Arrays.asList(7,8,9,10));


    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(subLista);
        System.out.println(esSublista(lista, subLista));
    }

    /**
     * Metodo que retorna si una lista es una subsecuencia de otra
     * @param lista
     * @param sublista
     * @return
     */
    static boolean esSublista(List<Integer> lista, List<Integer> sublista)
    {
        if (lista == null || sublista == null || lista.isEmpty() || sublista.isEmpty())
        {
            return false;
        }
        return lista.containsAll(sublista);
    }
}