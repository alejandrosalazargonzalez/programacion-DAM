package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> lista;
        lista = generarLista(10);
        System.out.println( lista);
        lista = removeDiv3(lista);
        System.out.println(lista);
        System.out.println(tamanio(lista));
    }

    /**
     * Metodo que genera una lista de un tamaño
     * @param cantidad
     * @return
     */
    static List <Integer> generarLista(int cantidad)
    {
        List<Integer> miLista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            miLista.add(i);
        }
        return miLista;
    }

    /**
     * Metodo que elimina todos los numeros divisibles entre 3
     * @param lista
     * @return lista sin los divisibles entre 3
     */
    static List<Integer> removeDiv3(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty()) {
            return lista;
        }
        lista.removeIf(numero -> numero % 3 == 0);
        return lista;
    }

    /**
     * Metodo que retorna el tamaño de la lista
     * @param lista
     * @return tamanio de la lista
     */
    static int tamanio(List<Integer> lista)
    {
        if (lista == null) {
            return 0;
        }
        return lista.size();
    }
}