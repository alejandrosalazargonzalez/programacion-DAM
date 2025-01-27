package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {
    @Test
    void testMismaFecha() {
        LocalDateTime inicio = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(inicio, resultado, "Las fechas son iguales, el resultado debería ser la misma fecha.");
    }

    @Test
    void testUnAnoDeDiferencia() {
        LocalDateTime inicio = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2021, 1, 1, 0, 0, 0), resultado, "Debe ser 1 año de diferencia.");
    }

    @Test
    void testMesBisiesto() {
        LocalDateTime inicio = LocalDateTime.of(2020, 2, 29, 23, 59, 59); // Año bisiesto
        LocalDateTime fin = LocalDateTime.of(2021, 2, 28, 23, 59, 59); // Un año después (sin bisiesto)
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2021, 2, 28, 23, 59, 59), resultado, "Diferencia de un año, considerando el bisiesto.");
    }

    @Test
    void testDiferenciaEnHoras() {
        LocalDateTime inicio = LocalDateTime.of(2023, 1, 1, 10, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2023, 1, 1, 12, 0, 0);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2023, 1, 1, 12, 0, 0), resultado, "Diferencia de 2 horas.");
    }

    @Test
    void testDiferenciaConMinutosYSegundos() {
        LocalDateTime inicio = LocalDateTime.of(2023, 1, 1, 12, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2023, 1, 1, 14, 30, 15);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2023, 1, 1, 14, 30, 15), resultado, "Diferencia de 2 horas, 30 minutos y 15 segundos.");
    }

    @Test
    void testDiferenciaConMeses() {
        LocalDateTime inicio = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2023, 6, 1, 0, 0, 0);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2023, 6, 1, 0, 0, 0), resultado, "Diferencia de 5 meses.");
    }

    @Test
    void testCruceDeAno() {
        LocalDateTime inicio = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        LocalDateTime fin = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2021, 1, 1, 0, 0, 0), resultado, "Diferencia de 1 segundo.");
    }

    @Test
    void testDiferenciaConSegundos() {
        LocalDateTime inicio = LocalDateTime.of(2022, 5, 5, 12, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2022, 5, 5, 12, 0, 30);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2022, 5, 5, 12, 0, 30), resultado, "Diferencia de 30 segundos.");
    }

    @Test
    void testDiferenciaCruzandoVariosAños() {
        LocalDateTime inicio = LocalDateTime.of(2020, 2, 29, 23, 45, 30); // Año bisiesto
        LocalDateTime fin = LocalDateTime.of(2025, 1, 1, 8, 15, 45);
        LocalDateTime resultado = Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        assertEquals(LocalDateTime.of(2025, 1, 1, 8, 15, 45), resultado, "Diferencia de 4 años, 10 meses, 1 día, 8 horas, 30 minutos, 15 segundos.");
    }

    @Test
    void testFechaInicioPosteriorAFechaFin() {
        LocalDateTime inicio = LocalDateTime.of(2025, 1, 1, 8, 15, 45);
        LocalDateTime fin = LocalDateTime.of(2020, 2, 29, 23, 45, 30);
        assertThrows(IllegalArgumentException.class, () -> {
            Ejercicio1.calcularDiferenciaFechas(inicio, fin);
        }, "La fecha de inicio no puede ser posterior a la fecha final.");
    }
}
