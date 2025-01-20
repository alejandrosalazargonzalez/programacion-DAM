package es.ies.puerto;

import java.time.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio8Test {
    
    @Test
    void testDiasDesdeInicioDelAnioFechaValidaInicioDelAnio() {
        LocalDate fecha = LocalDate.of(2023, 1, 1);
        long dias = Ejercicio8.diasDesdeInicioDelanio(fecha);
        assertEquals(1, dias, "El 1 de enero de 2023 debe devolver 1 día desde el inicio del año");
    }

    @Test
    void testDiasDesdeInicioDelAnioFechaValidaMitadDelAnio() {
        LocalDate fecha = LocalDate.of(2023, 6, 15);
        long dias = Ejercicio8.diasDesdeInicioDelanio(fecha);
        assertEquals(166, dias, "El 15 de junio de 2023 debe devolver 166 días desde el inicio del año");
    }

    @Test
    void testDiasDesdeInicioDelAnioFechaValidaFinDelAnio() {
        LocalDate fecha = LocalDate.of(2023, 12, 31);
        long dias = Ejercicio8.diasDesdeInicioDelanio(fecha);
        assertEquals(365, dias, "El 31 de diciembre de 2023 debe devolver 365 días desde el inicio del año");
    }

    @Test
    void testDiasDesdeInicioDelAnioBisiesto() {
        LocalDate fecha = LocalDate.of(2024, 12, 31);
        long dias = Ejercicio8.diasDesdeInicioDelanio(fecha);
        assertEquals(366, dias, "El 31 de diciembre de 2024 (año bisiesto) debe devolver 366 días desde el inicio del año");
    }

    @Test
    void testDiasDesdeInicioDelAnioFechaNula() {
        long dias = Ejercicio8.diasDesdeInicioDelanio(null);
        assertEquals(-1, dias, "Una fecha nula debe devolver -1");
    }
}
