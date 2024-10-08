package es.ies.puerto;

import java.util.Scanner;

/**
 * 
 * Según tus respuestas en el sombrero seleccionador,
 *  te pueden asignar a Gryffindor, Slytherin, Ravenclaw o Hufflepuff.
 *  Elige entre valiente, astuto, sabio o leal y el programa te asignará una casa.
 */
public class Ejercicio10 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Elige la caracteristica que más te define:");
        System.out.println(" valiente \n astuto \n sabio \n leal \n");
        String caracteristica = scanner.nextLine();

        switch (caracteristica) {
            case "valiente":
                System.out.println("Bienvenido a Grifindor");
                break;
            case "astuto":
                System.out.println("Felicidades, has entrado en Slythering");
                break;
            case "sabio":
                System.out.println("Le doy mi humilde bienvenida a Ravenclaw");
                break;
            case "leal":
                System.out.println("Saludos compañero, bienvenido a Hufflepuff");
                break;
        
            default:
                System.out.println("No has entrado a ninguna casa");
                break;
        }
        scanner.close();
    }
}