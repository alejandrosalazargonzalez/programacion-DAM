package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ejercicio10 {
    static List<Integer> enteros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    static Vector<Integer> vector = new Vector<>(enteros);
    public static void main(String[] args) {
        System.out.println(vector);
        System.out.println(calcularPromedio(vector));
    }

    /**
     * Metodo que calcula el promedio de un vector de valores
     * @param vector
     * @return
     */
    static double calcularPromedio(Vector<Integer> vector)
    {
        if (vector == null || vector.isEmpty())
        {
            return -1;
        }
        int suma = 0;

        for (Integer integer : vector)
        {
            suma += integer;
        }
        return  suma / vector.size();
    }
}