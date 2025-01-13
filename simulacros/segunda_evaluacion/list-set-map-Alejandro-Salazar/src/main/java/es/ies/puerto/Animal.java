package es.ies.puerto;

public class Animal {
    private String especie;
    private int edad;
    private String identificador; 

    /**
     * Constructor por defecto
     */
    public Animal() {
    }

    /**
     * Constructor con todos los atributos
     * @param especie del animal
     * @param edad del animal 
     * @param identificador del animal
     */
    public Animal(String especie, int edad, String identificador) {
        this.especie = especie;
        this.edad = edad;
        this.identificador = identificador;
    }

    /**
     * Constructor con solo el identificador
     * @param identificador del animal
     */
    public Animal(String identificador) {
        this.identificador = identificador;
    }

    // Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Animal [especie=" + especie + ", edad=" + edad + ", identificador=" + identificador + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return identificador.equals(animal.identificador);
    }

    @Override
    public int hashCode() {
        return identificador.hashCode();
    }  
}
