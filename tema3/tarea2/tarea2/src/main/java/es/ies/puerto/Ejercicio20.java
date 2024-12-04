package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio20 {
    static List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("Lunes",
        "Martes", "Miércoles", "Jueves","Viernes","Sábado",
        "Domingo"));
    public static void main(String[] args) {
        System.out.println(diasDeLaSemana);
        reemplazar(diasDeLaSemana, 'm');
        System.out.println(diasDeLaSemana);
    }

    /**
     * Metodo que reemplaza todos los metodos que empiezan por una letra por "reemplazo"
     * @param lista
     * @param letra
     * @return
     */
    static boolean reemplazar(List<String> lista, char letra)
    {
        if (lista == null) {
            return false;
        }
        for (String nombre : lista) {
            char[] letras = nombre.trim().toLowerCase().toCharArray();
            if (letras[0] == letra)
            {
                lista.set(lista.indexOf(nombre), "Reemplazo");
            }
        }
        return true;
    }
}