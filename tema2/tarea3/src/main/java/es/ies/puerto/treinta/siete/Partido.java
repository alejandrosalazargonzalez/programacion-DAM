package es.ies.puerto.treinta.siete;
import java.util.Objects;


/**
 * Crea una clase Partido con atributos equipoLocal,
 *  equipoVisitante, y resultado. Implementa métodos
 *  para actualizar el resultado y usar toString()
 *  para mostrar los detalles del partido.´
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private boolean resultado;

    /**
     * Constructor vacio
     */
    public Partido() {
    }

    /**
     * Constructor completo
     * @param equipoLocal
     * @param equipoVisitante
     * @param resultado
     */
    public Partido(String equipoLocal, String equipoVisitante, boolean resultado) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultado = resultado;
    }

    //Getters y Setters
    public String getEquipoLocal() {
        return this.equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public boolean getResultado() {
        return this.resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    /**
     * Metodo para actualizar el resultado
     */
    public void actualizarResultado()
    {
        setResultado(!getResultado());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Partido)) {
            return false;
        }
        Partido partido = (Partido) o;
        return Objects.equals(equipoLocal, partido.equipoLocal) && Objects.equals(equipoVisitante, partido.equipoVisitante) && resultado == partido.resultado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipoLocal, equipoVisitante, resultado);
    }

    @Override
    public String toString() {
        String ganador = "Gana: ";
        if (resultado) {
            ganador += equipoLocal;
        } else
        {
            ganador += equipoVisitante;
        }
        return "{" +
            " equipoLocal='" + getEquipoLocal() + "'" +
            ", equipoVisitante='" + getEquipoVisitante() + "'" +
            ", resultado='" + ganador + "'" +
            "}";
    }
    
    
}
