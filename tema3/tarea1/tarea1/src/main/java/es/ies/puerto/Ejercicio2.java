package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Métodos a utilizar: get
 *
 *   Usa el ArrayList creado en el ejercicio 1.
 *   Obtén el tercer elemento de la lista utilizando el método get.
 *   Imprime el elemento obtenido.
 *
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Francisco", "Nicolas", "Alexander", "Santiago","Giancarlo"));

        String tercero = nombres.get(2);
        System.out.println("El tercer elemento es: " + tercero);

    }
}