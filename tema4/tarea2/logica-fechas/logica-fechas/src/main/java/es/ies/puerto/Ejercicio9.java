
package es.ies.puerto;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio9 {
    /**
     * Obtiene el primer lunes del mes
     * @param anio de la fecha
     * @param mes a analizar
     * @return LocalDate
     */
    public static LocalDate obtenerPrimerLunesDelMes(int anio, int mes) {
        if (anio < 1 || mes < 1) {
            return null;
        }
        LocalDate localDate = LocalDate.of(anio, mes, 1);

        for (int i = 0; i < localDate.lengthOfMonth(); i++) {
            if (localDate.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                return localDate;
            }
            localDate = localDate.plusDays(1);
        }
        return null;
    }
}
