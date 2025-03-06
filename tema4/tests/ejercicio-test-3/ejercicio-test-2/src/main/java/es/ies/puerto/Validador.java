package es.ies.puerto;

public class Validador {
    public int procesarNumero(int numero) throws IllegalArgumentException, ArithmeticException, NullPointerException {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (numero == 0) {
            throw new ArithmeticException("El número no puede ser cero para esta operación");
        }
        if (numero > 1000) {
            throw new NullPointerException("El número es demasiado grande");
        }

        int resultado = numero * 2;
        
        if (resultado % 10 == 0) {
            System.out.println("El resultado es múltiplo de 10");
        } else if (resultado % 5 == 0) {
            System.out.println("El resultado es múltiplo de 5");
        } else {
            System.out.println("El resultado es un número normal");
        }
        
        return resultado;
    }
}
