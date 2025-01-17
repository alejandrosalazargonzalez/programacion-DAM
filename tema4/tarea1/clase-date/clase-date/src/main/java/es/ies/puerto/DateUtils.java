package es.ies.puerto;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateUtils {

    /**
     * Crea una nueva fecha
     * @return Date()
     */
    public static Date createDate() {
        return new Date();
    }

    /**
     * Compara dos fechas
     * @param date1 fecha 1
     * @param date2 fecha 2
     * @return true/false
     */
    public static boolean compareDates(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return false;
        }
        return date1.before(date2);
    }

    /**
     * Aniade dias a una fecha
     * @param date fecha original
     * @param days a sumar
     * @return Date
     */
    public static Date addDaysToDate(Date date, int days) {
        if (date == null || days < 0) {
            return date;
        }
        long fechaMilisegundos = date.getTime() + days*24L*60*60*1000; 
        return new Date(fechaMilisegundos);
    }

    /**
     * cambia el formato de la fecha
     * @param date a modificar formato
     * @return String
     */
    public static String formatDate(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-mm-dd");
        return simpleDateFormat.format(date);
    }

    /**
     * calcula la diferencia entre dos fechas
     * @param date1
     * @param date2
     * @return
     */
    public static long calculateDateDifference(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return 0l;
        }
        return date1.compareTo(date2);
    }

    public static LocalDate getCurrentLocalDate() {
        return null;
    }

    public static LocalDate createSpecificLocalDate(int year, int month, int day) {
        return null;
    }

    public static LocalDate addDays(LocalDate date, int days) {
        return null;
    }

    public static boolean isBefore(LocalDate date1, LocalDate date2) {
        return false;
    }

    public static Period calculatePeriodBetween(LocalDate start, LocalDate end) {
        return null;
    }

    public static LocalTime getCurrentLocalTime() {
        return null;    
    }

    public static LocalTime addMinutes(LocalTime time, int minutes) {
        return null;
    }

    public static boolean isTimeBefore(LocalTime time1, LocalTime time2) {
        return false;
    }

    
    public static LocalDateTime getCurrentLocalDateTime() {
        return null;
    }

    public static LocalDateTime addHours(LocalDateTime dateTime, int hours) {
        return null;
    }

    public static LocalDateTime subtractMonths(LocalDateTime dateTime, int months) {
        return null;
    }

    public static ZonedDateTime getZonedDateTime(String zoneId) {
        return null;
    }

    public static ZonedDateTime convertZone(ZonedDateTime dateTime, String targetZoneId) {
        return null;
    }

    public static LocalDate getFirstDayOfMonth(LocalDate date) {
        return null;
    }

    public static LocalDate getLastDayOfMonth(LocalDate date) {
        return null;
    }

    public static boolean isLeapYear(LocalDate date) {
        return false;
    }

    public static Duration measureExecutionTime(Runnable task) {
        return null;
    }

    public static LocalDate parseDate(String date, String format) throws DateTimeParseException {
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Vamos a probar los algoritmos " + formatDate(new Date()));
    }
}