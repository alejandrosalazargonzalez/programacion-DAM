/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio13 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {

        System.out.println(sumarElementos(lista));
    }

    /**
     * metodo que suma todos los elementos de una lista
     * @param lista
     * @return
     */
    static int sumarElementos(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return -1;
        }
        int suma = 0;
        for (Integer numero : lista)
        {
            suma += numero;
        }
        return suma;
    }
}