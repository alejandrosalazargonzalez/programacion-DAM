package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        List<Integer> lista = crearLista(10);
        System.out.println(lista);
    }

    /**
     * metodo que crea una lista
     * @param tamanio
     * @return
     */
    static List<Integer> crearLista(int tamanio)
    {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamanio; i++)
        {
            lista.add(i);
        }
        return lista;
    }

    /**
     * Metodo que coge un numero y rota la lista esa misma cantidad de veces
     * @param lista
     * @param numero
     * @return
     */
    static boolean rotarLista(List<Integer> lista, Integer numero)
    {
        List<Integer> sublista1 = new ArrayList<>(lista.subList(0, numero));
        List<Integer> sublista2 = new ArrayList<>(lista.subList(numero, lista.size()));

        lista.clear();
        lista.addAll(sublista1);
        lista.addAll(sublista2);
        return true;
    }
}