package es.ies.puerto;

import java.util.Scanner;

/**
 *  Calcula la potencia de Superman en función
 *  de un poder inicial de 5 elevado a la
 *  fuerza de un enemigo (usa el método Math.pow()).
 * 
 * @author alejandrosalzargonzalez
 * @version 1.0.0
 */
public class Ejercicio14 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int poderInicial = 5;
    

        System.out.println("Introduzca el poder del enemigo");
        int poderEnemigo = scanner.nextInt();
        
        double poderSuperman = Math.pow(poderInicial, poderEnemigo);

        System.out.println(poderSuperman);
        scanner.close();
    }
}