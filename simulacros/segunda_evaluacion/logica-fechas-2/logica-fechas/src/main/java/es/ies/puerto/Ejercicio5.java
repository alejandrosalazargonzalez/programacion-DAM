package es.ies.puerto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.time.DayOfWeek;
import java.time.Duration;

public class Ejercicio5 {
    
    public static long calcularEdadEnMilisegundos(LocalDateTime fechaNacimiento) {
        if (fechaNacimiento == null) {
            return -1;
        }
        if (fechaNacimiento.getMinute() <= 0) {
            return 0l;
        }
        return fechaNacimiento.compareTo(LocalDateTime.now())*24l*60l*60l*1000l;
    }
}
