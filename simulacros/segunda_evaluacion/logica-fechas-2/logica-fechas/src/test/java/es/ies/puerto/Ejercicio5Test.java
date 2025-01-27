package es.ies.puerto;

import java.time.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio5Test {

    @Test
    void testEdadMilisegundosReciente() {
        LocalDateTime fechaNacimiento = LocalDateTime.of(2000, 1, 1, 0, 0, 0, 0);
        long milisegundosTotales = Ejercicio5.calcularEdadEnMilisegundos(fechaNacimiento);
        assertTrue(milisegundosTotales > 0, "Debe haber vivido más de 0 milisegundos");
    }

    @Test
    void testEdadMilisegundosPasadoLejano() {
        // Fecha de nacimiento: 1 de enero de 1900
        LocalDateTime fechaNacimiento = LocalDateTime.of(1900, 1, 1, 0, 0, 0, 0);
        long milisegundosTotales = Ejercicio5.calcularEdadEnMilisegundos(fechaNacimiento);
        assertTrue(milisegundosTotales > 0, "Debe haber vivido más de 0 milisegundos");
    }

    @Test
    void testEdadMilisegundosBisiesto() {
        // Fecha de nacimiento: 29 de febrero de 2000 (año bisiesto)
        LocalDateTime fechaNacimiento = LocalDateTime.of(2000, 2, 29, 0, 0, 0, 0);
        long milisegundosTotales = Ejercicio5.calcularEdadEnMilisegundos(fechaNacimiento);
        assertTrue(milisegundosTotales > 0, "Debe haber vivido más de 0 milisegundos");
    }

    @Test
    void testEdadMilisegundosMismoDia() {
        LocalDateTime fechaNacimiento = LocalDateTime.now();
        long milisegundosTotales = Ejercicio5.calcularEdadEnMilisegundos(fechaNacimiento);
        assertEquals(0, milisegundosTotales,1000, "Si es la misma fecha, los milisegundos vividos deben ser 0");
    }

    @Test
    void testEdadMilisegundosNoBisiesto() {
        // Fecha de nacimiento: 1 de marzo de 2001 (no bisiesto)
        LocalDateTime fechaNacimiento = LocalDateTime.of(2001, 3, 1, 0, 0, 0, 0);
        long milisegundosTotales = Ejercicio5.calcularEdadEnMilisegundos(fechaNacimiento);
        assertTrue(milisegundosTotales > 0, "Debe haber vivido más de 0 milisegundos");
    }
}
