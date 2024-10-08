package es.ies.puerto;

import java.util.Scanner;

/**
 * Si tu pokémon es de tipo Agua y el rival es de tipo Fuego,
 *  ganas. Si es Planta, pierdes. Si el rival es Agua, empatas.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio14 {
   
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿De que tipo es tu pokémon?");
        String miPokemon = scanner.nextLine();

        System.out.println("¿De que tipo es el pokémon de tu rival?");
        String rivalPokemon = scanner.nextLine();

        switch (miPokemon) {
            case "Agua","agua":
                switch (rivalPokemon) {
                    case "Agua","agua":
                        System.out.println("La pelea acaba en empate.");
                        break;
                    case "Fuego","fuego":
                        System.out.println("Ganas el combate el combate.");
                        break;
                    case "Planta","planta":
                        System.out.println("Pierdes el combate.");
                        break;
                    default:
                        System.out.println("Tu rival tiene un pokemon ilegal");
                        break;
                }
                break;
            case "Fuego","fuego":
                switch (rivalPokemon) {
                    case "Agua","agua":
                        System.out.println("Pierdes el combate.");
                        break;
                    case "Fuego","fuego":
                        System.out.println("El combate acaba en empate.");
                        break;
                    case "Planta","planta":
                        System.out.println("Ganas el combate.");
                        break;
                    default:
                        System.out.println("Tu rival tiene un pokemon ilegal");
                        break;
                }
                break;
            case "Planta","planta":
                switch (rivalPokemon) {
                    case "Agua","agua":
                        System.out.println("Ganas el combate.");
                        break;
                    case "Fuego","fuego":
                        System.out.println("Pierdes el combate.");
                        break;
                    case "Planta","planta":
                        System.out.println("El combate acaba en empate.");
                        break;
                    default:
                        System.out.println("Tu rival tiene un pokemon ilegal");
                        break;
                }      
                break;     
            default:
                System.out.println("Tienes un pokemon ilegal.");
                break;
        }
        scanner.close();
    }
}