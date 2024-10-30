package es.ies.puerto.dies.doce;

/**
 * Crea una clase Calculadora con métodos
 *  estáticos para sumar, restar, multiplicar
 *  y dividir dos números.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Calculadora {
    
    Calculadora(){}

    public static float sumar( float numero1, float numero2)
    {
        return numero1 + numero2;
    }

    public static float restar( float numero1, float numero2)
    {
        return numero1 - numero2;
    }

    public static float multiplicar( float numero1, float numero2)
    {
        return numero1 * numero2;
    }

    public static float dividir( float numero1, float numero2)
    {
        return numero1 / numero2;
    }
}
