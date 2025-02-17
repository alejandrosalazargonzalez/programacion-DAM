
package es.ies.puerto;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    Calculadora calculadora ;
    
    @BeforeEach
    void BeforeEach(){
        calculadora = new Calculadora();
    }
    @Test
    void sumarTest(){
        int resultado = calculadora.sumar(2, 3);
        Assertions.assertEquals(5, resultado, "El resultado de la suma no es el esperado");
    }

    @Test
    void restarTest(){
        int resultado = calculadora.restar(2, 3);
        Assertions.assertEquals(-1, resultado, "El resultado de la resta no es el esperado");
    }
    @Test
    void multiplicarTest(){
        int resultado = calculadora.multiplicar(2, 3);
        Assertions.assertEquals(6, resultado, "El resultado de la multiplicacion no es el esperado");
    }

    @Test
    void dividirTest(){
        double resultado = calculadora.dividir(10, 2);
        Assertions.assertEquals(5, resultado, "El resultado de la division no es el esperado");
    }
/* 
    @Test
    void dividirEntreCeroTest(){
        double resultado = calculadora.dividir(10, 0);
        Assertions.assertThrows(ArithmeticException, null);
    } */
}
