package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio7 {
    static List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("Lunes",
        "Martes","Lunes", "Miércoles", "Jueves","Viernes","Sábado", "Viernes", "Sábado",
        "Domingo","Martes"));
    public static void main(String[] args) {
        System.out.println(diasDeLaSemana);
        List<String> nuevaSemana = noDuplicados(diasDeLaSemana);
        System.out.println(nuevaSemana);
    }

    /**
     * Metodo que crea una lista sin duplicados
     * @param lista
     * @return
     */
    static List<String> noDuplicados(List<String> lista)
    {
        List<String> nuevaLista = new ArrayList<>();
        for (String palabra : lista) {
            if (!nuevaLista.contains(palabra)) {
                nuevaLista.add(palabra);
            }
        }
        return nuevaLista;
    }
}