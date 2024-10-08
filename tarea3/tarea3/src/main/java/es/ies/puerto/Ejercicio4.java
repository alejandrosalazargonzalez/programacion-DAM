package es.ies.puerto;

import java.util.Scanner;

/**
 * Si eres un Sith o un Jedi, puedes usar la Fuerza. 
 *  Si no, eres un simple mortal.
 * 
 * @author alejandrosalzargonzalez
 */
public class Ejercicio4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime si eres un sith un jedi");
        String jediSith = scanner.nextLine();

        switch (jediSith) {
            case "jedi","Jedi":
                System.out.println("Es un honor estar frente a un jedi de verdad.");
                break;
            case "sith","Sith":
                System.out.println("No me haga daño poderoso lord sith.");
                break;
            default:
                System.out.println("Solo eres un vulgar mortal.");
                break;
        }
        scanner.close();
    }
}