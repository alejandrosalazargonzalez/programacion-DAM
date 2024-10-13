package es.ies.puerto;

import java.util.Scanner;

/**
 * Dado un número de experiencia XP como entero,
 *  determina cuántos niveles ha ganado un jugador
 *  si cada nivel requiere 500 XP (usa Math.floor()).
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        
        int experiencia = 2300;

        double niveles = experiencia / 500;

        System.out.println((int)Math.floor(niveles));
    }
}