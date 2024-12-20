package es.ies.puerto;

/**
 * Clase Rectangulo
 * 
 * @author alejandrosalazargonzalez
 * @version 1.2.0
 */
public class Rectangulo {
    
    private float base;
    private float altura;

    /**
     * Constructor vacio
     */
    public Rectangulo()
    {

    }

    /**
     * Constructor de la base del rectangulo
     * @param base del rectangulo
     */
    public Rectangulo( float base)
    {
        this.base = base;
    }

    /**
     * Constructir del rectangulo con base y altura
     * @param base del rectangulo
     * @param altura del rectangulo
     */
    public Rectangulo(float base, float altura)
    {
        this.base = base;
        this.altura = altura;
    }

    //Getters y Setters
    public float getBase()
    {
        return this.base;
    }

    public void setBase(float base)
    {
        this.base = base;
    }

    public float getAltura()
    {
        return this.altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }
    

    /**
     * Imprime los valores de base y altura
     */
    @Override
    public String toString()
    {
        return "{" +
            " base='" + getBase() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }

    /**
     * Ejercicio5
     * Metodo que calcula el area del rectangulo
     * @return area del rectangulo 
    */
    public float area()
    {
        return base * altura;
    }

    /**
     * Ejercicio6
     * Metodo que retorna el perimetro del rectangulo
     * @return perimetro del rectangulo
     */
    public float perimetro()
    {
        return 2 * ( getBase() + getAltura() );
    }
}
