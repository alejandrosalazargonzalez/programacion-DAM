
package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        List<Integer> lista;
        lista = generarLista(10);
        System.out.println(lista);
        lista.removeIf(numero->numero>50);
        System.out.println(lista);
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
            int numero = (int)Math.floor((Math.random() * 101));
            miLista.add(numero);
        }
        return miLista;
    }

    /**
     * Metodo que comprueba si la lista tiene numeros pares
     * @param lista
     * @return true/false
     */
    static boolean existenPares(List<Integer> lista)
    {
        if (lista == null || lista.isEmpty())
        {
            return false;
        }
        for (Integer numero : lista)
        {
            if (numero % 2 == 0)
            {
                return true;
            }
        }
        return false;
    }
}