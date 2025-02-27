package es.test.tres;

import org.junit.jupiter.api.*;

public class GestorDeTareasTest {

    GestorDeTareas gestorDeTareas;

    @BeforeEach
    void beforeEach(){
        gestorDeTareas = new GestorDeTareas();
        Tarea tarea1 = new Tarea(1, "Destruir francia");
        Tarea tarea2 = new Tarea(2, "Comprar leche");
        gestorDeTareas.agregarTarea(tarea1);
        gestorDeTareas.agregarTarea(tarea2);
    }

    @Test
    void agregarTareaTest(){
        gestorDeTareas.agregarTarea(new Tarea(3, "Estudiar programacion"));
        Assertions.assertEquals(3, gestorDeTareas.obtenerTodasTareas().size());
    }
    
    @Test
    void agregarTareaNoDescripcionTest(){
        Tarea tarea = new Tarea(3, " ");

        try {
            gestorDeTareas.agregarTarea(tarea);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválida"));
        }
        }

    @Test
    void agregarTareaNullTest(){
        Tarea tarea = null;
        try {
        gestorDeTareas.agregarTarea(tarea);
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("inválida"));
        }
    }

    @Test
    void completarTareaTest(){
        Assertions.assertTrue(gestorDeTareas.completarTarea(2));
    }

    @Test
    void completarTareaNoExisteTest(){
        Assertions.assertFalse(gestorDeTareas.completarTarea(99));
    }

    @Test
    void obtenerTareasPendientesTest(){
        Assertions.assertEquals(2, gestorDeTareas.obtenerTareasPendientes().size());
    }
    
}
