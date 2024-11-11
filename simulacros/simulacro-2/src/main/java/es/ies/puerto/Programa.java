package es.ies.puerto;
import java.util.Objects;
import java.util.Scanner;

/**
 * Usando la clase Persona creada anteriormente, implementa un programa que
 *  permita al usuario gestionar una lista de 5 personas como máximo, con las
 *  siguientes opciones.
 *
 *  Crear: Permite al usuario añadir una nueva persona a la lista.
 *  
 *  Leer: Muestra la lista completa de personas almacenadas.
 *  
 *  Actualizar: Permite al usuario modificar los datos de una persona en la
 *  lista.
 * 
 *  Eliminar: Permite al usuario eliminar una persona de la lista.
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Programa {
    private Persona[] personas;
    private int numeroPersonas;
    Scanner scanner = new Scanner(System.in);
    /**
     * Constructor vacio
     */
    public Programa() {
    }

    /**
     * Constructor personalizado
     * @param numeroPersonas
     */
    public Programa(int numeroPersonas){
        if(numeroPersonas <= 5)
        {
            personas = new Persona[numeroPersonas];
            this.numeroPersonas = 0;
        }else
        {
            numeroPersonasError();
        }
    }

    //Getters y Setters
    public Persona[] getPersonas() {
        return this.personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public int getNumeroPersonas() {
        return this.numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    /**
     * Metodo que añade una persona a la lista
     * @param persona
     */
    public void crear(Persona persona)
    {
        listaError();
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null)
            {
                personas[i] = persona;
                numeroPersonas++;
                break;
            }
        }
    }

    /**
     * Metodo que busca y elimina a una persona en concreto
     * @param persona
     */
    public void eliminar(Persona persona)
    {
        listaError();
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equals(persona)) {
                personas[i] = null;
                numeroPersonas--;
            }
        }
    }

    /**
     * Metodo que cambia la información de una persona
     * @param persona
     */
    public void actualizar(Persona persona)
    {
        int i = 0;
        while (!(personas[i].equals(persona)))
        {
            i++;
        }
        int seleccion;
        seleccion = scanner.nextInt();
        scanner.nextLine();

        switch (seleccion) {
            case 1:
                String nombre = scanner.nextLine();
                actualizarNombre(personas[i], nombre);
                break;
            case 2:
                int edad = scanner.nextInt();
                actualizarEdad(personas[i], edad);
                break;
            case 3:
                String dni = scanner.nextLine();
                actualizarDni(personas[i], dni);
                break;
            default:
                break;
        }
    }
    
    /**
     * Cambia el nombre de la persona
     * @param persona
     * @param nombre
     */
    public void actualizarNombre(Persona persona, String nombre)
    {
        persona.setNombre(nombre);
    }

    /**
     * Cambia la edad de la persona
     * @param persona
     * @param edad
     */
    public void actualizarEdad(Persona persona, int edad)
    {
        persona.setEdad(edad);
    }

    /**
     * Cambia el dni de la persona
     * @param persona
     * @param dni
     */
    public void actualizarDni(Persona persona, String dni)
    {
        persona.setDni(dni);
    }

    /**
     * Mensaje de error
     */
    public void numeroPersonasError()
    {
        System.out.println("La lista tiene un tamaño máximo de 5");
    }

    /**
     * Informa al usuario del estado de la lista
     */
    public boolean listaError()
    {
        if (numeroPersonas >= personas.length)
        {
            return false;
        }
        if (numeroPersonas <= 0)
        {
            return false; 
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Programa)) {
            return false;
        }
        Programa programa = (Programa) o;
        return Objects.equals(personas, programa.personas) && numeroPersonas == programa.numeroPersonas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personas, numeroPersonas);
    }

    @Override
    public String toString() {
        String mensaje = "personas ";
        for (Persona persona : personas) {
            if (persona != null) {
                mensaje += persona;
            }
        }
        return mensaje;
    }

}
