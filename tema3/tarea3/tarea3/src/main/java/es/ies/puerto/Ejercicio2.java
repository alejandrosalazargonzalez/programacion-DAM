package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    static List<String> lista = new ArrayList<>(Arrays.asList("Hola","Mundo","Bonito"));
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Metodo que optiene el elemento de una posicion
     * @param lista
     * @param posicion
     * @return
     */
    static String obtenerElemento(List<String> lista,int posicion)
    {
        if (posicion >= lista.size() || posicion < 0 || lista.isEmpty() || lista == null)
        {
            return "";
        }
        return lista.get(posicion);
    }

}