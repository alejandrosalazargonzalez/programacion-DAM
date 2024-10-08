package es.ies.puerto;

import java.util.Scanner;

/**
 * Batman y Superman están peleando. Si la fuerza de Superman 
 * es mayor a la de Batman, Superman gana. Si es menor, Batman gana. 
 * Si tienen la misma fuerza, es un empate.
 * 
 * @author alejandrosalazargonzalez 
 */
public class Ejercicio12 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce la fuerza de Batman.");
        float fuerzaBatman = scanner.nextFloat();

        System.out.println("Ahora introduce la fuerza de Superman.");
        float fuerzaSuperman = scanner.nextFloat();

        if (fuerzaBatman < fuerzaSuperman)
        {
            System.out.println("Gana Superman.");    
        } else if (fuerzaSuperman < fuerzaBatman)
        {
            System.out.println("Gana Batman.");    
        } else if ( fuerzaBatman == fuerzaSuperman)
        {
            System.out.println("Han quedado en empate.");
        }
        scanner.close();
    }
}