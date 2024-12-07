package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio12 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {

        System.out.println(lista);
        System.out.println(contarMayores(lista, 7));

    }
    
    /**
     * metodo que cuenta cuantos numeros mayores que el limite indicado hay
     * @param lista
     * @param limite
     * @return
     */
    static int contarMayores(List<Integer> lista, int limite)
    {
        if (lista == null || lista.isEmpty())
        {
            return -1;
        }
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > limite)
            {
                contador ++;
            }
        }
        return contador;
    }
}