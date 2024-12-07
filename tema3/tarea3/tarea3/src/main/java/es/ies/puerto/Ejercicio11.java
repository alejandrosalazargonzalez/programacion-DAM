package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio11 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(copiarLista(lista));
    }

    /**
     * metodo que crea una copia de la lista y la retorna
     * @param lista
     * @return
     */
    static List<Integer> copiarLista(List<Integer> lista)
    {
        if(lista == null || lista.isEmpty())
        {
            return lista;
        }
        List<Integer> copia = lista;
        return copia;
    }
}