package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que convierta una distancia en millas a kilómetros.
 * 
 * 1 milla = 1.60934 km
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca distancia en millas");

        float millas = scanner.nextFloat();

        float kilometros = millas * 1.60934f;

        System.out.println("Esta es la distancia en kilometros:" + kilometros);

        scanner.close();

    }
}