package es.ies.puerto;


/**
 * Declara una variable de tipo char y asígnale un 
 * símbolo del teclado. Luego, muestra el código 
 * numérico ASCII de ese símbolo.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio15 {
    public static void main(String[] args) {
   
        char caracter = 'a';
        int valueChar = caracter;

        System.out.println("El caracter " + caracter + " en codigo ASCII es: " + valueChar );
    }
}