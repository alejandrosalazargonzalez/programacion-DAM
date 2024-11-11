package es.ies.puerto;

import java.util.Scanner;

/**
 * El objetivo de este ejercicio es escribir un programa en que
 *  permita contar cuántos dígitos tiene un número entero
 *  positivo. El programa debe recibir un número entero positivo
 *  como entrada del usuario y luego determinar cuántos dígitos
 *  tiene dicho número.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = scanner.nextInt();

        System.out.println("El número de dígitos en " + numero + " es "+ contarNumeros(numero));
    }

public static int contarNumeros(int numero)
{
    if(numero < 0)
    {
        return 0;
    }
    return String.valueOf(numero).length();
}
}
