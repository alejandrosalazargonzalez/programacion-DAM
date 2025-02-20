package es.ies.puerto;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double dividir(int a, int b) {
        a = evaluarValor(a);
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    public int evaluarValor(int valor){
        for (int i = 1; i < valor; i++) {
            if (valor > 1000) {
                throw new OutOfMemoryError("null");
            }else{
                if(valor < -1000){
                    throw new OutOfMemoryError("null");
                } else if (valor == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero");
                } else if (valor == 1) {
                    throw new ArithmeticException("valor pequenio");
                }
            }
        }
            return valor;
        }
}
