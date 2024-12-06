package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio9 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(eliminarSi(lista, 5));
    }

    /**
     * Metodo que elimina todo los numeros de la lista mayores al limite
     * @param lista
     * @param limite
     * @return
     */
    static List<Integer> eliminarSi(List<Integer> lista, int limite)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        lista.removeIf(numero -> numero > limite);
        return lista;
    }
}