package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio8 {
        static List<Integer> numeros = new ArrayList<>();
    public static void main(String[] args) {
        numeroAleatorio(numeros, 10);
        System.out.println(numeros);
        eliminar(numeros);
        System.out.println(numeros);
    }

    /**
     * Metodo que llena una lista con numeros aleatorios
     * @param lista
     * @param tamanio
     * @return
     */
    static List<Integer> numeroAleatorio(List<Integer> lista,int tamanio)
    {
        for (int i = 0; i < tamanio; i++) {
            int numero = (int) (Math.random() * 20) + 90;
            lista.add(numero);
        }
        return lista;
    }

    /**
     * Metood que elimina numeros de la lista si son mayores a 100 o negativos
     * @param lista
     * @return
     */
    static List<Integer> eliminar(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty()) {
            return lista;
        }
        lista.removeIf(numero -> numero > 100 || numero < 0);
        return lista;
    }
}