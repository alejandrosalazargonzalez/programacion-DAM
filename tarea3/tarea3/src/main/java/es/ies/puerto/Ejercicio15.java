package es.ies.puerto;

import java.util.Scanner;

/**
 * Link encuentra tres objetos en una mazmorra: una llave, una bomba y un arco.
 *  Si tiene la llave, puede abrir la puerta. Si tiene la bomba, puede destruir la puerta.
 *  Si tiene el arco, puede atacar a los enemigos desde lejos.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio15 {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Link encuentra tres objetos en una mazmorra: una llave, una bomba y un arco.");
        System.out.println("¿Qué objeto escoge?");
        String objeto = scanner.nextLine();

        switch (objeto) {
            case "llave":
                System.out.println("Link puede abrir la puerta.");
                break;
            case "bomba":
                System.out.println("Link puede destruir la puerta.");
                break;
            case "arco":
                System.out.println("Link puede atacar a los enemigos desde la distancia.");
                break;
            default:
                System.out.println("Eso no es un objeto válido");
                break;
        }
        scanner.close();
    }
}