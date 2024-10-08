package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario su peso (en kg)
 *  y su altura (en metros), y luego calcule su Índice de Masa Corporal (IMC).
 * 
 * IMC = peso / (altura * altura).
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Introduzca su peso y su altura para calcular su IMC");

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su IMC es de: " + imc );

        scanner.close();

    }
}