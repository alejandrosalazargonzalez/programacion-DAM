package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio11 {

    static List<Integer> numeros = new ArrayList<>();
    public static void main(String[] args) {
        aniadeLista(numeros, 100);
        List<List<Integer>> sublistas = divideLista(numeros, 5);
        for (List<Integer> sublista : sublistas) {
            System.out.println(sublista);
        }


    }

    /**
     * añade un numero aleatorio a la lista
     * @param lista
     * @return
     */
    static boolean addAleatorio(List<Integer> lista)
    {
        if (lista == null) {
            return false;
        }
        int numero = (int) (Math.random() * 30) + 1;
        return lista.add(numero);
    }

    /**
     * rellena una lista con numeros aleatorios
     * @param lista
     * @param tamanio
     * @return
     */
    static List<Integer> aniadeLista(List<Integer> lista, Integer tamanio)
    {
        if (tamanio == null || lista == null) {
            return lista;
        }
        for (int i = 0; i < tamanio; i++) {
            addAleatorio(lista);
        }
        return lista;
    }

    /**
     * divide la lista en sub listas de 5 
     * @param lista
     * @return
     */
    static List<List<Integer>> divideLista(List<Integer> lista, int tamanio)
    {
        List<List<Integer>> sublista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i+= tamanio)
        {
            int ultimo = Math.min(i + tamanio, lista.size());
            sublista.add(lista.subList(i, ultimo));
        }
        return sublista;
    }

}