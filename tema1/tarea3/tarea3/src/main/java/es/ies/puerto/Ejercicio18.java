package es.ies.puerto;

import java.util.Scanner;

/**
 * Si tienes más de 18 años, eres aceptado en la Resistencia.
 *  Si tienes menos de 18 pero eres hábil con armas, también eres aceptado.
 *  Si no, debes esperar.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio18 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Cuantos años tienes joven revelde?");
        int edad = scanner.nextInt();

        int edadMinima = 18;
        if (edad == edadMinima)
        {
            System.out.println("Bienvenido a la Resistencia");
        } else 
        {
            System.out.println("¿Eres hábil con las armas?");
            String habil = scanner.nextLine();
            if(habil.equals("si") || habil.equals("Si")) 
            {
                System.out.println("Lo dejaré pasar, Bienvenido a la resistencia.");
            } else
            {
                System.out.println("Lo siento, no puedes entrar, vuelve cuando seas mayor");
            }
        }
        scanner.close();
    }
}