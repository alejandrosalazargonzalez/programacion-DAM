package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio7 {
    static List<String> colores = new ArrayList<>(Arrays.asList("Azul", "Amarillo", "Verde", "Anaranjado"));
    static Vector<String> vector = new Vector<>(colores); 
    public static void main(String[] args) {
        System.out.println(vector);
        System.out.println(contarNombresLargos(vector));
    }

    /**
     * Metodo que cuenta cuantos nombres con más de 5 caracteres hay
     * @param vector
     * @return
     */
    static int contarNombresLargos(Vector<String> vector)
    {
        int contador = 0;
        for (String nombre : vector)
        {
            if (nombre.length() > 5)
            {
                contador++;
            }
        }
        return contador;
    }
}