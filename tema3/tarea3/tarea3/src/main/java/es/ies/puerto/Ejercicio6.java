package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio6 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(4,1,5,2,6,8,7,3,9,10));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(ordenarLista(lista));
    }

    /**
     * Metodo que ordena una lista en orden ascendente y la retorna
     * @param lista
     * @return
     */
    static List<Integer> ordenarLista(List<Integer> lista)
    {
        Collections.sort(lista);
        return lista;
    }
}