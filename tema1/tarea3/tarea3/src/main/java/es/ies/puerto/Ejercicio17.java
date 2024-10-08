package es.ies.puerto;

import java.util.Scanner;

/**
 * En una batalla de rol, si el atacante tiene más fuerza que el defensor,
 *  le inflige un daño igual a la diferencia de fuerza. Si no, el defensor bloquea el ataque.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio17 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Cual es la fuerza del atacante?");
        int fuerzaAtacante = scanner.nextInt();

        System.out.println("¿Cual es la fuerza del defensor?");
        int fuerzaDefensor = scanner.nextInt();

        int danio = fuerzaAtacante - fuerzaDefensor;

        if (fuerzaAtacante > fuerzaDefensor)
        {
            System.out.println("El defensor recibe:" + danio + " puntos de daño.");
        }else 
        {
            System.out.println("El defensor bloquea el ataque.");
        }
        scanner.close();
    }
}