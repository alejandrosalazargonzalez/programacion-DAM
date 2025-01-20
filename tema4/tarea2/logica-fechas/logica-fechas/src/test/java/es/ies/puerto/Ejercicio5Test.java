package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class Ejercicio5Test {
    @Test
    void testObtenerDiaDeLaSemanaEnElFuturoDiasPositivos() {
        LocalDate fecha = LocalDate.of(2023, 1, 1); 
        String diaDeLaSemana = Ejercicio5.obtenerDiaDeLaSemanaEnElFuturo(fecha, 5);
        assertEquals("FRIDAY", diaDeLaSemana, "Sumando 5 días al 1 de enero de 2023 (domingo) debería dar viernes");
    }

    @Test
    void testObtenerDiaDeLaSemanaEnElFuturoDiasNegativos() {
        LocalDate fecha = LocalDate.of(2023, 1, 10); 
        String diaDeLaSemana = Ejercicio5.obtenerDiaDeLaSemanaEnElFuturo(fecha, -7);
        assertEquals("TUESDAY", diaDeLaSemana, "Restando 7 días al 10 de enero de 2023 (martes) debería dar martes");
    }

    @Test
    void testObtenerDiaDeLaSemanaEnElFuturoCeroDias() {
        LocalDate fecha = LocalDate.of(2023, 5, 15); // Lunes
        String diaDeLaSemana = Ejercicio5.obtenerDiaDeLaSemanaEnElFuturo(fecha, 0);
        assertEquals("MONDAY", diaDeLaSemana, "Sumando 0 días al 15 de mayo de 2023 (lunes) debería dar lunes");
    }

    @Test
    void testObtenerDiaDeLaSemanaEnElFuturoFechaNula() {
        assertNull(Ejercicio5.obtenerDiaDeLaSemanaEnElFuturo(null, 10), "Una fecha nula debería lanzar un null");
    }
}
