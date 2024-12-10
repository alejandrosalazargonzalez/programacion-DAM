package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Vector;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(4, 2, 5, 1, 3));
    static Vector<Integer> vector = new Vector<>(enteros); 
 
    public static void main(String[] args) {

    }

    static boolean ordenarVector(Vector<Integer> vector)
    {
        if (vector.isEmpty() || vector == null)
        {
            return false;
        }
        return true;
    }
    
}