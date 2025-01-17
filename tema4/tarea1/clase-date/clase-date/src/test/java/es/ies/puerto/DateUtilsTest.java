package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.time.zone.ZoneRulesException;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilsTest {
    
    @Test
    void testCreateDate() {
        assertNotNull(DateUtils.createDate());
    }

    @Test
    void testCompareDates() {
        Date date1 = new Date(System.currentTimeMillis() - 1000);
        Date date2 = new Date();
        assertTrue(DateUtils.compareDates(date1, date2));
    }

    @Test
    void testAddDaysToDate() {
        Date today = new Date();
        Date result = DateUtils.addDaysToDate(today, 10);
        assertTrue(result.after(today));
    }

    @Test
    void testFormatDate() {
        Date today = new Date();
        String formatted = DateUtils.formatDate(today);
        assertEquals(10, formatted.length());
    }

    @Test
    void testCalculateDateDifference() {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() - 86400000L); // 1 day ago
        assertEquals(1, DateUtils.calculateDateDifference(date1, date2));
    }

    @Test
    void testGetCurrentLocalDate() {
        assertNotNull(DateUtils.getCurrentLocalDate());
    }

    @Test
    void testCreateSpecificLocalDate() {
        LocalDate date = DateUtils.createSpecificLocalDate(2025, 1, 9);
        assertEquals(2025, date.getYear());
        assertEquals(1, date.getMonthValue());
        assertEquals(9, date.getDayOfMonth());
    }

    @Test
    void testAddDays() {
        LocalDate date = LocalDate.of(2025, 1, 1);
        assertEquals(11, DateUtils.addDays(date, 10).getDayOfMonth());
    }

    @Test
    void testIsBefore() {
        LocalDate date1 = LocalDate.of(2025, 1, 1);
        LocalDate date2 = LocalDate.of(2025, 1, 10);
        assertTrue(DateUtils.isBefore(date1, date2));
    }

    @Test
    void testCalculatePeriodBetween() {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2025, 1, 1);
        Period period = DateUtils.calculatePeriodBetween(start, end);
        assertEquals(5, period.getYears());
    }
        @Test
    void testGetCurrentLocalTimeNotNull() {
        assertNotNull(DateUtils.getCurrentLocalTime());
    }

    @Test
    void testGetCurrentLocalTimeAccurate() {
        LocalTime systemTime = LocalTime.now();
        LocalTime result = DateUtils.getCurrentLocalTime();
        assertTrue(Duration.between(systemTime, result).getSeconds() < 2);
    }

    // Tests para addMinutes
    @Test
    void testAddMinutesPositive() {
        LocalTime time = LocalTime.of(14, 30);
        assertEquals(LocalTime.of(15, 15), DateUtils.addMinutes(time, 45));
    }

    @Test
    void testAddMinutesNegative() {
        LocalTime time = LocalTime.of(14, 30);
        assertEquals(LocalTime.of(13, 45), DateUtils.addMinutes(time, -45));
    }

    // Tests para isTimeBefore
    @Test
    void testIsTimeBeforeTrue() {
        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(11, 30);
        assertTrue(DateUtils.isTimeBefore(time1, time2));
    }

    @Test
    void testIsTimeBeforeFalse() {
        LocalTime time1 = LocalTime.of(12, 30);
        LocalTime time2 = LocalTime.of(11, 30);
        assertFalse(DateUtils.isTimeBefore(time1, time2));
    }

    // Tests para getCurrentLocalDateTime
    @Test
    void testGetCurrentLocalDateTimeNotNull() {
        assertNotNull(DateUtils.getCurrentLocalDateTime());
    }

    @Test
    void testGetCurrentLocalDateTimeAccurate() {
        LocalDateTime systemDateTime = LocalDateTime.now();
        LocalDateTime result = DateUtils.getCurrentLocalDateTime();
        assertTrue(Duration.between(systemDateTime, result).getSeconds() < 2);
    }

    // Tests para addHours
    @Test
    void testAddHoursPositive() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 1, 10, 0);
        assertEquals(LocalDateTime.of(2025, 1, 1, 15, 0), DateUtils.addHours(dateTime, 5));
    }

    @Test
    void testAddHoursNegative() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 1, 10, 0);
        assertEquals(LocalDateTime.of(2025, 1, 1, 5, 0), DateUtils.addHours(dateTime, -5));
    }

    // Tests para subtractMonths
    @Test
    void testSubtractMonthsPositive() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 6, 15, 10, 0);
        assertEquals(LocalDateTime.of(2025, 4, 15, 10, 0), DateUtils.subtractMonths(dateTime, 2));
    }

    @Test
    void testSubtractMonthsCrossYear() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 15, 10, 0);
        assertEquals(LocalDateTime.of(2024, 11, 15, 10, 0), DateUtils.subtractMonths(dateTime, 2));
    }

    // Tests para getZonedDateTime
    @Test
    void testGetZonedDateTimeValidZone() {
        ZonedDateTime zonedDateTime = DateUtils.getZonedDateTime("Europe/Madrid");
        assertEquals("Europe/Madrid", zonedDateTime.getZone().getId());
    }

    @Test
    void testGetZonedDateTimeInvalidZone() {
        assertThrows(ZoneRulesException.class, () -> DateUtils.getZonedDateTime("Invalid/Zone"));
    }

    // Tests para convertZone
    @Test
    void testConvertZoneValid() {
        ZonedDateTime dateTime = ZonedDateTime.of(2025, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"));
        ZonedDateTime converted = DateUtils.convertZone(dateTime, "America/New_York");
        assertEquals("America/New_York", converted.getZone().getId());
    }

    @Test
    void testConvertZoneInvalidTargetZone() {
        ZonedDateTime dateTime = ZonedDateTime.of(2025, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"));
        assertThrows(ZoneRulesException.class, () -> DateUtils.convertZone(dateTime, "Invalid/Zone"));
    }

    // Tests para getFirstDayOfMonth
    @Test
    void testGetFirstDayOfMonthValid() {
        LocalDate date = LocalDate.of(2025, 1, 15);
        assertEquals(LocalDate.of(2025, 1, 1), DateUtils.getFirstDayOfMonth(date));
    }

    @Test
    void testGetFirstDayOfMonthBoundary() {
        LocalDate date = LocalDate.of(2025, 12, 31);
        assertEquals(LocalDate.of(2025, 12, 1), DateUtils.getFirstDayOfMonth(date));
    }

    // Tests para getLastDayOfMonth
    @Test
    void testGetLastDayOfMonthValid() {
        LocalDate date = LocalDate.of(2025, 1, 15);
        assertEquals(LocalDate.of(2025, 1, 31), DateUtils.getLastDayOfMonth(date));
    }

    @Test
    void testGetLastDayOfMonthLeapYear() {
        LocalDate date = LocalDate.of(2024, 2, 15);
        assertEquals(LocalDate.of(2024, 2, 29), DateUtils.getLastDayOfMonth(date));
    }

    // Tests para isLeapYear
    @Test
    void testIsLeapYearTrue() {
        LocalDate date = LocalDate.of(2024, 1, 1);
        assertTrue(DateUtils.isLeapYear(date));
    }

    @Test
    void testIsLeapYearFalse() {
        LocalDate date = LocalDate.of(2025, 1, 1);
        assertFalse(DateUtils.isLeapYear(date));
    }

    // Tests para measureExecutionTime
    @Test
    void testMeasureExecutionTimeFastTask() {
        Runnable task = () -> {};
        Duration duration = DateUtils.measureExecutionTime(task);
        assertTrue(duration.toMillis() >= 0);
    }

    @Test
    void testMeasureExecutionTimeSlowTask() {
        Runnable task = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Duration duration = DateUtils.measureExecutionTime(task);
        assertTrue(duration.toMillis() >= 100);
    }

    // Tests para parseDate
    @Test
    void testParseDateValid() {
        LocalDate date = DateUtils.parseDate("2025-01-15", "yyyy-MM-dd");
        assertEquals(LocalDate.of(2025, 1, 15), date);
    }

    @Test
    void testParseDateInvalidFormat() {
        assertThrows(DateTimeParseException.class, () -> DateUtils.parseDate("15-01-2025", "yyyy-MM-dd"));
    }
}
