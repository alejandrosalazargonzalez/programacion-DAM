package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    static List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves"));
    static List<String> diasDeLaSemana2 = new ArrayList<>(Arrays.asList( "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    public static void main(String[] args) {

        System.out.println(diasDeLaSemana);
        System.out.println(diasDeLaSemana2);
        diasDeLaSemana.retainAll(diasDeLaSemana2);
        System.out.println(diasDeLaSemana);
        diasDeLaSemana.removeAll(diasDeLaSemana);
        System.out.println(diasDeLaSemana);
        List<String> listaNueva = crearlista(diasDeLaSemana2, diasDeLaSemana);
        System.out.println(listaNueva);
    }

    static List<String> crearlista(List<String> lista1,List<String> lista2)
    {
        List<String> lista3 = lista1;
        lista3.addAll(lista1);
        lista3.addAll(lista2);
        lista1.retainAll(lista2);
        lista3.removeAll(lista1);
        return lista1;
    }
}