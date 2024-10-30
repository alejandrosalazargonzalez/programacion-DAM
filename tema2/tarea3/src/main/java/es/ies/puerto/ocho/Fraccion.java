package es.ies.puerto.ocho;

/**
 * Crea una clase Fraccion con atributos numerador y denominador.
 *  Implementa métodos para sumar, restar, multiplicar y dividir
 *  fracciones. Sobrescribe toString() para mostrar la fracción 
 *  en formato numerador/denominador.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Fraccion {
    private float numerador;
    private float denominador;

    /**
     * Constructor vacio
     */
    public Fraccion(){
    }

    /**
     * Constructor con todos los atributos
     * @param numerador de la fraccio
     * @param denominador de la fraccio
     */
    public Fraccion(float numerador, float denominador) {
        this.numerador = numerador;
        validarDenominador(denominador);
    }
    
    // Getters y Setters
    public float getNumerador() {
        return this.numerador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public float getDenominador() {
        return this.denominador;
    }

    public void setDenominador(float denominador) {
        validarDenominador(denominador);
    }

    /**
     * metodo que valida si el denominador introducido es valido
     * @param denominador de la fraccion
     */
    public void validarDenominador( float denominador)
    {
        if( denominador == 0f){
            System.out.println("El numero debe ser distinto de 0. Se iguala a 1");
            this.denominador = 1f;
        } else
        {
            this.denominador = denominador;
        }
    }

    /** 
     * Metodo que resta dos fracciones y devuelve el resultado
     * @return nuevaFraccion 
     */ 
    public Fraccion restar(Fraccion otraFraccion)
    {
        float nuevoNumerador = this.numerador * otraFraccion.getDenominador() - this.denominador * otraFraccion.getNumerador();
        float nuevoDenominador = this.denominador * otraFraccion.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Funccion que calcula la suma de dos fracciones
     * @param otraFraccion
     * @return Nueva fraccion con el resultado
     */
    public Fraccion sumar(Fraccion otraFraccion) {
        float nuevoNumerador = this.numerador * otraFraccion.getDenominador() + this.denominador * otraFraccion.getNumerador();
        float nuevoDenominador = this.denominador * otraFraccion.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Metodo que multiplica dos fracciones y retorna el resultado
     * @param otraFraccion
     * @return Otra fraccion como resultado de la multiplicación
     */
    public Fraccion multiplicar(Fraccion otraFraccion)
    {
        float nuevoNumerador = this.numerador * otraFraccion.numerador;
        float nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Metodo que divide dos fracciones
     * @param otraFraccion
     * @return fracción resultante de la division
     */
    public Fraccion dividir(Fraccion otraFraccion)
    {
        float nuevoNumerador = this.numerador * otraFraccion.denominador;
        float nuevoDenominador =this.denominador * otraFraccion.numerador;
        return new Fraccion(nuevoNumerador,nuevoDenominador);
    }


    @Override
    public String toString() {
        return getNumerador() + "/" + getDenominador();
    }

}
