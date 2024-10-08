package es.ies.puerto;

import java.util.Scanner;

/**
 * Si tienes un arma de fuego y munición, puedes luchar contra los zombies.
 *  Si tienes un arma cuerpo a cuerpo, puedes defenderte. Si no tienes armas, debes huir.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio16 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Tienes un arma de fuego o cuerpo a cuerpo?");
        String arma = scanner.nextLine();

        switch (arma) {
            case "arma de fuego","de fuego","fuego":
                System.out.println("¿Tienes munición?" + "\n si   no");
                String municion = scanner.nextLine();
                if (municion.equals("si")) {
                    System.out.println("puedes luchar contra los zombies.");
                } else
                {
                    System.out.println("Debes huir.");
                }
                break;
            case "arma cuerpo a cuerpo","cuerpo a cuerpo":
                    System.out.println("Puedes defenderte de los zombies.");
                    break;
            default:
                    System.out.println("Debes huir.");
                break;
        }
        scanner.close();
    }
}