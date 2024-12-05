package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {
        System.out.println(lista);
        eliminarElemento(lista, 0);
        System.out.println(lista);
    }

    /**
     * Metodo que elimina la primera aparición de un valor
     * @param lista
     * @param valor
     * @return
     */
    static boolean eliminarElemento(List<Integer> lista, int valor)
    {
        if (lista == null || lista.isEmpty())
        {
            return false;
        }
        int numero = lista.indexOf(valor);
        if (numero > 0)
        {
            lista.remove(numero);
        }
        return false;
    }
}