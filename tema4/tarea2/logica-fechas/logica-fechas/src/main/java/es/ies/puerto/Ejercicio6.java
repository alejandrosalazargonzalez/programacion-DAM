
package es.ies.puerto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio6 {

    /**
     * Funcion que cuenta cuantos fines de semana hay en cada mes
     * @param anio del mes a calcular
     * @param mes al que se le van a contar dos fines de semana
     * @return int
     */
    public static int obtenerFinesDeSemana(int anio, Month mes) {   
        if (anio < 1 || mes == null) {
            return -1;
        }
        LocalDate localDate = LocalDate.of(anio, mes, 1);
        int finesSemana = 0;
        for (int i = 0; i < mes.length(Year.isLeap(anio)); i++) {
            if (localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) ||
                localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                finesSemana++;
            }
            localDate = localDate.plusDays(1);
        }
        return finesSemana;
    }
}
