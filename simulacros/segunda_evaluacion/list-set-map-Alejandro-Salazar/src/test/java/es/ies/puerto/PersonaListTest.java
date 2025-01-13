package es.ies.puerto;

import org.junit.jupiter.api.Test;

import es.ies.puerto.list.PersonaList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PersonaListTest {

    @Test
    public void testAgregarPersona() {
        PersonaList lista = new PersonaList();
        Persona persona = new Persona("Juan", 30, "12345678A");

        // Agregar una persona
        boolean agregado = lista.agregar(persona);
        assertTrue(agregado);

        // Verificar que está en la lista
        List<Persona> personas = lista.listar();
        assertEquals(1, personas.size());
        assertEquals(persona, personas.get(0));

        // Intentar agregar una persona duplicada
        boolean duplicado = lista.agregar(persona);
        assertFalse(duplicado);
    }

    @Test
    public void testListarPersonas() {
        PersonaList lista = new PersonaList();
        Persona persona1 = new Persona("Juan", 30, "12345678A");
        Persona persona2 = new Persona("Maria", 25, "87654321B");

        // Agregar personas
        lista.agregar(persona1);
        lista.agregar(persona2);

        // Listar personas
        List<Persona> personas = lista.listar();
        assertEquals(2, personas.size());
        assertTrue(personas.contains(persona1));
        assertTrue(personas.contains(persona2));
    }

    @Test
    public void testBuscarPersona() {
        PersonaList lista = new PersonaList();
        Persona persona = new Persona("Juan", 30, "12345678A");

        // Agregar persona
        lista.agregar(persona);

        // Buscar persona existente
        Persona encontrada = lista.buscar("12345678A");
        assertNotNull(encontrada);
        assertEquals(persona, encontrada);

        // Buscar persona inexistente
        Persona noEncontrada = lista.buscar("00000000Z");
        assertNull(noEncontrada);
    }

    @Test
    public void testActualizarPersona() {
        PersonaList lista = new PersonaList();
        Persona persona = new Persona("Juan", 30, "12345678A");
        Persona nuevaPersona = new Persona("Juan Actualizado", 35, "12345678A");

        // Agregar persona
        lista.agregar(persona);

        // Actualizar persona existente
        boolean actualizado = lista.actualizar("12345678A", nuevaPersona);
        assertTrue(actualizado);

        // Verificar cambios
        Persona actualizada = lista.buscar("12345678A");
        assertNotNull(actualizada);
        assertEquals(nuevaPersona, actualizada);

        // Intentar actualizar persona inexistente
        boolean noActualizado = lista.actualizar("00000000Z", nuevaPersona);
        assertFalse(noActualizado);
    }

    @Test
    public void testEliminarPersona() {
        PersonaList lista = new PersonaList();
        Persona persona = new Persona("Juan", 30, "12345678A");

        // Agregar persona
        lista.agregar(persona);

        // Eliminar persona existente
        boolean eliminado = lista.eliminar("12345678A");
        assertTrue(eliminado);

        // Verificar que ya no está en la lista
        Persona noEncontrada = lista.buscar("12345678A");
        assertNull(noEncontrada);

        // Intentar eliminar persona inexistente
        boolean noEliminado = lista.eliminar("00000000Z");
        assertFalse(noEliminado);
    }
}
