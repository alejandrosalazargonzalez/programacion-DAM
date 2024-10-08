package es.ies.puerto;

/**
 * Dos equipos de superhéroes han decidido fusionarse para enfrentar una amenaza mayor.
 *  Escribe un programa que combine ambos equipos en un solo array, sin que se repita ningún nombre.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        String[] equipo1 = {"Ironman", "Thor", "Hulk"};
        String[] equipo2 = {"Capitán América", "Thor", "Hawkeye"};

        String[] equipoFusion = new String[equipo1.length + equipo2.length];
        boolean repetido = false;

        for (int i = 0; i < equipo1.length; i++) {
            equipoFusion[i] = equipo1[i];
        }
        for (int j = 0; j < equipo2.length; j++) 
        {
            repetido = false;
            if( equipoFusion[j].equals(equipo2[j]))
            {
                repetido = true;
            }
            if (!repetido) 
            {
                equipoFusion[j + equipo1.length ] = equipo2[j];
            }
        }        
        for (int i = 0; i < equipoFusion.length; i++) 
        {
            System.out.println(equipoFusion[i]);
        }

    }
}