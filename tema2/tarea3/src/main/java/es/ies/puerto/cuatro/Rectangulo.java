package es.ies.puerto.cuatro;
import java.util.Objects;

/**
 * Crea una clase Rectangulo con atributos ancho y alto.
 *  Implementa los métodos carea() y perimetro().
 *  Sobrescribe equals() para comparar rectángulos por
 *  sus dimensiones y toString() para describir el rectángulo.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Rectangulo {
    
    private float anchof;
    private float altof;

    /**
     * Constructor vacio
     */
    public Rectangulo() {
    }

    /**
     * Constructor completo de la clase
     * @param anchof del rectangulo
     * @param altof del rectangulo
     */
    public Rectangulo(float anchof, float altof) {
        this.anchof = anchof;
        this.altof = altof;
    }

    //Getters y setters
    public float getAnchof() {
        return this.anchof;
    }

    public void setAnchof(float anchof) {
        this.anchof = anchof;
    }

    public float getAltof() {
        return this.altof;
    }

    public void setAltof(float altof) {
        this.altof = altof;
    }

    /**
     * Metodo que calcula el area del rectangulo
     * @return floar del area 
     */
    public float area()
    {
        return anchof * altof;
    }

    /**
     * Metodo que retorna el perimetro del rectangulo
     * @return float con valor del perimetro 
     */
    public float perimetro()
    {
        return 2 * anchof + 2 * altof;
    }

    /**
     * Metodo equals que comprueba si los rectangulos son iguales
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rectangulo)) {
            return false;
        }
        Rectangulo rectangulo = (Rectangulo) o;
        return anchof == rectangulo.anchof && altof == rectangulo.altof;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anchof, altof);
    }

    @Override
    public String toString() {
        return "{" +
            " ancho='" + getAnchof() + "'" +
            ", alto='" + getAltof() + "'" +
            ", area=" + area() +
            ", perimetro=" + perimetro() +
            "}";
    }
    
}
