package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio14 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,5,3,1,4,7,5,6,7,8));

    public static void main(String[] args) {
        System.out.println(lista);
        System.out.println(encontrarDuplicados(lista));

    }

    /**
     * Metodo que ordena una lista para averiguar si hay algun valor duplicado
     * y retorna una nueva lista con los valores duplicados
     * @param lista
     * @return
     */
    static List<Integer> encontrarDuplicados(List<Integer> lista)
    {
        List<Integer> duplicados = new ArrayList<>();
        Collections.sort(lista);
        
        for (int i = 1; i < lista.size(); i++)
        {
            if (lista.get(i).equals(lista.get(i - 1)))
            {
                duplicados.add(lista.get(i));
            }
        }
        return duplicados;
    }
}