package es.ies.puerto;

/**
 * Dado el nombre de un Pokémon (como "Pikachu"),
 *  crea un programa que convierta el nombre en
 *  mayúsculas, minúsculas, y que también imprima
 *  la longitud del nombre.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        String pokemon = "Pikachu";
        String mayusculas = pokemon.toUpperCase();
        String minusculas = pokemon.toLowerCase();
        int tamanio = pokemon.length();

        System.out.println("Mayusculas: " + mayusculas + "\nMinusculas: " + minusculas + "\nLongitud: " + tamanio);
    }
}