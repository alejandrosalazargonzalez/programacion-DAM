package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio8 {
    static List<String> paises = new ArrayList<>(Arrays.asList("Italia", "Chipre", "Argentina", "España"));
    static Vector<String> vectorPaises = new Vector<>(paises); 
    static List<String> colores = new ArrayList<>(Arrays.asList("Azul", "Amarillo", "Verde", "Anaranjado"));
    static Vector<String> vectorColores = new Vector<>(colores);
    
    public static void main(String[] args) {
        System.out.println(vectorPaises);
        System.out.println(vectorColores);
        System.out.println(fusionarVectores(vectorColores,vectorPaises));
    }

    /**
     * metodo que fusiona dos vectores
     * @param vector1
     * @param vector2
     * @return
     */
    static Vector<String> fusionarVectores(Vector<String> vector1, Vector<String> vector2)
    {
        if (vector1 == null || vector1.isEmpty())
        {
            return vector1;
        }
        if(vector2 == null || vector2.isEmpty())
        {
            return vector2;
        }
        Vector<String> vectorCopia = new Vector<>(vector1);
        for (String nombre : vector2)
        {
            if (!vectorCopia.contains(nombre))
            {
                vectorCopia.add(nombre);
            }
        }
        return vectorCopia;
    }
}