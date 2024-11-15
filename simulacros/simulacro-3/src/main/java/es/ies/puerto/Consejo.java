package es.ies.puerto;
import java.util.Objects;

/**
 * El Consejo de Magos de la Antigua Orden te ha
 *  encomendado una importante misión: desarrollar
 *  un sistema que permita gestionar y analizar la
 *  lista de magos del consejo según sus niveles de
 *  poder mágico y maná. ¡Los magos de mayor energía
 *  serán seleccionados para la misión final de
 *  protección del reino!.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Consejo {
    
    private Mago[] magos;
    private int totalMagos = 0;

    /**
     * Constructor vacio
     */
    public Consejo()
    {
        this.magos = new Mago[10];
    }

    /**
     * Constructor con un tamaño de lista personalizado
     * @param numeroMagos
     */
    public Consejo(int numeroMagos)
    {
        this.magos = new Mago[numeroMagos];
    }


    public Consejo(Mago[] magos, int totalMagos) {
        this.magos = magos;
        this.totalMagos = totalMagos;
    }

    public Mago[] getMagos() {
        return this.magos;
    }

    public void setMagos(Mago[] magos) {
        this.magos = magos;
    }

    public int getTotalMagos() {
        return this.totalMagos;
    }

    public void setTotalMagos(int totalMagos) {
        this.totalMagos = totalMagos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Consejo)) {
            return false;
        }
        Consejo consejo = (Consejo) o;
        return Objects.equals(magos, consejo.magos) && totalMagos == consejo.totalMagos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magos, totalMagos);
    }

    @Override
    public String toString() {
        return "{" +
            " magos='" + getMagos() + "'" +
            ", totalMagos='" + getTotalMagos() + "'" +
            "}";
    }
    

    /**
     * Metodo que agrega un mago en la posiciob que indica totalMagos
     * @param mago
     * @return
     */
    public boolean agregarMago(Mago mago)
    {
        if (mago == null || totalMagos >= magos.length)
        {
            return false;
        }
        magos[totalMagos] = mago;
        totalMagos++;
        return true;
    }

    /**
     * Metodo que elimina al ultimo mago añadido a la lista
     * @param mago
     * @return
     */
    public boolean eliminarMago()
    {
        if (totalMagos <0 )
        {
            return false;
        }
        magos[totalMagos - 1] = null;
        totalMagos--;
        return true;
    }


}
