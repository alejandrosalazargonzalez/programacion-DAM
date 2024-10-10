package es.ies.puerto;

/**
 *  Dada la frase "Soy Batman", invierte la cadena 
 * usando métodos de StringBuilder.
 * 
 * @author alejandrosalzargonzalez
 * @version 1.0.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        StringBuilder frase = new StringBuilder("Soy Batman");
        frase = frase.reverse();
        System.out.println(frase);

    }
}