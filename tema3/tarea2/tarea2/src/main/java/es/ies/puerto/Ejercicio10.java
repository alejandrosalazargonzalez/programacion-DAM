
package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio10 {

    static List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("Lunes",
        "Martes", "Miércoles", "Jueves","Viernes","Sábado",
        "Domingo"));
    public static void main(String[] args) {
        System.out.println( diasDeLaSemana);
        comprobar(diasDeLaSemana);
        System.out.println(diasDeLaSemana);
    }

    /**
     * Metodo que comprueba si los elementos de una lista tienen un tamaño 
     * mayor que 5
     * @param lista
     * @return
     */
    static List<String> comprobar(List<String> lista)
    {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).trim().length() > 5)
            {
                comprobar(i,lista);
            }
        }
        return lista;
    }

    /**
     * Metodo que sustituye un elemento de una lista por GENERICO
     * @param posicion
     * @param lista
     * @return
     */
    static List<String> comprobar(int posicion, List<String> lista)
    {
        lista.set(posicion,"GENERICO");
        return lista;
    }



}