package es.ies.puerto;

import java.util.Scanner;

/**
 * Frodo está viajando a Mordor. Si la distancia es mayor a 1000 kilómetros,
 *  necesitará descansar. Si es menor, podrá continuar.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Cuantos kilometros hay hasta Mordor?");
        int distancia = scanner.nextInt();

        if (distancia > 1000) {
            System.out.println("Frodo necesitará descansar");
        }else
        {
            System.out.println("Frodo puede continuar con el viaje");
        }
        scanner.close();
    }
}