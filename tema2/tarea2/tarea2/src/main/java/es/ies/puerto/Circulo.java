package es.ies.puerto;
/**
 * Ejercicio 19
 * Crea una clase Circulo con un atributo radio.
 *  Implementa un método que calcule el área y
 *  el perímetro del círculo. Usa getters y
 *  setters para el radio.
 * 
 * Ejercico20
 * Modifica la clase Circulo para que el setter
 *  de radio solo acepte valores positivos y
 *  mayores a 0.
 * @author alejandrosalazargonzalez
 * @version 1.1.0
 */
public class Circulo {
    
    private double radiod;

    /**
     * Constructor vacio
     */
    public Circulo() {
    }

    /**
     * Constructor con el radio
     * @param radiod del circulo
     */
    public Circulo(double radiod) {
        setRadiod(radiod);
    }

    //Getters y Setters
    public double getRadiod() {
        return this.radiod;
    }
    //Ejercicio 20
    public void setRadiod(double radiod) {
        if (radiod > 0) {
            this.radiod = radiod;
        } else
        {
            mensajeError();
        }
    }

    /**
     * Metodo que calcula el area del circulo
     * @return area
     */
    public double area()
    {
        return Math.PI * getRadiod() * getRadiod();
    }
    
    /**
     * Metodo que calcula el perimetro del circulo
     * @return perimetro
     */
    public double perimetro()
    {
        return 2 * Math.PI * getRadiod();
    }

    public void mensajeError()
    {
        System.out.println("El radio solo puede ser positivo");
    }

    @Override
    public String toString() {
        return "{" +
            " radiod='" + getRadiod() + "'" +
            " area='" + area() + "'" +
            " perimetro='" + perimetro() + "'" +
            "}";
    }


}
