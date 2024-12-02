package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio2 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {

        System.out.println(enteros);
        aniadir(enteros, 10);
        aniadir(enteros, 11);
        System.out.println(enteros);
        aniadir(enteros, 312);
        aniadir(enteros, 20);
        aniadir(enteros, 12);
        aniadir(enteros, 15);
        System.out.println(enteros);
        ordenar(enteros);
        System.out.println(enteros);
    }

    /**
     * Metodo que añade un valor si no está ya en la lista  
     * @param lista
     * @param valor
     * @return true/false
     */
    static boolean aniadir(List<Integer> lista, int valor)
    {
        if (lista.contains(valor)) {
            return false;
        }
        lista.add(valor);
        return true;
    }

    /**
     * Metodo para ordenar la lista
     * @param lista
     * @return true/false
     */
    static boolean ordenar(List<Integer> lista)
    {
        if (lista.isEmpty() || lista == null)
        {
            return false;
        }
        Collections.sort(lista);
        return true;
    }
}