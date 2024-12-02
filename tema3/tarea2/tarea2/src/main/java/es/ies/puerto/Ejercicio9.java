
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio9 {
        static List<Integer> numeros1 = new ArrayList<>(Arrays.asList( 5,6,7,8,9,10));
        static List<Integer> numeros2 = new ArrayList<>(Arrays.asList( 5,6,7,8,9,10));
        public static void main(String[] args) {

            System.out.println("Primera lista: " + numeros1);
            System.out.println("Segunda lista: "  + numeros2);
            modificar(numeros2, numeros1);

            System.out.println("Son iguales aun?" + iguales(numeros2, numeros1));
    }

    /**
     * modifica las listas
     * @param lista1
     * @param lista2
     * @return
     */
    static boolean modificar(List<Integer> lista1,List<Integer> lista2)
    {
        if (lista1 == null || lista2 == null) {
            return false;
        }
        if (lista1.isEmpty() || lista2.isEmpty()) {
            return false;
        }
        lista1.removeIf(numero -> numero % 2 == 0);
        lista2.add((int)Math.pow(lista1.get(0), lista2.get(0)));
        return true;
    }
    
    /**
     * Metodo que comprueba si las listas son iguales
     * @param lista1
     * @param lista2
     * @return
     */
    static boolean iguales(List<Integer> lista1,List<Integer> lista2)
    {
        if (lista1 == null || lista2 == null) {
            return false;
        }
        if (lista1.isEmpty() || lista2.isEmpty()) {
            return false;
        }
        return lista1.equals(lista2);
    }
}