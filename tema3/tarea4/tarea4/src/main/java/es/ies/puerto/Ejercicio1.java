package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println(crearVectorFrutas());
    }

    /**
     * Metodo que crea el vector de frutas
     * @return
     */
    static Vector<String> crearVectorFrutas()
    {
            List<String> frutas = new ArrayList<>(Arrays.asList("Manzana", "Banana", "Cereza", "Mango", "Uva"));
            return new Vector<>(frutas);
    }
}