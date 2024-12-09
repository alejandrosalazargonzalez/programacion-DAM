package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio18 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4));
    static List<Integer> lista2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    public static void main(String[] args) {
        System.out.println( lista);
        System.out.println(lista2);
        System.out.println(interseccionListas(lista, lista2));
    }

    /**
     * metodo que retorna la interseccion entre dos listas
     * @param lista1
     * @param lista2
     * @return
     */
    static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2)
    {
        if (lista1 == null || lista2 == null || lista1.isEmpty() || lista2.isEmpty())
        {
            return lista1;
        }
        List<Integer> interseccion = lista2;
        interseccion.retainAll(lista1);

        return interseccion;
    }
}