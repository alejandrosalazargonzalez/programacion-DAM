package es.ies.puerto;

import java.util.Scanner;

/**
 * Dado un hechizo como "Expecto Patronum",
 *  crea un programa que verifique si comienza
 *  con "Expecto" y termina con "Patronum".
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio22 {
    public static void main(String[] args) {

        String hechizo = "Expecto Patronum";
        String[] hechizoArray = hechizo.split(" ");
        boolean correcto = false;
        if (hechizoArray[0].equals("Expecto") && 
        hechizoArray[hechizoArray.length - 1 ].equals("Patronum"))
        {
            correcto = true;
        } else
        {
            correcto = false;
        }

        System.out.println(correcto);

    }
}