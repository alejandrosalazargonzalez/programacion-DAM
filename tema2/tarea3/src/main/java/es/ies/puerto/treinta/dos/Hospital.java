package es.ies.puerto.treinta.dos;

/**
 * Crea una clase Hospital que almacene una lista 
 * (array) de pacientes (clase Paciente). Implementa
 *  métodos para agregar, eliminar y listar pacientes.
 *  Usa toString() para describir el hospital.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Hospital {
    private Paciente[] pacientes;
    private int numeroPacientes;

    /**
     * Constructor por defecto
     */
    public Hospital() {}

    /**
     * Constructor completo
     * @param numeroPacientes
     */
    public Hospital(int numeroPacientes) {
        this.numeroPacientes = 0;
        this.pacientes = new Paciente[numeroPacientes];
    }
    
    //Getters y Setters
    public Paciente[] getpacientes() {
        return this.pacientes;
    }

    public void setpacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public int getNumeroPacientes() {
        return this.numeroPacientes;
    }

    public void setNumeroPacientes(int numeroPacientes) {
        this.numeroPacientes = numeroPacientes;
    }

    /**
     * Metodo que agrega un Paciente a la Hospital
     * @param pacienteaciente
     */
    public void agregarPaciente(Paciente paciente)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (pacientes[i] == null )
            {
                pacientes[i] = paciente;
                buscar = false;
            }
            i++;
        }
    }

    /**
     * Metodo que elimina un Paciente de la Hospital
     */
    public void eliminarpacientes(Paciente paciente)
    {
        int i = pacientes.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( pacientes[i].equals(paciente) )
            {
                pacientes[i] = null;
                buscar = false;
            }
            i--;
        }
    }
    
    @Override
    public String toString() {
        String salida = "{ ";
        for (Paciente paciente : pacientes) {
            if ( paciente != null) {
                salida += " " + paciente + ";";
            }
        }
        salida += "}";
        return salida;
    }

}


