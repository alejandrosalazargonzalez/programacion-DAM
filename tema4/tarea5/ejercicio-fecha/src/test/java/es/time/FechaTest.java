package es.time;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FechaTest {
    
    static Fecha fechaUtils;

    @BeforeAll 
    static void beforeAll() {
        fechaUtils = new Fecha();
    }

    @Test
    void testObtenerFechaActual() {
        assertNotNull(fechaUtils.obtenerFechaActual());
    }

    @Test
    void testConvertirStringALocalDate() {
        LocalDate fecha = fechaUtils. convertirStringALocalDate("2025-03-01", "yyyy-MM-dd");
        assertEquals(LocalDate.of(2025, 3, 1), fecha);
    }

    @Test
    void testConvertirStringALocalDateNull() {
        LocalDate fecha = fechaUtils. convertirStringALocalDate(null, null);
        assertNull(fecha);
    }

    @Test
    void testConvertirStringALocalDateIsEmpty() {
        LocalDate fecha = fechaUtils. convertirStringALocalDate(null, null);
        assertNull(fecha);
    }

    @Test
    void testFormatearFecha() {
        LocalDate fecha = LocalDate.of(2025, 3, 1);
        assertEquals("01/03/2025", fechaUtils.formatearFecha(fecha, "dd/MM/yyyy"));
    }

    @Test
    void testCalcularEdad() {
        LocalDate nacimiento = LocalDate.of(2000, 1, 1);
        int edad = fechaUtils.calcularEdad(nacimiento);
        assertTrue(edad >= 24); 
    }

    @Test
    void testSumarDias() {
        LocalDate fecha = LocalDate.of(2025, 3, 1);
        assertEquals(LocalDate.of(2025, 3, 11), fechaUtils.sumarDias(fecha, 10));
    }

    @Test
    void testRestarDias() {
        LocalDate fecha = LocalDate.of(2025, 3, 1);
        assertEquals(LocalDate.of(2025, 2, 26), fechaUtils.restarDias(fecha, 3));
    }

    @Test
    void testDiferenciaDias() {
        LocalDate fecha1 = LocalDate.of(2025, 3, 1);
        LocalDate fecha2 = LocalDate.of(2025, 3, 10);
        assertEquals(9, fechaUtils.diferenciaDias(fecha1, fecha2));
    }

    @Test
    void testDiferenciaMeses() {
        LocalDate fecha1 = LocalDate.of(2025, 6, 1);
        LocalDate fecha2 = LocalDate.of(2025, 3, 1);
        assertEquals(3, fechaUtils.diferenciaMeses(fecha1, fecha2));
    }

    @Test
    void testDiferenciaAnios() {
        LocalDate fecha1 = LocalDate.of(2025, 6, 10);
        LocalDate fecha2 = LocalDate.of(2035, 6, 10);
        assertEquals(10, fechaUtils.diferenciaAnios(fecha1, fecha2));
    }
    
    @Test
    void testCompararFechas() {
        LocalDate fecha1 = LocalDate.of(2025, 3, 1);
        LocalDate fecha2 = LocalDate.of(2025, 3, 10);
        assertTrue(fechaUtils.compararFechas(fecha1, fecha2) < 0);
    }

    @Test
    void testEsBisiesto() {
        assertTrue(fechaUtils.esBisiesto(LocalDate.of(2024, 1, 1)));
        assertFalse(fechaUtils.esBisiesto(LocalDate.of(2023, 1, 1)));
    }

    @Test
    void testObtenerDiaSemana() {
        LocalDate fecha = LocalDate.of(2025, 3, 1);
        assertEquals("SATURDAY", fechaUtils.obtenerDiaSemana(fecha));
    }

    @Test
    void testObtenerUltimoDiaMes() {
        LocalDate fecha = LocalDate.of(2025, 2, 15);
        assertEquals(LocalDate.of(2025, 2, 28), fechaUtils.obtenerUltimoDiaMes(fecha));
    }

    @Test
    void testCalcularDiferenciaHorasMinutos() {
        LocalDateTime inicio = LocalDateTime.of(2025, 3, 1, 10, 30);
        LocalDateTime fin = LocalDateTime.of(2025, 3, 1, 15, 45);
        Duration duracion = fechaUtils.calcularDiferenciaHorasMinutos(inicio, fin);
        assertEquals(5, duracion.toHours());
        assertEquals(15, duracion.toMinutes() % 60);
    }
}
