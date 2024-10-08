package es.ies.puerto;

/**
 * Un equipo de aventureros ha derrotado a un dragón y ahora
 *  deben eliminarlo del registro de criaturas vivas. Escribe
 *  un programa que elimine a esta criatura específica del array.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String[] criaturas = {"Goblin", "Dragón", "Orco", "Troll"};
        String criaturaAEliminar = "Dragón";

        String[] nuevasCriaturas = new String[ criaturas.length - 1 ];        
        int j = 0;

        for ( int i = 0; i < criaturas.length; i++ ) {
            if ( !criaturas[i].equals(criaturaAEliminar) )
            {
                nuevasCriaturas[j] = criaturas[i];
                j++;
            }
        }
        for ( int i = 0; i < nuevasCriaturas.length; i++ ) {
            System.out.println( nuevasCriaturas[i] );
        }
    }
}