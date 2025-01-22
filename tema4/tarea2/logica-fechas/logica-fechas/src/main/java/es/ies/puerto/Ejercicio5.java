package es.ies.puerto;

import java.time.LocalDate;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    /**
     * funcion que dice el dia de la semana pasados unos dias indicados
     * @param fecha inicial
     * @param dias a añadir o quitar a la fecha inicial
     * @return String
     */
    public static String obtenerDiaDeLaSemanaEnElFuturo(LocalDate fecha, int dias) {
        if (fecha == null) {
            return null;
        }
        fecha = fecha.plusDays(dias);
        return fecha.getDayOfWeek().toString();
    }
}
