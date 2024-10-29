package es.ies.puerto.tres;

/**
 * Define la clase Coche con atributos marca, modelo,
 *  año y velocidad. Incluye métodos acelerar() y
 *  frenar(), que modifiquen la velocidad. Usa getters
 *  y setters para controlar el acceso a los atributos.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int anio;
    private float velocidadf;

    /**
     * Constructor vacio
     */
    public Coche() {
    }

    /**
     * Constructor completo de la clase Coche
     * @param marca del coche
     * @param modelo del coche 
     * @param anio del coche
     * @param velocidadf del coche
     */
    public Coche(String marca, String modelo, int anio, float velocidadf) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadf = velocidadf;
    }

    //Getters y setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getVelocidadf() {
        return this.velocidadf;
    }

    public void setVelocidadf(float velocidadf) {
        this.velocidadf = velocidadf;
        if (this.velocidadf <= 0f) {
            this.velocidadf = 0;
        }
    }

    /**
     * Metodo que dada una aceleracion introducida cambia la velocidad del coche.
     * @param aceleracion
     */
    public void acelerar(float aceleracionf)
    {
        setVelocidadf(getVelocidadf() + aceleracionf); 
    }
    
    /**
     * Metodo que resta a la velocidad del coche segun una frenada
     * @param frenadaf
     */
    public void frenar(float frenadaf)
    {
        setVelocidadf(getVelocidadf() - frenadaf);
        parado();
    }

    /**
     * Metodo que devuelve un sout en caso de que la velocidad sea 0 o menos
     */
    public void parado()
    {
        if (this.velocidadf <= 0) {
            System.out.println("El coche se ha parado");
        }
    }

    /**
     * Metodo toString que muestra la información de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", anio='" + getAnio() + "'" +
            ", velocidadf='" + getVelocidadf() + "'" +
            "}";
    }

}