package es.ies.puerto;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    /**
     * Constructor vacio
     */
    public Coche() {
    }

    /**
     * Constructor de la marca del coche
     * @param marca del coche
     */
    public Coche(String marca)
    {
        this.marca = marca;
    }

    /**
     * Constructor de la marca y el modelo del coche
     * @param marca del coche
     * @param modelo del coche
     */
    public Coche(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Constructor del coche con la marca, el modelo y el anio
     * @param marca del coche
     * @param modelo del coche
     * @param anio del coche
     */
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

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
    /**
     * Ejercicio 4
     */
    public void setAnio(int anio) {
        if (anio < 1886) {
            anio = 1886;
        }
        this.anio = anio;
    }

    /**
     * Metodo que devuelve el valor de la marca, el modelo y el año del coche
     */
    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", anio='" + getAnio() + "'" +
            "}";
    }

}
