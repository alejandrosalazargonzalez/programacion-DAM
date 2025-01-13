package es.ies.puerto;


/**
 * En el universo de Star Wars, un "Número de la Fuerza"
 *  es un número especial que solo puede ser usado por
 *  un Jedi. Un "Número de la Fuerza" es un número que
 *  cumple con la siguiente condición:la suma de sus
 *  dígitos es divisible por el número de dígitos del
 *  mismo número. Si el número es un "Número de la Fuerza",
 *  significa que tiene el potencial de ser utilizado por
 *  un Jedi para acceder al poder de la Fuerza.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 36;
        if (sumarNumeros(numero)) {
            System.out.println("Este es un numero digno de la Fuerza");
        } else
        {
            System.out.println("Este NO es un numero digno de la Fuerza");
        }
    }
    static boolean sumarNumeros(Integer numero)
    {
        if(numero == null || numero < 1)
        {
            return false;
        }
        int tamanio = String.valueOf(numero).length();
        int suma = 0;

        for (int i = 0; i < tamanio; i++)
        {
            int digito = String.valueOf(numero).charAt(i);
            suma += digito;
        }
        return suma % tamanio == 0;
    }
    
}
