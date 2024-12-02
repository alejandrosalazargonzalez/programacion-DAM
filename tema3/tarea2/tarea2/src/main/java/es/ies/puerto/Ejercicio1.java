
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */

public class Ejercicio1 {

    static List<Integer> enteros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    static List<Integer> miLista = new ArrayList<>();

    public static void main(String[] args) {
        miLista = addElementos(miLista);
        miLista = addElementos(miLista);
        System.out.println(miLista);
        miLista = removeIf(miLista, 5);
        System.out.println(miLista);
        
    }

    /**
     * Funcion que retorna una lista con elementos si esta vacia
     * @param lista
     * @return lista con elementos
     */
    static List<Integer> addElementos(List<Integer> lista)
    {
        if (lista != null && lista.isEmpty())
        {
            miLista.addAll(enteros);
        }
        return lista;
    }

    /**
     * Metodo que elimina todos los valores más pequeños a un valor introducido
     * @param lista
     * @param valor
     * @return lista sin los valores pedidos
     */
    static List<Integer> removeIf(List<Integer> lista, int valor)
    {
        if (lista != null)
        {
            lista.removeIf(numero -> numero < valor);
        }
        return lista;
    }
}