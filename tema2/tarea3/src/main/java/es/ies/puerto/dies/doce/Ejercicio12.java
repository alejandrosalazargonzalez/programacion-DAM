package es.ies.puerto.dies.doce;

public class Ejercicio12 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        float numero1 = 3;
        float numero2 = 2;
        System.out.println("suma " + calculadora.sumar(numero1, numero2));
        System.out.println("resta " + calculadora.restar(numero1, numero2));
        System.out.println("multiplicacion " + calculadora.multiplicar(numero1, numero2));
        System.out.println("divicion " + calculadora.dividir(numero1, numero2));
    }
}
