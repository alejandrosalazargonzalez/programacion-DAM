package es.ies.puerto;

/**
 * Dada la transformación Saiyan en nivel 9000,
 *  convierte este número a hexadecimal y
 *  binario usando métodos de Integer.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        
        Integer poder = 9000;
        String poderHexadecimal = poder.toHexString(poder);
        String poderBinario = poder.toBinaryString(poder);

        System.out.println("Hexadecimal: " + poderHexadecimal);
        System.out.println("Binario: " + poderBinario);
    }
}