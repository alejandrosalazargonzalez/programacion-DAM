package es.ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números enteros al usuario 
 * y determine cuál de ellos es mayor, o si son iguales.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca dos números enteros");

        int primero = scanner.nextInt();
        int segundo = scanner.nextInt();

        if( primero > segundo)
        {
            
            System.out.println(primero + " Es el número más grande");
        
        } else if (primero < segundo) 
        {
            System.out.println(segundo + " Es el número más grande");
        } else
        {
            System.out.println("Ambos son el mismo número");
        }
        scanner.close();
    }
}