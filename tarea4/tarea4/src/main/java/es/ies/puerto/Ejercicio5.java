package es.ies.puerto;
/**
 * En un campo de batalla galáctico, se están midiendo las fuerzas de los Jedi
 *  (números pares) y los Sith (números impares). Escribe un programa que cuente
 *  cuántos Jedi y cuántos Sith hay en un array de fuerzas.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        int[] fuerzas = {100, 45, 78, 13, 56, 91};

        int contadorJedi = 0;
        int contadorSith = 0;        

        for (int i = 0; i < fuerzas.length; i++)
        {
            if( fuerzas[i] % 2 == 0)
            {
                contadorJedi++;
            }else
            {
                contadorSith++;
            }
        }
        System.out.println("Hay: " + contadorJedi + " Jedis y hay: " + contadorSith + " Sith" );
    }
}