package es.ies.puerto.dies.ocho;
import java.util.Objects;

/**
 * Define una clase Circulo con el atributo radio.
 *  Implementa los métodos area() y perimetro().
 *  Usa equals() para comparar círculos por su radio.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Circulo {
    private double radio;

    /**
     * Constructor vacio
     */
    public Circulo() {
    }
    
    /**
     * Contructor completo
     * @param radio del circulo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters and Setters 
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo que calcula el area del circulo
     * @return double
     */
    public double area()
    {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Metodo que calcula el perimetro del circulo
     * @return double
     */
    public double perimetro()
    {
        return 2 * Math.PI * radio;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circulo)) {
            return false;
        }
        Circulo circulo = (Circulo) o;
        return radio == circulo.radio;
    }
}
