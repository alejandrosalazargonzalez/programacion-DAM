package es.ies.puerto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        List<ResultadoExamen> resultados = new ArrayList<>();

        resultados.add(new ResultadoExamen("Fran", 10));
        resultados.add(new ResultadoExamen("Santiago", 8));
        resultados.add(new ResultadoExamen("Samuel", 4));
        resultados.add(new ResultadoExamen("Diego", 7));
        resultados.add(new ResultadoExamen("Marcos", 10));
        resultados.add(new ResultadoExamen("Alejandro", 2));

        System.out.println( resultados);

        System.out.println(tresMejores(resultados));
        System.out.println(debajoMedia(resultados));

    }

    /**
     * Metodo que ordena la lista colocando los 3 mejores estudiantes primero
     *  y retorna una sublista con ellos
     * @param lista
     * @return
     */
    static List<ResultadoExamen> tresMejores(List<ResultadoExamen> lista)
    {
        Collections.sort(lista, Comparator.comparingDouble(ResultadoExamen::getNota).reversed());
        return lista.subList(0,3);
    }

    /**
     * Metodo que retorna una lista con los estudiantes que estan debajo de la
     * media
     * @param lista
     * @return
     */
    static List<ResultadoExamen> debajoMedia(List<ResultadoExamen> lista)
    {
        double notasTotal = 0;
        for (ResultadoExamen estudiante : lista)
        {
            notasTotal += estudiante.getNota();
        }

        double promedio = notasTotal / lista.size();
        List<ResultadoExamen> debajoDeLaMedia = new ArrayList<>();

        for (ResultadoExamen estudiante : lista)
        {
            if (estudiante.getNota() < promedio)
            {
                debajoDeLaMedia.add(estudiante);
            }
        }
        return debajoDeLaMedia;
    }
}