package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que simule el lanzamiento
 *  de un dado de 20 caras usando Math.random()
 *  y que imprima el resultado del lanzamiento.
 * 
 * @author alejandrosalazar
 * @version 1.0.0
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        int maximo = 20;
        int minimo = 1;
        int rango = maximo - minimo + 1;

        int random = (int)(Math.random() * rango) + minimo;
          
        System.out.println(random);
    }
}