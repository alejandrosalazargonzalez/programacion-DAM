package es.ies.puerto;

import java.util.Scanner;

/**
 * Si la energía del traje de Iron Man es mayor al 70%, puede volar.
 *  Si es mayor al 30% pero menor o igual al 70%, puede caminar.
 *  Si es menor o igual al 30%, está en modo crítico.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio13 {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("que porcentage de energía le queda a Iron Man.");
        int energia = scanner.nextInt();

        if (70 < energia)
        {
            System.out.println("Iron Man puede volar.");    
        } else if ( 30 < energia && energia <= 70)
        {
            System.out.println("Tiene suficiente energía para caminar.");    
        } else if (energia <= 30) 
        {
            System.out.println("Iron Man está en estado cítoco");    
        }
        scanner.close();
    }
}