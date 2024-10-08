package es.ies.puerto;

import java.util.Scanner;

/**
 *  Crea un programa que pida al usuario el 
 * radio de un círculo y calcule su área.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio del circulo");

        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio,2);

        System.out.println("el área del circulo es: " + area);
        scanner.close();
    }
}