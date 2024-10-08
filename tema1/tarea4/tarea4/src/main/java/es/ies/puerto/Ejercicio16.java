package es.ies.puerto;

/**
 * El equipo de científicos del Área 51 ha registrado una lista de criaturas hostiles,
 *  y tu misión es eliminar una criatura específica del registro. Escribe un programa
 *  que elimine la criatura que ya ha sido contenida.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        String[] criaturas = {"Alien", "Monstruo del Pantano", "Demonio", "Serpiente Gigante"};
        String criaturaAEliminar = "Demonio";


        String[] nuevasCriaturas = new String[ criaturas.length - 1 ];        
        int j = 0;

        for ( int i = 0; i < criaturas.length; i++ ) 
        {
            if ( !criaturas[i].equals(criaturaAEliminar) )
            {
                nuevasCriaturas[j] = criaturas[i];
                j++;
            }
        }
        for ( int i = 0; i < nuevasCriaturas.length; i++ ) 
        {
            System.out.print( nuevasCriaturas[i] + ", " );
        }
        System.out.println();
    }
}