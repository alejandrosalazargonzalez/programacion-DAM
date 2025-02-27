package es.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.*;

public class Fecha {

    /**
     * Da la fecha y la hora actual
     * @return LocalDateTime
     */
    public LocalDateTime obtenerFechaHoraActual() {
        return LocalDateTime.now();
    }

    /**
     * Da la fecha actual
     * @return LocalDate
     */
    public LocalDate obtenerFechaActual() {
        return LocalDate.now();
    }

    /**
     * Convierte un string a LocalDate
     * @param fechaStr fecha en string
     * @param formato formato a dar a la fecha
     * @return LocalDate
     */
    public LocalDate convertirStringALocalDate(String fechaStr, String formato) {
        if (fechaStr == null || fechaStr.isEmpty() || formato == null || formato.isEmpty()) {
            return null;
        }
        return LocalDate.parse(fechaStr,DateTimeFormatter.ofPattern(formato));
    }

    /**
     * Da formato a la fecha
     * @param fecha fecha a formatear
     * @param formato formato de la fecha
     * @return
     */
    public String formatearFecha(LocalDate fecha, String formato) {
        if (fecha == null || formato == null || formato.isEmpty()) {
            return null;
        }
        return fecha.format(DateTimeFormatter.ofPattern(formato));
    }

    /**
     * Calcula la edad
     * @param fechaNacimiento  
     * @return int
     */
    public int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            return -1;
        }
        return LocalDate.now().compareTo(fechaNacimiento);
    }

    /**
     * Suma dias a una fecha
     * @param fecha a sumar dias
     * @param dias a sumar a la fechas
     * @return LocalDate
     */
    public LocalDate sumarDias(LocalDate fecha, int dias) {
        if (fecha == null || dias < 0) {
            return null;
        }
        return fecha.plusDays(dias);
    }

    /**
     * resta dias a una fecha
     * @param fecha a restar dias
     * @param dias que se restan a la fecha
     * @return LocalDate
     */
    public LocalDate restarDias(LocalDate fecha, int dias) {
        if (fecha == null || dias < 0) {
            return null;
        }
        return fecha.minusDays(dias);
    }

    /**
     * Suma meses a una fecha
     * @param fecha a la que se le suman los meses 
     * @param meses a sumar a la fecha
     * @return LocalDate
     */
    public LocalDate sumarMeses(LocalDate fecha, int meses) {
        if (fecha == null || meses < 0) {
            return null;
        }
        return fecha.plusMonths(meses);
    }

    /**
     * resta meses a una fecha
     * @param fecha a restar meses
     * @param meses que se restan a la fecha
     * @return LocalDate
     */
    public LocalDate restarMeses(LocalDate fecha, int meses) {
        if (fecha == null || meses < 0) {
            return null;
        }
        return fecha.minusMonths(meses);
    }

    /**
     * Calcula la direfencia de dias
     * @param fecha1
     * @param fecha2
     * @return long
     */
    public long diferenciaDias(LocalDate fecha1, LocalDate fecha2) {
        if (fecha1 == null || fecha2 == null) {
            return -1;
        }
        if (fecha2.isBefore(fecha2)) {
        return fecha1.compareTo(fecha2);
        }else{
            return fecha2.compareTo(fecha1);    
        }
    }

    /**
     * calcula la diferencia en meses
     * @param fecha1
     * @param fecha2
     * @return long
     */
    public long diferenciaMeses(LocalDate fecha1, LocalDate fecha2) {
        if (fecha1 == null || fecha2 == null) {
            return -1;
        }
        if (fecha2.isBefore(fecha1)) {
            return fecha2.until(fecha1).getMonths();
        } else
        {
            return fecha1.until(fecha2).getMonths();
        }
        
        /* 
        if (fecha1 == null || fecha2 == null) {
            return -1;
        }
        long contador = 0;
        if (!fecha1.equals(fecha2)) {    
            if (fecha2.isBefore(fecha1)) {
                while (!((fecha1.getMonth() == fecha2.getMonth()) && (fecha1.getYear() == fecha2.getYear()))) {
                    fecha1 = fecha1.minusMonths(1);
                    contador++;
                }
            } else {
                while (!((fecha1.getMonth() == fecha2.getMonth()) && (fecha1.getYear() == fecha2.getYear()))) {
                    fecha2 = fecha2.minusMonths(1);
                    contador++;
                }
            }
        }
    return contador;
     */
    }

    /**
     * Calcula la diferencia de anios
     * @param fecha1
     * @param fecha2
     * @return long
     */
    public long diferenciaAnios(LocalDate fecha1, LocalDate fecha2) {
        if (fecha1 == null || fecha2 == null) {
            return -1;
        }
        if (fecha2.isBefore(fecha1)) {
            return fecha2.until(fecha1).getYears();
        } else
        {
            return fecha1.until(fecha2).getYears();
        }
    }

    /**
     * Compara dos fechas
     * @param fecha1
     * @param fecha2
     * @return int
     */
    public int compararFechas(LocalDate fecha1, LocalDate fecha2) {
        if (fecha1 == null || fecha2 == null) {
            return -1;
        }
        if (fecha2.isBefore(fecha1)) {
            return fecha2.compareTo(fecha1);
        } else{
            return fecha1.compareTo(fecha2);
        }
    }

    /**
     * Dice si un anio es bisiesto
     * @param fecha a comprobar
     * @return true/false
     */
    public boolean esBisiesto(LocalDate fecha) {
        if (fecha == null) {
            return false;
        }
        return fecha.isLeapYear();
    }

    /**
     * Obtiene el dia de la semana
     * @param fecha
     * @return String
     */
    public String obtenerDiaSemana(LocalDate fecha) {
        return fecha.getDayOfWeek().toString();
    }

    /**
     * Obtiene el dia del anio
     * @param fecha 
     * @return int
     */
    public int obtenerDiaDelAnio(LocalDate fecha) {
        if (fecha == null) {
            return -1;
        }
        return fecha.getDayOfYear();
    }

    /**
     * obtiene el primer dia del mes
     * @param fecha
     * @return LocalDate 
     */
    public LocalDate obtenerPrimerDiaMes(LocalDate fecha) {
        if (fecha  == null) {
            return null;
        }
        return fecha.withDayOfMonth(1);
    }

    /**
     * obtiene el ultimo dia del mes
     * @param fecha
     * @return LocalDate
     */
    public LocalDate obtenerUltimoDiaMes(LocalDate fecha) {
        if (fecha == null) {
            return null;
        }
        return fecha.withDayOfMonth(fecha.lengthOfMonth());
    }

    /**
     * Convierte la zona horario
     * @param fechaHora
     * @param zona
     * @return ZoneDateTime
     */
    public ZonedDateTime convertirZonaHoraria(LocalDateTime fechaHora, String zona) {
        if (fechaHora == null || zona == null || zona.isEmpty() ) {
            return null;
        }
        return fechaHora.atZone(ZoneId.of(zona));
    }

    /**
     * Calcula la diferencia en horas y minutos
     * @param inicio
     * @param fin
     * @return Duration
     */
    public Duration calcularDiferenciaHorasMinutos(LocalDateTime inicio, LocalDateTime fin) {
        if (inicio == null || fin == null) {
            return null;
        }
        return Duration.between(inicio, fin);
    }
}
