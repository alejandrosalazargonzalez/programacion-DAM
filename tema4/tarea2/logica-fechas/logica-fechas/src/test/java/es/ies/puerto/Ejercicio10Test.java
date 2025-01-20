package es.ies.puerto;

import java.time.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio10Test {

    @Test
    void testDiferenciaEnDiasPositiva() {
        LocalDate fecha1 = LocalDate.of(2025, 1, 1);
        LocalDate fecha2 = LocalDate.of(2025, 1, 10);
        
        long resultado = Ejercicio10.calcularDiferenciaEnDias(fecha1, fecha2);
        
        assertEquals(9, resultado, "La diferencia en días debe ser 9.");
    }

    @Test
    void testDiferenciaEnDiasNegativa() {
        LocalDate fecha1 = LocalDate.of(2025, 1, 10);
        LocalDate fecha2 = LocalDate.of(2025, 1, 1);
        
        long resultado = Ejercicio10.calcularDiferenciaEnDias(fecha1, fecha2);
        
        assertEquals(-9, resultado, "La diferencia en días debe ser -9.");
    }

    @Test
    void testDiferenciaEnDiasCero() {
        LocalDate fecha1 = LocalDate.of(2025, 1, 10);
        LocalDate fecha2 = LocalDate.of(2025, 1, 10);
        
        long resultado = Ejercicio10.calcularDiferenciaEnDias(fecha1, fecha2);
        
        assertEquals(0, resultado, "La diferencia en días debe ser 0.");
    }

    @Test
    void testFechasNulas() {
        LocalDate fecha1 = null;
        LocalDate fecha2 = LocalDate.of(2025, 1, 10);
        
        long resultado = Ejercicio10.calcularDiferenciaEnDias(fecha1, fecha2);
        
        assertEquals(-1, resultado, "Si alguna fecha es nula, el resultado debe ser -1.");
        
        fecha1 = LocalDate.of(2025, 1, 10);
        fecha2 = null;
        
        resultado = Ejercicio10.calcularDiferenciaEnDias(fecha1, fecha2);
        
        assertEquals(-1, resultado, "Si alguna fecha es nula, el resultado debe ser -1.");
    }
}
