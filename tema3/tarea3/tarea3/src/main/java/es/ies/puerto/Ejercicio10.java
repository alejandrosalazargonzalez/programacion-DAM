package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio10 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    public static void main(String[] args) {
        System.out.println(lista);
        int[] mayorMenor1 = obtenerExtremos(lista);
        int[] mayorMenor2 = obtenerExtremos2(lista);

        System.out.print("[");
        for (int i = 0; i < mayorMenor1.length; i++) {
            System.out.print(mayorMenor1[i] + ",");
        }
        System.out.print("]" +"\n[");
        for (int i = 0; i < mayorMenor2.length; i++) {
            System.out.print(mayorMenor2[i]+ ",");
        }
        System.out.print("]\n");
    }

    /**
     * Metodo que devuelve un array con el menor y el mayor numero de la lista
     * OPCION 1
     * @param lista
     * @return
     */
    static int[] obtenerExtremos(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return new int[0];
        }
        List<Integer> listaOrdenada = lista;
        Collections.sort(listaOrdenada);
        int[] mayorMenor = new int[2];
        int mayor = listaOrdenada.get(listaOrdenada.size() - 1);
        int menor = lista.get(0);

        mayorMenor[0] = menor;
        mayorMenor[1] = mayor;
        return mayorMenor;
    }

    /**
     * Metodo que devuelve un array con el menor y el mayor numero de la lista
     * OPCION 2
     * @param lista
     * @return
     */
    static int[] obtenerExtremos2(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return new int[0];
        }
        int[] mayorMenor = new int[2];
        int mayor = lista.get(0);
        int menor = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            if (mayor < lista.get(i))
            {
                mayor = lista.get(i);
            }
            if (menor > lista.get(i))
            {
                menor = lista.get(i);
            }
        }
        mayorMenor[0] = menor;
        mayorMenor[1] = mayor;
        return mayorMenor;
    }
}