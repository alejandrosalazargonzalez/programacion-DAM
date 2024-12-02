

package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio6 {
    static List<Integer> numeros1 = new ArrayList<>();
    static List<Integer> numeros2 = new ArrayList<>(Arrays.asList( 5,6,7,8,9,10));
    public static void main(String[] args) {
        System.out.println(numeros1);
        System.out.println(numeros2);

        System.out.println(comprobar(numeros2, numeros1));
    }

    /**
     * Metodo que rellena una lista con los números impares del 1 al 10
     * @param lista
     * @return lista de numeros impares
     */
    static List<Integer> rellenar(List<Integer> lista)
    {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                lista.add(i);
            }
        }
        return lista;
    }

    /**
     * metodo que retorna una nueva lista con el producto de las pociciones de
     * otras dos.
     * @param lista1
     * @param lista2
     * @return
     */
    static List<Integer> listaProducto(List<Integer> lista1, List<Integer> lista2)
    {
        if (lista1 == null || lista2 == null) {
            return lista1;
        }
        if (lista1.isEmpty() || lista2.isEmpty()) {
            return lista1;
        }
        List<Integer> nuevaLista = new ArrayList<>();
        int menor = lista1.size();
        if (lista2.size() < menor) {
            menor = lista2.size();
        }
        for (int i = 0; i < menor; i++) {
            nuevaLista.add(lista1.get(i) * lista2.get(i));
        }
        return nuevaLista;
    }

    /**
     * Comprueba si una lista esta vacía y la rellena, luego crea una nueva 
     * con el producto de ambas
     * @param lista1
     * @param lista2
     * @return
     */
    static List<Integer> comprobar(List<Integer> lista1, List<Integer> lista2)
    {
        if (lista1 == null || lista2 == null) {
            return lista1;
        }
        if (lista1.isEmpty()) {
            rellenar(lista1);
        }
        if (lista2.isEmpty()) {
            rellenar(lista2);
        }
        return listaProducto(lista1, lista2);
    }
}