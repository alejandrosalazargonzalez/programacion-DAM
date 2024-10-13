package es.ies.puerto;

import java.util.Scanner;

/**
 * Simula el daño crítico de un ataque multiplicando
 *  el daño base por un número aleatorio entre 1.5 y
 *  2.0 usando Math.random().
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int danioBase = 200;
        double minimo = 1.5;
        double maximo = 2;
        double rango = maximo - minimo + 1;
        double danioCritico = danioBase * ( ( Math.random() * rango ) + minimo );

        System.out.println(danioCritico);
    }
}