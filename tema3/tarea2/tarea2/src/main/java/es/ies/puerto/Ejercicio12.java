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
    static List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves"));

    public static void main(String[] args) {

        System.out.println(diasDeLaSemana);
        List<String> lista = crearSublista(diasDeLaSemana, "Lunes", "Miércoles");
        System.out.println(lista);
        Collections.reverse(lista);
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
        return lista.subList(posicionFin, posicionFin);
    }
}