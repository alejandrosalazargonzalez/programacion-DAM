package es.ies.puerto;

import java.util.Scanner;

/**
 * Dado un nombre de mago como entrada, crea un programa
 *  que imprima un saludo personalizado en formato:
 *  "¡Bienvenido, [nombre del mago], a Hogwarts!"
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Cual es tu nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¡Bienvenido, " + nombre +", a Hogwarts!");
    }
}