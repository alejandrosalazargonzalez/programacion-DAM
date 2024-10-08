package es.ies.puerto;

import java.util.Scanner;

/**
 * Dos luchadores están en el combate final de Mortal Kombat.
 *  Si la salud de un luchador es 0, pierde. Si ambos tienen salud, 
 *  se evalúa quién tiene más ataque. Si ambos tienen el mismo ataque,
 *  el combate es un empate.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio20 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println("¿Cuanto ataque tiene Scorpion?");
            int scorpionDanio = scanner.nextInt();
            System.out.println("¿Y cuanta vida?");
            int scorpionVida = scanner.nextInt();

            System.out.println("¿Cuanto ataque tiene Subcero?");
            int subceroDanio = scanner.nextInt();
            System.out.println("¿Y cuanta vida?");
            int subceroVida = scanner.nextInt();

            if(scorpionVida != 0 && subceroVida != 0)
            {
                if (scorpionDanio > subceroDanio)
                {
                    System.out.println("Gana Scorpion");
                }
                else if ( scorpionDanio == subceroDanio)
                {
                    System.out.println("Empate");
                } else
                {
                    System.out.println("Gana Subcero");
                }
            } else
            {
                if(scorpionVida == 0)
                {
                    System.out.println("Fatality Subcero gana");
                } else
                {
                    System.out.println("Fatality Scorpion gana");
                }
            }
            scanner.close();
    }
}