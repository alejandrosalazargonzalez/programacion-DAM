package es.ies.puerto;

import java.util.Scanner;


/**
 * Crea un programa que solicite al usuario dos números enteros. 
 * El programa debe sumar y restar ambos números, y mostrar los resultados.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dos numeros enteros");

        int primero = scanner.nextInt();
        int segundo = scanner.nextInt();

        int suma = primero + segundo;
        int resta = primero - segundo;

        System.out.println("La suma de ambos numero es: " + suma);
        System.out.println("La resta de ambos numeros es: " + resta);

        scanner.close();
    }
}