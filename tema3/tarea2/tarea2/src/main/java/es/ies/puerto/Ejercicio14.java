package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio14 {

    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        aniadeLista(lista, 10);
        System.out.println(lista);
        List<Integer> sublista = sublista(lista, 5, 10);
        System.out.println("Lista: " + lista + "\n sublista: " + sublista );
        borrarNoDiv(sublista);
        sustituir(lista, sublista);
        System.out.println("Lista: " + lista + "\n sublista: " + sublista );
    }

    /**
     * rellena una lista con numeros
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
            lista.add(i);
        }
        return lista;
    }

    /**
     * crea una sublista con y sustituye todos los que no son multiplos de 3 por 0
     * @param lista
     * @param inicio
     * @param fin
     * @return
     */
    static List<Integer> sublista(List<Integer> lista, int inicio, int fin)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        return lista.subList(inicio, fin);
    }

    static boolean sustituir(List<Integer> lista,List<Integer> sublista)
    {
        if (lista == null || lista.isEmpty())
        {
            return false;
        }
        if (sublista == null || sublista.isEmpty())
        {
            return false;
        }
        for (Integer integer : sublista) {
                int posicion = lista.indexOf(integer);
                lista.set(posicion, 0);
            
        }
        return true;
    }
    /**
     * borra todos los no divisibles entre 3
     * @param lista
     * @return
     */
    static List<Integer> borrarNoDiv(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        lista.removeIf(numero -> numero % 3 != 0);
        return lista;

    }
}