package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {
    @Test
    void test2025EsViernes13() {
        assertTrue(Ejercicio1.esViernes13("2025-06-13"));
    }

    @Test
    void test2025EsViernes13False() {
        assertFalse(Ejercicio1.esViernes13("2025-09-13"));
    }

    @Test
    void test2025EsViernes13True() {
        assertTrue(Ejercicio1.esViernes13("2025-06-13"));
    }

    @Test
    void test2026EsViernes13() {
        assertTrue(Ejercicio1.esViernes13("2026-02-13"));
    }

    @Test
    void testEsViernes13Null() {
        assertFalse(Ejercicio1.esViernes13(null));
    }

    @Test
    void testEsViernes13Empty() {
        assertFalse(Ejercicio1.esViernes13(""));
    }
}
