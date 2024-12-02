package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    static List<Integer> numeros1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    static List<Integer> numeros2 = new ArrayList<>(Arrays.asList( 5,6,7,8,9,10));
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista = crearlista(numeros1, numeros2);
        System.out.println(lista);
    }

    /**
     * Metodo que crea una lista nueva juntando otras dos, pero no repite elementos
     * @param lista1
     * @param lista2
     * @return
     */
    static List<Integer> crearlista(List<Integer> lista1,List<Integer> lista2)
    {
        List<Integer> lista3 = lista1;
        List<Integer> lista4 = lista2;
        List<Integer> lista5 = new ArrayList<>();
        lista5.addAll(lista3);
        lista4.removeAll(lista3);
        lista5.addAll(lista4);
        Collections.sort(lista5);
        return lista5;
    }
}