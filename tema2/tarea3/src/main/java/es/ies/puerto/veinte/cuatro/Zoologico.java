package es.ies.puerto.veinte.cuatro;

/**
 *  
 * @author alejandrosalazargonzales
 * @version 1.0.0
 */
public class Zoologico {
    private int numeroAnimales;
    private String nombre;
    private Animal[] animales;

    /**
     * Constuctor por defecto
     */
    public Zoologico() {
        numeroAnimales = 0;
        animales = new Animal[5];
    }

    /**
     * Constructor con el nombre del zoo
     * @param nombre
     */
    public Zoologico(String nombre){
        this.nombre = nombre;
        numeroAnimales = 0;
        animales = new Animal[5];
    }

    /**
     * Metodo que agrega un animal al zoo
     * @param animal
     * @return true/false
     */
    public boolean addAnimal( Animal animal)
    {
        if (animal == null ) {
            return false;
        }
        if (numeroAnimales >= animales.length) {
            return false;
        }

        animales[numeroAnimales] = animal;
        numeroAnimales++;
        return true;
    }

    /**
     * Metodo que elimina un animal
     * @param animalEliminar
     * @return true/false
     */
    public boolean removeAnimal(Animal animalEliminar)
    {
        if (animalEliminar == null) {
            return false;
        }
        if (numeroAnimales == 0){
            return false;
        }
        for (int i = 0; i < animales.length; i++) {
                if (animalEliminar.equals(animales[i])) {
                    animales[i] = null;
                    numeroAnimales--;
                    return true;
                }
        }
        return false;
    }

    @Override
    public String toString(){
        String mensaje = "Nombre: " + nombre;
        mensaje += "\nAnimales: ";
        for (Animal animal : animales) {
            if (animal != null) {
                mensaje += animal;
            }
        }
        return mensaje;
    }

}
