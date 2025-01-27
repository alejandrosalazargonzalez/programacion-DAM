package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

class Ejercicio4Test {
    
    @Test
    void testAniosFuturosPositivos() {
        List<LocalDate> diasBisiestos = Ejercicio4.obtenerDiasBisiestos(50);
        assertEquals(12, diasBisiestos.size(), "Debería haber 12 días bisiestos en los próximos 50 años.");
        assertTrue(diasBisiestos.contains(LocalDate.of(2028, 2, 29)), "Debe incluir 2028-02-29.");
        assertTrue(diasBisiestos.contains(LocalDate.of(2064, 2, 29)), "Debe incluir 2064-02-29.");
    }

    @Test
    void testUnAnioFuturo() {
        List<LocalDate> diasBisiestos = Ejercicio4.obtenerDiasBisiestos(1);
        assertEquals(0, diasBisiestos.size(), "No debería haber días bisiestos en el próximo año.");
    }

    @Test
    void testCincoAniosFuturos() {
        List<LocalDate> diasBisiestos = Ejercicio4.obtenerDiasBisiestos(5);
        assertEquals(1, diasBisiestos.size(), "Debería haber 1 día bisiesto en los próximos 5 años.");
        assertEquals(LocalDate.of(2028, 2, 29), diasBisiestos.get(0), "El único día bisiesto debería ser 2028-02-29.");
    }

    @Test
    void testAnioActualBisiesto() {
        // Si el año actual es bisiesto, debe incluirse
        int anioActual = LocalDate.now().getYear();
        if ((anioActual % 4 == 0 && anioActual % 100 != 0) || (anioActual % 400 == 0)) {
            List<LocalDate> diasBisiestos = Ejercicio4.obtenerDiasBisiestos(1);
            assertEquals(1, diasBisiestos.size(), "Debe incluir el año actual si es bisiesto.");
            assertEquals(LocalDate.of(anioActual, 2, 29), diasBisiestos.get(0), "Debe incluir 29 de febrero del año actual.");
        }
    }

    @Test
    void testAnioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Ejercicio4.obtenerDiasBisiestos(-1);
        });
        assertEquals("El número de años futuros debe ser mayor a 0.", exception.getMessage());
    }

    @Test
    void testAnioCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Ejercicio4.obtenerDiasBisiestos(0);
        });
        assertEquals("El número de años futuros debe ser mayor a 0.", exception.getMessage());
    }

    @Test
    void testSoloProximosAniosBisiestos() {
        List<LocalDate> diasBisiestos = Ejercicio4.obtenerDiasBisiestos(12);
        assertEquals(3, diasBisiestos.size(), "Debería haber 3 días bisiestos en los próximos 12 años.");
        assertEquals(LocalDate.of(2028, 2, 29), diasBisiestos.get(0));
        assertEquals(LocalDate.of(2032, 2, 29), diasBisiestos.get(1));
        assertEquals(LocalDate.of(2036, 2, 29), diasBisiestos.get(2));
    }


    @Test
    void testProximos0AniosDesdeAnioBisiesto() {
        int anioActual = LocalDate.now().getYear();
        int siguienteAnioBisiesto = (anioActual % 4 == 0 && (anioActual % 100 != 0 || anioActual % 400 == 0)) ? anioActual : anioActual + (4 - (anioActual % 4));
        List<LocalDate> diasBisiestos = Ejercicio4.obtenerDiasBisiestos(1);
        assertTrue(diasBisiestos.isEmpty() || diasBisiestos.contains(LocalDate.of(siguienteAnioBisiesto, 2, 29)));
    }
}
