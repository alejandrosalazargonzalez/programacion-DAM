package es.ies.puerto;

import java.util.Scanner;

/**
 * Si la velocidad de la Millennium Falcon es mayor de 1000, 
 *  se activan los motores hiperespaciales.
 *  Si es mayor de 500 pero menor o igual a 1000, 
 *  la nave está a máxima velocidad. Si es menor o igual a 500,
 *  la nave está en velocidad normal.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio11 {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Qué velocidad tiene el Alcón Milenario?");
        int velocidad = scanner.nextInt();

        if (velocidad > 1000)
        {
            System.out.println("Ha activado los motores hiperespaciales.");    
        } 
        else if (500 < velocidad && velocidad <= 1000) 
        {
            System.out.println("El Alcón Milenario va ha máxima velocidad.");    
        }else if (velocidad <= 500 ) 
        {
            System.out.println("La nave va ha velocidad normal.");    
        }
        scanner.close();
    }
}