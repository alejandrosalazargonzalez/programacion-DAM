
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio17 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(eliminarDuplicados(lista));
    }

    /**
     * Metodo que elimina los elementos duplicados en la lista
     * @param lista
     * @return
     */
    static List<Integer> eliminarDuplicados(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        for (int i = 1; i < lista.size(); i++)
        {
            for (int j = 1 + i; j < lista.size(); j++)
            {
                if (lista.get(j).equals(lista.get(i)))
                {
                    lista.remove(j);
                }
            }
        }
        return lista;
    }
}