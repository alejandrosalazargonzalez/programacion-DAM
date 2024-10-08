package es.ies.puerto;

import java.util.Scanner;

/**
 * Estás cazando pokémon. Si el pokémon es de tipo Agua,
 *  Fuego o Planta, puedes usar la pokébola. Si es de cualquier otro tipo, no.
 * @author alejandrosalazargonzalez
 */
public class Ejercicio6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("¿De que tipo es el pokémon que estas cazando?");
        String tipo = scanner.nextLine();

        if (tipo == "Agua" || tipo == "Fuego" || tipo == "Planta" || tipo == "agua" || tipo == "fuego" || tipo == "planta") {
            System.out.println("Lanzas la pokébola y atrapas al pokémon, felicidades.");
        } else
        {
            System.out.println("No has podido usar la pokébal, el pokemon se ha escapado.");
        }
        scanner.close();
    }
}