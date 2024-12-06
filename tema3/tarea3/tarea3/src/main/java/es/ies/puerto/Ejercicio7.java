package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio7 {
    static List<String> lista = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
    public static void main(String[] args) {
        System.out.println(indiceDe(lista, "Java"));
    }

    /**
     * Metodo que retorna el indice del valor pedido y -1 si no exite o la lista no es válida
     * @param lista
     * @param valor
     * @return int indice del valor
     */
    static int indiceDe(List<String> lista, String valor)
    {
        if (lista == null || lista.isEmpty() || valor == null || valor.isEmpty()) {
            return -1;
        }
        return lista.indexOf(valor);
    }
}