package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio18 {
    static List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("Lunes",
        "Martes", "Miércoles", "Jueves","Viernes","Sábado",
        "Domingo"));
        static List<String> diasDeLaSemana2 = new ArrayList<>(Arrays.asList("Lunes",
        "Martes"));
    public static void main(String[] args) {
    
        System.out.println(diasDeLaSemana);
        System.out.println(diasDeLaSemana2);

        System.out.println(crearTercera(diasDeLaSemana, diasDeLaSemana2));
    }

    /**
     * Metodo que crea una lista con los elementos de la primera lista que no
     * estan en la segunda
     * @param lista1
     * @param lista2
     * @return
     */
    static List<String> crearTercera(List<String> lista1, List<String> lista2)
    {
        List<String> nuevaLista = new ArrayList<>();
        nuevaLista.addAll(lista1);
        nuevaLista.removeAll(lista2);

        return nuevaLista;
    }
}