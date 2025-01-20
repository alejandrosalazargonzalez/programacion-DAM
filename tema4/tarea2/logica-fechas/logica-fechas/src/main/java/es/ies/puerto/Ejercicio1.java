
package es.ies.puerto;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio1 {

    /**
     * Funcion encargada de calcular si una fecha es viernes 13
     * @param fechaStr String con formato fecha
     * @return true/false
     */
    public static boolean esViernes13(String fechaStr) {
        if (fechaStr == null || fechaStr.isEmpty()) {
            return false;
        }
        LocalDate localDate = LocalDate.parse(fechaStr);
        return localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY) && localDate.getDayOfMonth() == 13;
    }
}
