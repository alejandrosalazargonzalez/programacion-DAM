package es.ies.puerto;

/**
 * Un mago tiene una lista de hechizos en su libro mágico, pero quiere saber cuántos hechizos de ataque y cuántos de defensa tiene.
 *  Los hechizos de ataque son aquellos cuyo nombre contiene la palabra "Fuego",
 *  mientras que los de defensa contienen "Escudo". Escribe un programa que cuente los hechizos de ataque y de defensa.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String[] hechizos = {"Fuego Ardiente", "Escudo Protector", "Rayo de Fuego", "Escudo Mágico", "Flecha Helada"};
        int hechizosAtaque = 0;
        int hechizosDefensa = 0;

        for (int i = 0; i < hechizos.length; i++) 
        {
            if ( hechizos[i].contains("Fuego")) {
                hechizosAtaque++;
            }
            if (hechizos[i].contains("Escudo")) {
                hechizosDefensa++;
            }
        }
        System.out.println("El mago tiene: " + hechizosAtaque + " hechizos de ataque y : " + hechizosDefensa + " hechizos de defensa. ");
    }
}