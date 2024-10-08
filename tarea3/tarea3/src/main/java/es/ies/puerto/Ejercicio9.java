package es.ies.puerto;

import java.util.Scanner;

/**
 *  Para hacer la fusión, los guerreros deben tener la misma cantidad de ki.
 *  Si los valores de ki no coinciden, la fusión falla.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio9 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Indique la cantidad de ki del primer guerrero Z.");
        int primerGuerrero = scanner.nextInt();

        System.out.println("Indique ca cantidad de ki del segundo guerrero Z.");
        int segundoGuerrero = scanner.nextInt();

        if(primerGuerrero == segundoGuerrero)
        {
            System.out.println("Ambos guerreros se han fusionado con exto, ahora son uno.");
        }else
        {
            System.out.println("La fusión ha fallado.");
        }
        scanner.close();
    }
}