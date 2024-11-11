package es.ies.puerto;
import java.util.Objects;

/**
 * Crea una clase llamada Mago que represente a un personaje
 *  en un juego. El mago tiene un nivel de poder mágico (poderMagico)
 *  y una cantidad de puntos de maná (mana). El mago puede lanzar
 *  hechizos si tiene suficiente maná, y su poder de hechizo dependerá
 *  de su nivel de poder mágico.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Mago {
    private String nombre;
    private int nivel;
    private int mana;

    /**
     * Constructor vacio
     */
    public Mago() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param nivel
     * @param mana
     */
    public Mago(String nombre, int nivel, int mana) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.mana = mana;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public boolean lanzarHechizo(int valor)
    {
        if ((mana - valor) < 0)
        {
            return false;
        }
        mana -= valor;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mago)) {
            return false;
        }
        Mago mago = (Mago) o;
        return Objects.equals(nombre, mago.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, mana);
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", mana='" + getMana() + "'" +
            "}";
    }
    

}
