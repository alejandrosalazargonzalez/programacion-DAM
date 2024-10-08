package es.ies.puerto;

/**
 * Dos equipos de héroes han recolectado botines durante una misión conjunta.
 *  Escribe un programa que combine ambos inventarios de botines en uno solo.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {

        String[] botinEquipo1 = {"Espada mágica", "Escudo resistente"};
        String[] botinEquipo2 = {"Anillo de poder", "Armadura encantada"};

        String[] botinTotal = new String[ botinEquipo1.length + botinEquipo2.length];

        for(int i = 0; i < botinTotal.length ; i++)
        {
            if( i < botinEquipo1.length )
            {
                botinTotal[i] = botinEquipo1[i];
            }
            if ( i >= botinEquipo2.length ) {
                botinTotal[i] = botinEquipo2[i - botinEquipo2.length];
            }
        }
        
        for ( int i = 0; i < botinTotal.length; i++) {
            System.out.print( botinTotal[i] + ", " );
        }
        System.out.println();
    }
}