package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario su año de nacimiento,
 *  luego calcule su edad y la muestre en la consola.
 */

public class Ejercicio1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        
        int anoActual = 2024;
        int edad = anoActual - anoNacimiento;
        
        System.out.println("Tienes " + edad + " años.");

        scanner.close();
    }
}