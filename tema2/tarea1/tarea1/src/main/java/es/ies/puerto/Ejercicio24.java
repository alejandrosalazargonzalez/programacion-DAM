package es.ies.puerto;

import java.util.Scanner;
/**
 * Dada una dirección de Gotham como "Wayne Tower,
 *  Gotham City", usa el método split() para separar
 *  la torre del nombre de la ciudad.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio24 {
    public static void main(String[] args) {
    
        String direccion = "Wayne Tower, Gotham City";
        String[] direccionArray = direccion.trim().split(",");

        for (int i = 0; i < direccionArray.length; i++) {
            System.out.println(direccionArray[i]);
        }
    }
}