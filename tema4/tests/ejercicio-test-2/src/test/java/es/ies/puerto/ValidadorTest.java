package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class ValidadorTest {
    static Validador validador;

    @BeforeAll
    public static void beforeAll(){
        validador = new Validador();
    }

    @Test
    void procesarNumeroAritmeticExcetionTest(){
        try {
            validador.procesarNumero(0);
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                Assertions.assertTrue(e.getMessage().contains("cero"));
            }else{
                Assertions.fail("Error no controlado"+e.getMessage());
            }
        }
    }

    @Test
    void procesarNumeroIlegalArgumentTest(){
        try {
            validador.procesarNumero(-1);
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                Assertions.assertTrue(e.getMessage().contains("negativo"));
            }else{
                Assertions.fail("Error no controlado"+e.getMessage());
            }
        }
    }

    @Test
    void procesarNullPointerExeptionTest(){
        try {
            validador.procesarNumero(100000);
        } catch (Exception e) {
            if (e instanceof NullPointerException) {
                Assertions.assertTrue(e.getMessage().contains("grande"));
            }else{
                Assertions.fail("Error no controlado"+e.getMessage());
            }
        }
    }

    @Test
    void procesarNumero100Test(){
        try {
            validador.procesarNumero(100);
        } catch (Exception e) {
            Assertions.fail("Error no controlado"+e.getMessage());
        }
    }

    @Test
    void procesarNumero3Test(){
        try {
            validador.procesarNumero(3);
        } catch (Exception e) {
            Assertions.fail("Error no controlado"+e.getMessage());
        }
    }

    

}
