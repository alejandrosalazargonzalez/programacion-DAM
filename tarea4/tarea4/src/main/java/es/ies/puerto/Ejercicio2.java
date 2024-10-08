package es.ies.puerto;

public class Ejercicio2 {

    /**
     * Los héroes de un equipo de aventureros tienen diferentes cantidades de puntos de vida.
     *  Escribe un programa que calcule la suma total de puntos de vida de todos los aventureros
     *  en un array.
     * 
     * @author alejandrosalazargonzalez
     * @version 1.0.0
     */
    public static void main(String[] args) {

        int[] puntosDeVida = {100, 200, 150, 180, 90};
        int i = 0;
        int vidatotal = 0;
            do{
                vidatotal += puntosDeVida[i];
                i++;
            }while(i < puntosDeVida.length );
            System.out.println("Total de puntos de vida =" + vidatotal);
    }
}