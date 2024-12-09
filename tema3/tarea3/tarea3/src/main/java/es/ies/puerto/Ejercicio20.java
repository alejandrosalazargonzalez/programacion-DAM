package es.ies.puerto;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio20 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(barajarLista(lista));
    }

    /**
     * Metodo que cambia las posiciones de la lista de forma aleatoria
     * 
     * @param lista
     * @return
     */
    static List<Integer> barajarLista(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        Collections.shuffle(lista);
        return lista;
    }
}