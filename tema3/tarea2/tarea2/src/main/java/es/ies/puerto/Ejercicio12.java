package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio12 {
    static List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("Lunes",
    "Martes", "Miércoles", "Jueves","Viernes","Sábado",
    "Domingo"));
    public static void main(String[] args) {

        System.out.println(diasDeLaSemana);
        List<String> lista = crearSublista(diasDeLaSemana, "Lunes", "Viernes");
        System.out.println(lista);
        invertir(lista);
        System.out.println(lista);
    }

    /**
     * Metodo que crea una sublista
     * @param lista
     * @param inicio
     * @param fin
     * @return sublista
     */
    static List<String> crearSublista(List<String> lista, String inicio, String fin)
    {
        if (lista == null || lista.isEmpty())
        {
            return lista;
        }
        int posicionInicio = lista.indexOf(inicio);
        int posicionFin = lista.indexOf(fin);

        if (posicionFin < 0 || posicionInicio < 0) {
            return lista;
        }
        
        return lista.subList(posicionInicio, posicionFin);
    }

    /**
     * invierte la lista
     * @param lista
     * @return
     */
    static boolean invertir(List<String> lista)
    {
        if (lista == null || lista.isEmpty()) {
            return false;
        }
        Collections.reverse(lista);
        return true;
    }
}