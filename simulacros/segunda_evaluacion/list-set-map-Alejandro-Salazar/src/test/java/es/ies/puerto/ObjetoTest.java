package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjetoTest {

    @Test
    void testEquals() {
        Objeto objeto1 = new Objeto("Objeto1", "001");
        Objeto objeto2 = new Objeto("Objeto1", "001");
        Objeto objeto3 = new Objeto("Objeto2", "002");

        assertTrue(objeto1.equals(objeto2), "Objetos should be equal with same id");
        assertFalse(objeto1.equals(objeto3), "Objetos should not be equal with different id");
    }

    @Test
    void testToString() {
        Objeto objeto = new Objeto("Objeto1", "001");
        String expectedString = "Objeto{descripcion='Objeto1', id='001'}";
        assertEquals(expectedString, objeto.toString(), "toString should return the correct string");
    }
}
