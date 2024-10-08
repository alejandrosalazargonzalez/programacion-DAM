package es.ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que reciba un número entero 
 * y determine si es par o impar.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero");

        int entero = scanner.nextInt();

        if(entero % 2 == 0)
        {
            System.out.println("Es un número par");
        }else
        {
            System.out.println("Es un número impar");
        }
        
        scanner.close();

    }
}