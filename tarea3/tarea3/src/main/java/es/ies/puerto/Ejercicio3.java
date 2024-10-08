package es.ies.puerto;

import java.util.Scanner;

/**
 * Cada día de la semana en tu nave espacial 
 *  hay una actividad diferente. Los lunes entrenas combate,
 *  los miércoles pilotaje, y los viernes reparaciones.
 *  El resto de días descansas.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduzca dia de la semana, para saber la rutina de hoy (en minusculas,sin espacios como siempre, no se olvide de las tildes)");
        String dia = scanner.nextLine();
        
        switch (dia) {
            case "lunes":
                System.out.println("Hoy le toca entrenar combate.");
                break;

            case "miércoles":
                System.out.println("Hoy le toca practicar pilotaje.");
                break;

            case "viernes":
                System.out.println("Hoy le toca practicar reparaciones.");
                break;                

            default:
                System.out.println("Hoy es un día de descanso.");
                System.out.println("Por si acaro revise que haya escrito bien el día.");
                break;
        }
        scanner.close();
    }
}