package es.ies.puerto;

/**
 * En una batalla épica, dos ejércitos se han unido.
 *  Escribe un programa que sume los puntos de fuerza
 *  de los guerreros de dos ejércitos y muestre un nuevo
 *  array con las fuerzas combinadas de ambos.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] ejercito1 = {50, 60, 70};
        int[] ejercito2 = {40, 80, 60};

        int[] ejercitoUnido = new int[3];

        for (int i = 0; i < ejercitoUnido.length; i++) 
        {
            ejercitoUnido[i] = ejercito1[i] + ejercito2[i];
        }
        for (int i = 0; i < ejercitoUnido.length; i++)
        {
            System.out.println(ejercitoUnido[i]);
        }

    }
}