package es.ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que convierta una temperatura
 *  en grados Celsius a Fahrenheit.
 * 
 * @author alejandrosalazargonzalez
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce temperatura en grados celsius");

        float celsius = scanner.nextFloat();

        float fahrenheit = celsius * 9f/5f + 32f;

        System.out.println("La temperatura en fahrenheit es: " + fahrenheit);

        scanner.close();

    }
}