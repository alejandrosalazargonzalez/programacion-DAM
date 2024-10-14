package es.ies.puerto;

public class Coche {
    String marca;
    String modelo;
    int anio;

    public Coche (){
        this.anio = 1886;
    }

    public Coche(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.modelo = modelo;
        setAnio(anio);
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

    public void setAnio(int anio) {
        if (anio <= 1886 )
        {
            anio = 1886;
        } else if (anio >= 2024)
        {
            anio = 2024;
        }
        this.anio = anio;
    }

}
