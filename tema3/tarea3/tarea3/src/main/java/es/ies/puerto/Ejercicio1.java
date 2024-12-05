
package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    System.out.println(crearListaConsecutiva(-2, 10));
    }

    /**
     * Crea una lista empezando por un numero indicado y con un tamaño indicado
     * @param inicio
     * @param cantidad
     * @return
     */
    static List<Integer> crearListaConsecutiva(int inicio,int cantidad)
    {
        List<Integer> lista = new ArrayList<>();
        for (int i = inicio; i < (cantidad + inicio); i++)
        {
            lista.add(i);
        }
        return lista;
    }
}