package es.ies.puerto;

/**
 * Dada la frase "Un Anillo para gobernarlos a todos",
 *  comprueba si contiene la palabra "gobernarlos"
 *  usando el método contains().
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        String frase = "Un Anillo para gobernarlos a todos";
        String palabra = "gobernarlos";
        boolean comprobar = frase.contains(palabra);
        System.out.println(comprobar);
    }
}