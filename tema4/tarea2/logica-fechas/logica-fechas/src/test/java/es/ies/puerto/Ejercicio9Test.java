package es.ies.puerto;

import java.time.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio9Test {

    @Test
    void testObtenerPrimerLunesDelMesFechaValidaInicioDeMes() {
        LocalDate primerLunes = Ejercicio9.obtenerPrimerLunesDelMes(2023, 5);
        assertEquals(LocalDate.of(2023, 5, 1), primerLunes, "El primer lunes de mayo de 2023 debe ser el 1 de mayo");
    }

    @Test
    void testObtenerPrimerLunesDelMesFechaValidaMedioDeMes() {
        LocalDate primerLunes = Ejercicio9.obtenerPrimerLunesDelMes(2023, 6);
        assertEquals(LocalDate.of(2023, 6, 5), primerLunes, "El primer lunes de junio de 2023 debe ser el 5 de junio");
    }

    @Test
    void testObtenerPrimerLunesDelMesFebreroBisiesto() {
        LocalDate primerLunes = Ejercicio9.obtenerPrimerLunesDelMes(2024, 2);
        assertEquals(LocalDate.of(2024, 2, 5), primerLunes, "El primer lunes de febrero de 2024 debe ser el 5 de febrero");
    }

    @Test
    void testObtenerPrimerLunesDelMesMesInvalido() {
        LocalDate primerLunes = Ejercicio9.obtenerPrimerLunesDelMes(2023, 0);
        assertNull(primerLunes, "Un mes inválido (0) debe devolver null");
    }

    @Test
    void testObtenerPrimerLunesDelMesAnioNegativo() {
        LocalDate primerLunes = Ejercicio9.obtenerPrimerLunesDelMes(-2023, 5);
        assertNull(primerLunes, "Un año negativo debe devolver null");
    }

    @Test
    void testObtenerPrimerLunesDelMesAnioCero() {
        LocalDate primerLunes = Ejercicio9.obtenerPrimerLunesDelMes(0, 5);
        assertNull(primerLunes, "El año cero debe devolver null");
    }
}
