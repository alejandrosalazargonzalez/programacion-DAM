package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.Test;

class Ejercicio7Test {
    @Test
    void testObtenerDiaDeLaMadreAnioValido() {
        LocalDate diaDeLaMadre = Ejercicio7.obtenerDiaDeLaMadre(2023);
        assertEquals(LocalDate.of(2023, 5, 14), diaDeLaMadre, "El Día de la Madre en 2023 debe ser el 14 de mayo");
    }

    @Test
    void testObtenerDiaDeLaMadreAnioBisiesto() {
        LocalDate diaDeLaMadre = Ejercicio7.obtenerDiaDeLaMadre(2024);
        assertEquals(LocalDate.of(2024, 5, 12), diaDeLaMadre, "El Día de la Madre en 2024 debe ser el 12 de mayo");
    }

    @Test
    void testObtenerDiaDeLaMadreAnioAntiguo() {
        LocalDate diaDeLaMadre = Ejercicio7.obtenerDiaDeLaMadre(1990);
        assertEquals(LocalDate.of(1990, 5, 13), diaDeLaMadre, "El Día de la Madre en 1990 debe ser el 13 de mayo");
    }

    @Test
    void testObtenerDiaDeLaMadreAnioNegativo() {
        LocalDate diaDeLaMadre = Ejercicio7.obtenerDiaDeLaMadre(-2023);
        assertNull(diaDeLaMadre, "Un año negativo debe devolver null");
    }

    @Test
    void testObtenerDiaDeLaMadreAnioCero() {
        LocalDate diaDeLaMadre = Ejercicio7.obtenerDiaDeLaMadre(0);
        assertNull(diaDeLaMadre, "El año cero debe devolver null");
    }
}
