
package es.ies.puerto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio8 {
    /**
     * Funcion que dice los dias que han pasado desde el inicio del año
     *  hasta la fehca marcada
     * @param fecha a ver cuantos días han pasado
     * @return long
     */
    public static long diasDesdeInicioDelanio(LocalDate fecha) {
        if (fecha == null) {
            return -1;
        }
        return fecha.getDayOfYear() ;
    }
}
