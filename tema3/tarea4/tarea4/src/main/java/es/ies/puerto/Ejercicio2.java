
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio2 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3,4,5,6,7,8,9,10));
    static Vector<Integer> vector = new Vector<>(enteros);    
    public static void main(String[] args) {
        System.out.println(vector);
        System.out.println(mostrarTercerElementoVector(vector));
        modificarElementoVector(vector);
        System.out.println(vector);
    }

    /**
     * modifica el tercer elemento del vector
     * @param vector
     * @return
     */
    static Vector<Integer> modificarElementoVector(Vector<Integer> vector)
    {
        vector.set(3, 10);
        return vector;
    }

    /**
     * retorna el tercer elemento del vector
     * @param vector
     * @return
     */
    static Integer mostrarTercerElementoVector(Vector<Integer> vector)
    {
        if (vector.isEmpty() || vector == null)
        {
            return -1;
        }
        return vector.get(3);
    }
}