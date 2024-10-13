package es.ies.puerto;

import java.util.Scanner;

/**
 * Dado el nombre "Thor Odinson", crea
 *  un programa que imprima solo el apellido
 *  usando substring() y indexOf().
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        
        String nombreApellido = "Thor Odinson";
        String apellido = "Odinson";
        int posicion = nombreApellido.indexOf(apellido);

        System.out.println(nombreApellido.substring(posicion));

    }
}