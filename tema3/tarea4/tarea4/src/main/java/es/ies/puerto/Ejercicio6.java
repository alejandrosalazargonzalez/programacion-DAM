package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio6 {
    static List<String> paises = new ArrayList<>(Arrays.asList("Italia", "Chipre", "Argentina", "España"));
    static Vector<String> vector = new Vector<>(paises); 
    public static void main(String[] args) {
        System.out.println(vector);
        System.out.println("Contiene a España? " + verificarPresenciaElemento(vector, "España"));
    }

    /**
     * Metodo que verifica si el pais que se busca esta en el vector
     * @param vector
     * @param pais
     * @return
     */
    static boolean verificarPresenciaElemento(Vector<String> vector, String pais)
    {
        if (vector == null || vector.isEmpty())
        {
            return false;
        }
        return vector.contains(pais);
    }
}