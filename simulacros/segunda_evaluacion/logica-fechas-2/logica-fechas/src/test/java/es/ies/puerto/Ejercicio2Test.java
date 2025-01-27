package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

class Ejercicio2Test {
@Test
    void testUltimosViernes2023() {
        List<LocalDate> ultimosViernes = Ejercicio2.obtenerUltimosViernes(2023);
        assertEquals(LocalDate.of(2023, 1, 27), ultimosViernes.get(0));
        assertEquals(LocalDate.of(2023, 2, 24), ultimosViernes.get(1));
        assertEquals(LocalDate.of(2023, 3, 31), ultimosViernes.get(2));
        assertEquals(LocalDate.of(2023, 4, 28), ultimosViernes.get(3));
        assertEquals(LocalDate.of(2023, 5, 26), ultimosViernes.get(4));
        assertEquals(LocalDate.of(2023, 6, 30), ultimosViernes.get(5));
        assertEquals(LocalDate.of(2023, 7, 28), ultimosViernes.get(6));
        assertEquals(LocalDate.of(2023, 8, 25), ultimosViernes.get(7));
        assertEquals(LocalDate.of(2023, 9, 29), ultimosViernes.get(8));
        assertEquals(LocalDate.of(2023, 10, 27), ultimosViernes.get(9));
        assertEquals(LocalDate.of(2023, 11, 24), ultimosViernes.get(10));
        assertEquals(LocalDate.of(2023, 12, 29), ultimosViernes.get(11));
    }

    @Test
    void testUltimosViernesAno0() {
        List<LocalDate> ultimosViernes = Ejercicio2.obtenerUltimosViernes(0);
        assertNotNull(ultimosViernes);
        assertTrue(ultimosViernes.isEmpty());
    }

    @Test
    void testUltimosViernesAnoNegativo() {
        List<LocalDate> ultimosViernes = Ejercicio2.obtenerUltimosViernes(-2023);
        assertNotNull(ultimosViernes);
        assertTrue(ultimosViernes.isEmpty());
    }

    @Test
    void testUltimosViernesDeAno2024() {
        List<LocalDate> ultimosViernes = Ejercicio2.obtenerUltimosViernes(2024);
        assertEquals(LocalDate.of(2024, 1, 26), ultimosViernes.get(0));
        assertEquals(LocalDate.of(2024, 2, 23), ultimosViernes.get(1));
        assertEquals(LocalDate.of(2024, 3, 29), ultimosViernes.get(2));
        assertEquals(LocalDate.of(2024, 4, 26), ultimosViernes.get(3));
        assertEquals(LocalDate.of(2024, 5, 31), ultimosViernes.get(4));
        assertEquals(LocalDate.of(2024, 6, 28), ultimosViernes.get(5));
        assertEquals(LocalDate.of(2024, 7, 26), ultimosViernes.get(6));
        assertEquals(LocalDate.of(2024, 8, 30), ultimosViernes.get(7));
        assertEquals(LocalDate.of(2024, 9, 27), ultimosViernes.get(8));
        assertEquals(LocalDate.of(2024, 10, 25), ultimosViernes.get(9));
        assertEquals(LocalDate.of(2024, 11, 29), ultimosViernes.get(10));
        assertEquals(LocalDate.of(2024, 12, 27), ultimosViernes.get(11));
    }

}
