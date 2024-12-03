
package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio13 {

    public static void main(String[] args) {
    
        List<Integer> lista = new ArrayList<>();
        aniadeLista(lista, 10);
        System.out.println(lista);
        List<Integer> pares = pares(lista);
        List<Integer> impares = impares(lista);
        System.out.println(pares);
        System.out.println(impares);
        List<Integer> juntos = juntar(impares, pares);
        System.out.println(juntos);
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
        int numero = (int) (Math.random() * 100) + 1;
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
     * crea una lista con los numero pares de otra
     * @param lista
     * @return
     */
    static List<Integer> pares(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        List<Integer> sublista = new ArrayList<>();
        for (Integer integer : lista) {
            if (integer % 2 == 0) {
                sublista.add(integer);
            }
        }
        return sublista;
    }

        /**
     * crea una lista con los numero impares de otra
     * @param lista
     * @return
     */
    static List<Integer> impares(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        List<Integer> sublista = new ArrayList<>();
        for (Integer integer : lista) {
            if (integer % 2 != 0) {
                sublista.add(integer);
            }
        }
        return sublista;
    }

    /**
     * Junta dos listas en una sola lista
     * @param impares
     * @param pares
     * @return
     */
    static List<Integer> juntar(List<Integer> impares, List<Integer> pares)
    {
        if (impares == null || impares.isEmpty() || pares == null || pares.isEmpty())
        {
            return null;
        }
        List<Integer> listaNueva = new ArrayList<>();
        listaNueva.addAll(impares);
        listaNueva.addAll(pares);
        return listaNueva;
    }

    
}