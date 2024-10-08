package es.ies.puerto;

import java.util.Scanner;


/**
 * Eres un guerrero de nivel 5. Si obtienes más de 50 puntos
 *  de experiencia, subes a nivel 6. Si no, te quedas en nivel 5.
 * 
 * @author alejandrosalazargonzález
 */
public class Ejercicio2 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int nivel = 5;
        System.out.println("¿Cuantos puntos de experiencia has ganado guerrero?");
        int puntos = scanner.nextInt();

        if (puntos > 50 ) 
        {
            nivel++;
            System.out.println("Felicidades guerrero, has alcanzado el nivel " + nivel);
        }else
        {
            System.out.println("Lo siento, no has ganado la suficiente experiencia.");
        }
        scanner.close();
    }
}