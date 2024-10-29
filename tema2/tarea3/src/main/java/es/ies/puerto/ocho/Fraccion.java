package es.ies.puerto.ocho;

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
}
