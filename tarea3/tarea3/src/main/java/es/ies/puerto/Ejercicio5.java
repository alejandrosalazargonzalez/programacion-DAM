package es.ies.puerto;

import java.util.Scanner;

/**
 * Goku está en una batalla. Si su nivel de poder es mayor de 9000,
 *  está en "Modo Super Saiyan". Si no, está en "Modo normal".
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("indica el niver de poder de Goku");
        int poder = scanner.nextInt();

        if (poder >= 9000) 
        {
            System.out.println("Goku esta en modo Super Saiyan, mira su pelo");    
        }else
        {
            System.out.println("Goku aun está en su forma base");
        }
        scanner.close();
    }
}