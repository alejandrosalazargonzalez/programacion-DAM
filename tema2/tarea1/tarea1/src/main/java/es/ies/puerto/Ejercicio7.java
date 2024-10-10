package es.ies.puerto;

/**
 * Dado un texto sobre Wakanda, usa el método substring()
 *  para extraer solo la palabra "Wakanda" de la frase
 *  "El vibranium en Wakanda es sagrado".
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String frase = "El vibranium en Wakanda es sagrado";
        String palabra = "wakanda";
        int posicionPalabra = frase.indexOf(palabra);
        char[] palabraArray = palabra.toCharArray();

        String sacarPalabra = frase.substring(posicionPalabra, posicionPalabra + palabraArray.length);

        System.out.println(sacarPalabra);
    }
}