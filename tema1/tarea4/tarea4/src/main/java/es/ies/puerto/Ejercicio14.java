package es.ies.puerto;

/**
 * Se han registrado los puntajes de las casas de Hogwarts en el Torneo de Magia. 
 *  Cada casa recibe una medalla (Oro, Plata o Bronce) según su puntuación. 
 *  Escribe un programa que cuente cuántas medallas de cada tipo ha ganado una casa.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        String[] medallas = {"Oro", "Plata", "Bronce", "Oro", "Oro", "Plata"};
        int oro = 0;
        int plata = 0;
        int bronce = 0;

        for (int i = 0; i < medallas.length; i++) {
            if (medallas[i].equalsIgnoreCase("oro")) {
                oro++;
            }
            if (medallas[i].equalsIgnoreCase("plata")) {
                plata++;
            }
            if (medallas[i].equalsIgnoreCase("bronce")) {
                bronce++;
            }
        }
            System.out.println( "Oro = " + oro + " Plata = " + plata + "Bronce = " + bronce);
    }
}