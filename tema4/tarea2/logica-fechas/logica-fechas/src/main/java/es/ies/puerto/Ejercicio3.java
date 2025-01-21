
package es.ies.puerto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio3 {

    /**
     * Funcion que saca el ultimo viernes 
     * @param anio de la fecha
     * @param mes a sacar el viernes
     * @return LocalDate
     */
    public static LocalDate obtenerUltimoViernes(int anio, Month mes) {
        if(anio < 1 || mes == null){
            return null;
        }
        LocalDate localDate = LocalDate.of(anio, mes, mes.length(Year.isLeap(anio)));
        while (localDate.getDayOfWeek() != DayOfWeek.FRIDAY) {
            localDate =  localDate.minusDays(1);
        }
        return localDate;
    }
}
