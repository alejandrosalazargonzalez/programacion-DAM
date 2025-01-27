package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

class Ejercicio3Test {
@Test
    void testNuevaYorkATokioLondresSidney() {
        // Fecha y hora de origen: 2025-03-15T14:30 en Nueva York
        LocalDateTime fechaHora = LocalDateTime.of(2025, 3, 15, 14, 30);
        ZoneId zonaOrigen = ZoneId.of("America/New_York");
        List<ZoneId> zonasDestino = List.of(
                ZoneId.of("Asia/Tokyo"),
                ZoneId.of("Europe/London"),
                ZoneId.of("Australia/Sydney")
        );

        // Llamada a la función
        Map<String, ZonedDateTime> conversiones = Ejercicio3.convertirZonasHorarias(fechaHora, zonaOrigen, zonasDestino);

        // Verificar las conversiones esperadas
        assertEquals(ZonedDateTime.of(2025, 3, 16, 3, 30, 0, 0, ZoneId.of("Asia/Tokyo")),
                     conversiones.get("Asia/Tokyo"));
        assertEquals(ZonedDateTime.of(2025, 3, 15, 18, 30, 0, 0, ZoneId.of("Europe/London")),
                     conversiones.get("Europe/London"));
        assertEquals(ZonedDateTime.of(2025, 3, 16, 5, 30, 0, 0, ZoneId.of("Australia/Sydney")),
                     conversiones.get("Australia/Sydney"));
    }

    @Test
    void testZonaOrigenEsUTC() {
        // Fecha y hora de origen: 2025-03-15T14:30 en UTC
        LocalDateTime fechaHora = LocalDateTime.of(2025, 3, 15, 14, 30);
        ZoneId zonaOrigen = ZoneId.of("UTC");
        List<ZoneId> zonasDestino = List.of(
                ZoneId.of("America/New_York"),
                ZoneId.of("Asia/Tokyo"),
                ZoneId.of("Europe/London")
        );

        // Llamada a la función
        Map<String, ZonedDateTime> conversiones = Ejercicio3.convertirZonasHorarias(fechaHora, zonaOrigen, zonasDestino);

        // Verificar las conversiones esperadas
        assertEquals(ZonedDateTime.of(2025, 3, 15, 10, 30, 0, 0, ZoneId.of("America/New_York")),
                     conversiones.get("America/New_York"));
        assertEquals(ZonedDateTime.of(2025, 3, 15, 23, 30, 0, 0, ZoneId.of("Asia/Tokyo")),
                     conversiones.get("Asia/Tokyo"));
        assertEquals(ZonedDateTime.of(2025, 3, 15, 14, 30, 0, 0, ZoneId.of("Europe/London")),
                     conversiones.get("Europe/London"));
    }

    @Test
    void testFechaCercanaACambioHorarioDeVerano() {
        // Fecha y hora de origen: 2025-03-09T01:30 en Nueva York (un minuto antes del cambio al horario de verano)
        LocalDateTime fechaHora = LocalDateTime.of(2025, 3, 9, 1, 30);
        ZoneId zonaOrigen = ZoneId.of("America/New_York");
        List<ZoneId> zonasDestino = List.of(
                ZoneId.of("Europe/London"),
                ZoneId.of("Asia/Tokyo"),
                ZoneId.of("Australia/Sydney")
        );

        // Llamada a la función
        Map<String, ZonedDateTime> conversiones = Ejercicio3.convertirZonasHorarias(fechaHora, zonaOrigen, zonasDestino);

        // Verificar las conversiones esperadas
        assertEquals(ZonedDateTime.of(2025, 3, 9, 6, 30, 0, 0, ZoneId.of("Europe/London")),
                     conversiones.get("Europe/London"));
        assertEquals(ZonedDateTime.of(2025, 3, 9, 15, 30, 0, 0, ZoneId.of("Asia/Tokyo")),
                     conversiones.get("Asia/Tokyo"));
        assertEquals(ZonedDateTime.of(2025, 3, 9, 17, 30, 0, 0, ZoneId.of("Australia/Sydney")),
                     conversiones.get("Australia/Sydney"));
    }

    @Test
    void testAnoBisiesto() {
        // Fecha y hora de origen: 2024-02-29T12:00 en UTC (año bisiesto)
        LocalDateTime fechaHora = LocalDateTime.of(2024, 2, 29, 12, 0);
        ZoneId zonaOrigen = ZoneId.of("UTC");
        List<ZoneId> zonasDestino = List.of(
                ZoneId.of("America/New_York"),
                ZoneId.of("Asia/Tokyo"),
                ZoneId.of("Australia/Sydney")
        );

        // Llamada a la función
        Map<String, ZonedDateTime> conversiones = Ejercicio3.convertirZonasHorarias(fechaHora, zonaOrigen, zonasDestino);

        // Verificar las conversiones esperadas
        assertEquals(ZonedDateTime.of(2024, 2, 29, 7, 0, 0, 0, ZoneId.of("America/New_York")),
                     conversiones.get("America/New_York"));
        assertEquals(ZonedDateTime.of(2024, 2, 29, 21, 0, 0, 0, ZoneId.of("Asia/Tokyo")),
                     conversiones.get("Asia/Tokyo"));
        assertEquals(ZonedDateTime.of(2024, 2, 29, 23, 0, 0, 0, ZoneId.of("Australia/Sydney")),
                     conversiones.get("Australia/Sydney"));
    }

}