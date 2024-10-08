package es.ies.puerto;

import java.util.Scanner;

/**
 * Si tienes más de 500 minerales y más de 300 gas, 
 * puedes construir un coloso. Si no tienes suficientes recursos,
 *  construyes un marine.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio19 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Cuantos recursos tienes comandante?");
        System.out.print("Introduzca cuantos minerales tiene: ");
        int minerales = scanner.nextInt();
        System.out.print("\n Introduzca cuanto gas tiene: ");
        int gas = scanner.nextInt();

        if (minerales >= 500 && gas >= 300)
        {
            System.out.println("construyendo coloso.");
        } else if( minerales > 100)
        {
            System.out.println("construyendo un marine.");
        } else 
        {
            System.out.println("Necesita más recursos.");
        }
        scanner.close();
    }
}