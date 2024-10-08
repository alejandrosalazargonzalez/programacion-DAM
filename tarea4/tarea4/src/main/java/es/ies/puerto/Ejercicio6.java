package es.ies.puerto;

/**
 * Un droide está buscando un cristal Kyber en una lista de recursos recolectados por el equipo rebelde.
 *  Escribe un programa que busque un valor específico en el array y verifique si el cristal Kyber está presente.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] recursos = {"Bláster", "Cristal Kyber", "Sable de luz", "Pistola"};
        String recursoBuscado = "Cristal Kyber";


        int i = 0;
        while (!recursos[i].equals(recursoBuscado))
        {
            System.out.println(recursos[i]);    
            i++;
            System.out.println(recursos[i]);
        }
        System.out.println(" Se ha encontrado el Crital Kyber ");
    }
}