package es.ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario tres 
 * números de tipo float y calcule el promedio de los tres.
 * 
 * @author alejandrosalazargonzalez
 */

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca tres numeros cuales quiera: ");

        float primero = scanner.nextFloat();
        float segundo = scanner.nextFloat();
        float tercero = scanner.nextFloat();

        float suma = primero + segundo + tercero;
        float promedio = suma / 3f;

        System.out.println("El promedio de esos números es:" + promedio);

        scanner.close();

    }
}