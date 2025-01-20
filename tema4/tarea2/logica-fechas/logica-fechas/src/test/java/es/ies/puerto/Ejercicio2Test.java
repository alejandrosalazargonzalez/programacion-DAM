package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Month;

class Ejercicio2Test {
    @Test
    void testObtenerDiasDelMes() {
        assertEquals(28, Ejercicio2.obtenerDiasDelMes(2025, Month.FEBRUARY));
    }


    @Test
    void testDiasDeEnero() {
        int dias = Ejercicio2.obtenerDiasDelMes(2023, Month.JANUARY);
        assertEquals(31, dias, "Enero debe tener 31 días");
    }

    @Test
    void testDiasDeFebreroNoBisiesto() {
        int dias = Ejercicio2.obtenerDiasDelMes(2023, Month.FEBRUARY);
        assertEquals(28, dias, "Febrero en un anio no bisiesto debe tener 28 días");
    }

    @Test
    void testDiasDeFebreroBisiesto() {
        int dias = Ejercicio2.obtenerDiasDelMes(2024, Month.FEBRUARY);
        assertEquals(29, dias, "Febrero en un anio bisiesto debe tener 29 días");
    }

    @Test
    void testDiasDeAbril() {
        int dias = Ejercicio2.obtenerDiasDelMes(2023, Month.APRIL);
        assertEquals(30, dias, "Abril debe tener 30 días");
    }

    @Test
    void testDiasDeJulio() {
        int dias = Ejercicio2.obtenerDiasDelMes(2023, Month.JULY);
        assertEquals(31, dias, "Julio debe tener 31 días");
    }

    @Test
    void testFebreroEnAnoSecularNoBisiesto() {
        int dias = Ejercicio2.obtenerDiasDelMes(1900, Month.FEBRUARY);
        assertEquals(28, dias, "Febrero en 1900 (anio secular no bisiesto) debe tener 28 días");
    }

    @Test
    void testFebreroEnAnoSecularBisiesto() {
        int dias = Ejercicio2.obtenerDiasDelMes(2000, Month.FEBRUARY);
        assertEquals(29, dias, "Febrero en 2000 (anio secular bisiesto) debe tener 29 días");
    }
    @Test
    void testAnioNulo() {
        assertEquals(-1, Ejercicio2.obtenerDiasDelMes(0, Month.JANUARY), "El anio nulo debería lanzar NullPointerException");
    }

    @Test
    void testMesNulo() {
        assertEquals(-1,Ejercicio2.obtenerDiasDelMes(2023, null), "El mes nulo debería lanzar NullPointerException");
    }

    @Test
    void testAnioYMesNulos() {
        assertEquals(-1,Ejercicio2.obtenerDiasDelMes(0, null), "El anio y mes nulos deberían lanzar NullPointerException");
    }
}
