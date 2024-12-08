package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio15 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(rotarLista(lista, 11));

    }

    /**
     * Metodo que rota la lista la cantidad de posiciones indicadas
     * @param lista
     * @param posiciones
     * @return
     */
    static List<Integer> rotarLista(List<Integer> lista, int posiciones)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        posiciones %= lista.size();
        List<Integer> resultado = new ArrayList<>();
        for (int i = lista.size() - posiciones; i < lista.size(); i++)
        {
            resultado.add(lista.get(i));
        }
        for (int i = 0; i < lista.size() - posiciones; i++)
        {
            resultado.add(lista.get(i));
        }

        return resultado;
    }
}