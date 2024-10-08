package es.ies.puerto;

/**
 * Los héroes han bebido una poción mágica que multiplica su poder de ataque.
 *  Escribe un programa que multiplique cada valor de ataque en el array por 
 *  un valor escalar (el poder de la poción).
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio11 {
    public static void main(String[] args) {


        int[] poderesDeAtaque = {50, 70, 100};
        int pocion = 2;

        for (int i = 0; i < poderesDeAtaque.length; i++) 
        {
            poderesDeAtaque[i] = poderesDeAtaque[i] * pocion;
        }
        for (int i = 0; i < poderesDeAtaque.length; i++) 
        {
            System.out.println(poderesDeAtaque[i]);
        }
    }
}