package es.ies.puerto;

/**
 * Dada la frase: "Luke Skywalker es un Jedi muy poderoso",
 *  crea un programa que reemplace todas las ocurrencias de
 *  "Skywalker" por "Kenobi" y lo imprima.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    
        String frase = "Luke Skywalker es un Jedi muy poderoso";
        frase = frase.replace("Skywalker", "Kenobi");

        System.out.println(frase);
    }
}