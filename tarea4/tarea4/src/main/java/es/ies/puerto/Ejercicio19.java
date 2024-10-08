package es.ies.puerto;

/**
 * 
 * Un alquimista ha creado varias pociones y desea organizar su almacén.
 *  Las pociones curativas contienen la palabra "Curación". Escribe un
 *  programa que separe las pociones curativas de las otras.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        String[] pociones = {"Poción de Curación", "Poción de Veneno", "Curación Mayor", "Poción de Invisibilidad"};
        String[] pocionesDeCuracion = new String[2];
        String[] pocionesVarias = new String[2];

        int contadorCuraciones = 0;
        int contadorVarias = 0;
        for (int i = 0; i < pociones.length; i++) 
        {
            if (pociones[i].contains("Curación")) 
            {
                pocionesDeCuracion[contadorCuraciones] = pociones[i];
                contadorCuraciones++;
            } else
            {
                pocionesVarias[contadorVarias] = pociones[i];
                contadorVarias++;
            }
        }
        for (int i = 0; i < pocionesDeCuracion.length; i++) 
        {
            System.out.print(pocionesDeCuracion[i] + ", ");    
        }
            System.out.print(" y ");
        for (int i = 0; i < pocionesVarias.length; i++) 
        {
            System.out.print(pocionesVarias[i] +", ");    
        }
        System.out.println();
    }
}