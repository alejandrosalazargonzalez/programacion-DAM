
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3,4,5,6,7,8,9,10));
    static Vector<Integer> vector = new Vector<>(enteros); 
    public static void main(String[] args) {
        System.out.println(vector);
        System.out.println(copiarElementosPares(vector));
    }

    /**
     * Crea un nuevo vector con los elementos pares del vector original
     * @param vector
     * @return
     */
    static Vector<Integer> copiarElementosPares(Vector<Integer> vector)
    {
        if (vector == null || vector.isEmpty())
        {
            return vector;
        }
        Vector<Integer> pares = new Vector<>(10);
        for (Integer elemento : vector)
        {
            if (elemento % 2 == 0)
            {
                pares.add(elemento);
            }
        }
        return pares;
    }
}