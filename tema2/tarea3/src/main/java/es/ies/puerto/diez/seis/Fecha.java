package es.ies.puerto.diez.seis;
import java.util.Objects;

/**
 * Crea una clase Fecha con atributos dia, mes y anio.
 *  Implementa métodos para validar si la fecha es
 *  correcta y para comparar dos fechas con equals().
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /**
     *  Constructor vacio
     */
    public Fecha() {
    }

    /**
     * Constructor completo
     * @param dia
     * @param mes
     * @param anio
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        setMes(mes);
        this.anio = anio;
    }

    //Getters y setters
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        if( mes <= 12)
        {
            this.mes = mes;
        }
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fecha)) {
            return false;
        }
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && anio == fecha.anio;
    }

    /**
     * Metodo que muestra la información de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " dia='" + getDia() + "'" +
            ", mes='" + getMes() + "'" +
            ", anio='" + getAnio() + "'" +
            "}";
    }

}
