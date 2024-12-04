package es.ies.puerto;
import java.util.Objects;

public class ResultadoExamen {
            
    private String nombre;
    private double nota;

    /**
     * Constructor vacio
     */
    public ResultadoExamen() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param nota
     */
    public ResultadoExamen(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResultadoExamen)) {
            return false;
        }
        ResultadoExamen resultadoExamen = (ResultadoExamen) o;
        return Objects.equals(nombre, resultadoExamen.nombre) && nota == resultadoExamen.nota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nota='" + getNota() + "'" +
            "}";
    }
    
}
