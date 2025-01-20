package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Month;

class Ejercicio6Test {

    @Test
    void testObtenerFinesDeSemanaMesCompleto() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(2023, Month.JANUARY);
        assertEquals(9, finesDeSemana, "Enero de 2023 debería tener 8 fines de semana (sábado y domingo)");
    }

    @Test
    void testObtenerFinesDeSemanaFebreroBisiesto() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(2024, Month.FEBRUARY);
        assertEquals(8, finesDeSemana, "Febrero de 2024 (bisiesto) debería tener 8 fines de semana");
    }

    @Test
    void testObtenerFinesDeSemanaFebreroNoBisiesto() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(2023, Month.FEBRUARY);
        assertEquals(8, finesDeSemana, "Febrero de 2023 (no bisiesto) debería tener 8 fines de semana");
    }

    @Test
    void testObtenerFinesDeSemanaMesCon31Dias() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(2023, Month.MARCH);
        assertEquals(8, finesDeSemana, "Marzo de 2023 debería tener 8 fines de semana");
    }

    @Test
    void testObtenerFinesDeSemanaMesCon30Dias() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(2023, Month.APRIL);
        assertEquals(10, finesDeSemana, "Abril de 2023 debería tener 8 fines de semana");
    }

    @Test
    void testObtenerFinesDeSemanaAnioNegativo() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(-2023, Month.JANUARY);
        assertEquals(-1, finesDeSemana, "Un año negativo debería devolver -1");
    }

    @Test
    void testObtenerFinesDeSemanaMesNulo() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(2023, null);
        assertEquals(-1, finesDeSemana, "Un mes nulo debería devolver -1");
    }

    @Test
    void testObtenerFinesDeSemanaAnioCero() {
        int finesDeSemana = Ejercicio6.obtenerFinesDeSemana(0, Month.JANUARY);
        assertEquals(-1, finesDeSemana, "El año cero debería devolver -1");
    }

}
