package es.ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que convierta un poder de pelea 
 * (entero) en un string y viceversa usando los métodos 
 * Integer.parseInt() y Integer.toString().
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Integer poderInteger = 4000;
        String poderString = "5000";

        int poderEntero = Integer.parseInt(poderString);
        String poderTexto = Integer.toString(poderInteger);

        System.out.println(poderEntero + " Entero desde cadena");
        System.out.println(poderTexto + " Cadena desde entero");
    }
}