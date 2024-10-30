package es.ies.puerto.dies.catorce;

/**
 * Define una clase Coordenada con atributos x y y. Implementa métodos para
 *  calcular la distancia a otra coordenada y el desplazamiento a partir de
 *  un ángulo y una distancia. Sobrescribe toString() para mostrar la
 *  coordenada.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Coordenadas {
    private float x;
    private float y;

    /**
     * Constructor vacio
     */
    public Coordenadas() {
    }

    /**
     * Constructor completo
     * @param x
     * @param y
     */
    public Coordenadas(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters y Setters
    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    /**
     * Metodo que devuelve la distancia entre dos coordenadas
     * @param nuevasCoordenadas
     * @return double de distancia
     */
    public double distancia( Coordenadas nuevasCoordenadas)
    {
        return Math.sqrt((Math.pow(nuevasCoordenadas.x - x,2) - Math.pow(nuevasCoordenadas.y - y, 2)));
    }


    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }

}
