package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio3 {
    static List<String> colores = new ArrayList<>(Arrays.asList("Azul", "Amarillo", "Verde", "Anaranjado"));
    static Vector<String> vector = new Vector<>(colores); 
    public static void main(String[] args) {
        System.out.println(vector);
        eliminarPorCondicion(vector);
        System.out.println(vector);
    }

    /**
     * metodo que elimina todas las palabras que empiezan por "a"
     * @param vector
     * @return
     */
    static Vector<String> eliminarPorCondicion(Vector<String> vector)
    {
        if (vector == null || vector.isEmpty())
        {
            return vector;
        }
        vector.removeIf(palabra -> palabra.toLowerCase().startsWith("a"));
        return vector;
    }
}