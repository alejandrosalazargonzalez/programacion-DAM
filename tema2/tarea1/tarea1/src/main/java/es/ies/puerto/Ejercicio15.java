package es.ies.puerto;

import java.util.Scanner;

/**
 * En un juego de Mario, calcula cuántas vidas 
 * extra tiene el jugador si obtiene 250 monedas 
 * (usa Math.floor() para las divisiones entre 100).ç
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio15 {
    public static void main(String[] args) {
    
        int monedas = 250;
        
        int vidas = Math.floorDiv(monedas,100);

        System.out.println(vidas + " Vidas extra");
    }
}