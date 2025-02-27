package es.test.tres;

import org.junit.jupiter.api.*;

public class TareaTest {
    
    Tarea tarea;

    @BeforeEach
    void beforeEach(){
        tarea = new Tarea(1, "crear una lista");
    }

    @Test
    void idNoValidoTest(){
        try {
            Tarea tarea2 = new Tarea(-1, "null");
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void descripcionNulaTest(){
        try {
            Tarea tarea2 = new Tarea(2, null);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void descripcionEmptyTest(){
        try {
            Tarea tarea2 = new Tarea(2, "");
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void soloIdNoValidoTest(){
        try {
            Tarea tarea2 = new Tarea(-1);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválidos"));
        }
    }

    @Test
    void getIdTest(){
        Assertions.assertEquals(1, tarea.getId());
    }

    @Test
    void getDescripcionTest(){
        Assertions.assertEquals("crear una lista", tarea.getDescripcion());
    }
    
    @Test
    void completadaFalse(){
        Assertions.assertFalse(tarea.isCompletada());
    }

    @Test
    void completadaCambiar(){
        tarea.setCompletada(true);
        Assertions.assertTrue(tarea.isCompletada());
    }

    @Test
    void assertEqualsTest(){
        Assertions.assertEquals(tarea, tarea);
    }

    @Test
    void assertEqualsIdTest(){
        Tarea tarea2 = new Tarea(1);
        Assertions.assertEquals(tarea2, tarea);
    }

    @Test
    void assertEqualsFalse(){
        Assertions.assertFalse(tarea.equals("tarea"));
    }
}
