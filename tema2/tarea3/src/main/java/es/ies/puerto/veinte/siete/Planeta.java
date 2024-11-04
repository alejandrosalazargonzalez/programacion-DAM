package es.ies.puerto.veinte.siete;

/**
 * Define una clase Planeta con atributos nombre,
 *  masa, y radio. Implementa métodos para calcular
 *  la gravedad en la superficie del planeta. Usa
 *  toString() para describir el planeta.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Planeta {
    
    private String nombre;
    private double masa;
    private double radio;
    private static double constanteGravitacional;

    /**
     * Constructor vacio
     */
    public Planeta() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param masa
     * @param radio
     */
    public Planeta(String nombre, double masa, double radio) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return this.masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", masa='" + getMasa() + "'" +
            ", radio='" + getRadio() + "'" +
            "}";
    }

}
