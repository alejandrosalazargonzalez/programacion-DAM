package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    public static void main(String[] args) {
        System.out.println(duplicarElementos(lista));
    }

    /**
     * metodo que duplica el valor de los elementos de la lista
     * @param lista
     * @return
     */
    static List<Integer> duplicarElementos(List<Integer> lista)
    {
        //opcion 1
        List<Integer> duplicado = new ArrayList<>();
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        for (Integer numero : lista) {
            duplicado.add(numero);
        }
        //opcion 2
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) * 2);
        }
        return lista;
    }
}