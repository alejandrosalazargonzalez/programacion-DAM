package es.ies.puerto;

import java.time.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio6Test {

    @Test
    void testObtenerProximoEclipse() {
        List<LocalDateTime> eclipses = Arrays.asList(
            LocalDateTime.of(2024, 10, 2, 0, 0),
            LocalDateTime.of(2025, 4, 8, 0, 0),
            LocalDateTime.of(2026, 8, 12, 0, 0),
            LocalDateTime.of(2027, 5, 20, 0, 0)
        );
        
        LocalDateTime fechaReferencia = LocalDateTime.of(2025, 1, 1, 0, 0);
        
        LocalDateTime proximoEclipse = Ejercicio6.obtenerProximoEclipse(eclipses, fechaReferencia);
        
        assertEquals(LocalDateTime.of(2025, 4, 8, 0, 0), proximoEclipse);
    }

    @Test
    void testObtenerProximoEclipseSinEclipsesFuturos() {
        List<LocalDateTime> eclipses = Arrays.asList(
            LocalDateTime.of(2024, 10, 2, 0, 0)
        );
        
        LocalDateTime fechaReferencia = LocalDateTime.of(2025, 1, 1, 0, 0);

        assertThrows(IllegalArgumentException.class, () -> {
            Ejercicio6.obtenerProximoEclipse(eclipses, fechaReferencia);
        });
    }

    @Test
    void testObtenerProximoEclipseConFechaExacta() {
        List<LocalDateTime> eclipses = Arrays.asList(
            LocalDateTime.of(2025, 4, 8, 0, 0)
        );
        
        LocalDateTime fechaReferencia = LocalDateTime.of(2025, 1, 1, 0, 0);
        
        LocalDateTime proximoEclipse = Ejercicio6.obtenerProximoEclipse(eclipses, fechaReferencia);
        
        assertEquals(LocalDateTime.of(2025, 4, 8, 0, 0), proximoEclipse);
    }

}
