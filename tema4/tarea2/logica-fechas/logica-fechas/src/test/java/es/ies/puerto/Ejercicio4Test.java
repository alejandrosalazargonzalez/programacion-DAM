package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

class Ejercicio4Test {
    
    @Test
    void testEsDiaFestivoNavidad() {
        LocalDate navidad = LocalDate.of(2023, 12, 25);
        boolean resultado = Ejercicio4.esDiaFestivoNacional(navidad);
        assertTrue(resultado, "El 25 de diciembre debe ser festivo");
    }

    @Test
    void testEsDiaFestivoAnoNuevo() {
        LocalDate anoNuevo = LocalDate.of(2023, 1, 1);
        boolean resultado = Ejercicio4.esDiaFestivoNacional(anoNuevo);
        assertTrue(resultado, "El 1 de enero debe ser festivo");
    }

    @Test
    void testEsDiaFestivoDiaNormal() {
        LocalDate diaNormal = LocalDate.of(2023, 7, 15);
        boolean resultado = Ejercicio4.esDiaFestivoNacional(diaNormal);
        assertFalse(resultado, "El 15 de julio no debe ser festivo");
    }

    @Test
    void testEsDiaFestivoNulo() {
        boolean resultado = Ejercicio4.esDiaFestivoNacional(null);
        assertFalse(resultado, "Una fecha nula no debe ser festivo");
    }

    @Test
    void testEsDiaFestivoAnoDiferente() {
        LocalDate navidadOtroAno = LocalDate.of(2024, 12, 25);
        boolean resultado = Ejercicio4.esDiaFestivoNacional(navidadOtroAno);
        assertTrue(resultado, "El 25 de diciembre debe ser festivo, sin importar el año");
    }
}
