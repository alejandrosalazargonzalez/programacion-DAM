package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

class Ejercicio3Test {

    @Test
    void testUltimoViernesEnero2023() {
        LocalDate ultimoViernes = Ejercicio3.obtenerUltimoViernes(2023, Month.JANUARY);
        assertEquals(LocalDate.of(2023, Month.JANUARY, 27), ultimoViernes, "El último viernes de enero de 2023 debe ser el 27");
    }

    @Test
    void testUltimoViernesFebrero2024Bisiesto() {
        LocalDate ultimoViernes = Ejercicio3.obtenerUltimoViernes(2024, Month.FEBRUARY);
        assertEquals(LocalDate.of(2024, Month.FEBRUARY, 23), ultimoViernes, "El último viernes de febrero de 2024 debe ser el 23");
    }

    @Test
    void testUltimoViernesDiciembre2023() {
        LocalDate ultimoViernes = Ejercicio3.obtenerUltimoViernes(2023, Month.DECEMBER);
        assertEquals(LocalDate.of(2023, Month.DECEMBER, 29), ultimoViernes, "El último viernes de diciembre de 2023 debe ser el 29");
    }

    @Test
    void testUltimoViernesConAnioNegativo() {
        LocalDate ultimoViernes = Ejercicio3.obtenerUltimoViernes(-2023, Month.JANUARY);
        assertNull(ultimoViernes, "Un año negativo debe devolver null");
    }

    @Test
    void testUltimoViernesConMesNulo() {
        LocalDate ultimoViernes = Ejercicio3.obtenerUltimoViernes(2023, null);
        assertNull(ultimoViernes, "Un mes nulo debe devolver null");
    }

    @Test
    void testUltimoViernesConAnioCero() {
        LocalDate ultimoViernes = Ejercicio3.obtenerUltimoViernes(0, Month.JANUARY);
        assertNull(ultimoViernes, "El año cero debe devolver null");
    }}
