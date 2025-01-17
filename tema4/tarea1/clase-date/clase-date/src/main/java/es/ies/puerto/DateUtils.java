package es.ies.puerto;

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


    public static Date createDate() {
        return null;
    }

    public static boolean compareDates(Date date1, Date date2) {
        return false;
    }

    public static Date addDaysToDate(Date date, int days) {
        return null;
    }

    public static String formatDate(Date date) {
        return null;
    }

    public static long calculateDateDifference(Date date1, Date date2) {
        return 0l;
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
        System.out.println("Vamos a probar los algoritmos");
    }
}