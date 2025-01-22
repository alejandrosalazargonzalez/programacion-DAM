
package es.ies.puerto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio7 {
    /**
     * Dice que dia es el dia de la madre basandose en el segundo sabado de mayo
     * @param anio que se va a comprobar
     * @return LocalDate
     */
    public static LocalDate obtenerDiaDeLaMadre(int anio) {
        if (anio < 1) {
            return null;
        }
        Month mes = Month.MAY;
        LocalDate localDate = LocalDate.of(anio,mes,1);
        int sabados = 0;
        for (int i = 0; i < mes.length(Year.isLeap(anio)); i++) {
            if (localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                sabados++;
            }
            localDate = localDate.plusDays(1);
            if (sabados == 2) {
                return localDate;
            }
        }
        return null;
    }
}
