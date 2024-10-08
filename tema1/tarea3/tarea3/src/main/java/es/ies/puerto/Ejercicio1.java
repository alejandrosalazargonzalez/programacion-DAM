package es.ies.puerto;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Randomly set the correct door (1 or 2)
        int puertaCorrecta = random.nextInt(2) + 1;

        System.out.println("Elige una puerta (1 o 2): ");
        int eleccionUsuario = scanner.nextInt();

        if (eleccionUsuario == puertaCorrecta) {
            System.out.println("¡Has obtenido la espada mágica!");
        } else if (eleccionUsuario == 1 || eleccionUsuario == 2) {
            System.out.println("¡Has caído en la trampa!");
        } else {
            System.out.println("Opción no válida. Elige 1 o 2.");
        }

        scanner.close();
    }
}