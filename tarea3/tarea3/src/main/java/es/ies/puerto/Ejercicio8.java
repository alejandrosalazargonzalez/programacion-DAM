package es.ies.puerto;

import java.util.Scanner;

/**
 * Rick ha activado su pistola de portales. Si ingresa un número divisible por 3,
 *  el portal lleva a la dimensión A. Si es divisible por 5, lleva a la dimensión B.
 *  Si es divisible por ambos, lleva a la dimensión C.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Que numero ha introducido Rick?");
        int numeroIntroducido = scanner.nextInt();

        int restode3 = numeroIntroducido % 3;
        int restode5 = numeroIntroducido % 5;

        if (restode3 == 0 && restode5 == 0) 
        {
            System.out.println("El portal lleva a la dimensión C.");    
        }else if (restode5 == 0)
        {
            System.out.println("El portal lleva a la dimensión B.");
        }else if (restode3 == 0)
        {
            System.out.println("El portal lleva a la dimsión A");
        }else
        {
            System.out.println("El portal lleva a la dimensión de los cuchillos");
        }
        scanner.close();
    }
}