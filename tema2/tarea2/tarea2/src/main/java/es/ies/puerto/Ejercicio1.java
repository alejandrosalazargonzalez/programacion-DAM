package es.ies.puerto;
    
/**
 * Crea una clase llamada Persona con los atributos nombre y edad. Define un constructor que inicialice estos valores.
 * Modifica la clase Persona para que tenga métodos getter y setter para el atributo edad.
 *
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        Persona persona;
        
        persona = new Persona("Maria", 25);
        persona.mostrarInformacion();
        persona.setEdad(26);
        persona.mostrarInformacion();
    }

}