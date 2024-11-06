
package es.ies.puerto.cincuenta;

import es.ies.puerto.cuarenta.tres.Pintura;
import es.ies.puerto.treinta.dos.Paciente;
import java.util.Objects;

/**
 * Crea una clase Hospital que tenga listas de
 *  médicos y pacientes. Implementa métodos para
 *  agregar, eliminar y listar médicos y pacientes,
 *  y usa toString() para mostrar los detalles del
 *  hospital.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Hospital {
    private Paciente[] pacientes;
    private Medico[] medicos;
    private int numeroPacientes;
    private int numeroMedicos;

    /**
     * Constructor vacio
     */
    public Hospital() {
    }

    /**
     * Constructor completo
     * @param pacientes
     * @param medicos
     * @param numeroPacientes
     * @param numeroMedicos
     */
    public Hospital(int numeroPacientes, int numeroMedicos) {
        this.pacientes = new Paciente[numeroPacientes];
        this.medicos = new Medico[numeroMedicos];
        this.numeroPacientes = 0;
        this.numeroMedicos = 0;
    }

    //Getters y Setters
    public Paciente[] getPacientes() {
        return this.pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public Medico[] getMedicos() {
        return this.medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public int getNumeroPacientes() {
        return this.numeroPacientes;
    }

    public void setNumeroPacientes(int numeroPacientes) {
        this.numeroPacientes = numeroPacientes;
    }

    public int getNumeroMedicos() {
        return this.numeroMedicos;
    }

    public void setNumeroMedicos(int numeroMedicos) {
        this.numeroMedicos = numeroMedicos;
    }


    /**
     * Metodo que agrega un paciente a la lista
     * @param paciente
     */
    public void agregarPacientes(Paciente paciente)
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
     * Metodo que agrega un medico a la lista
     * @param medico
     */
    public void agregarMedico(Medico medico)
    {
        int i = 0 ;
        boolean buscar = true;
        while (buscar)
        {
            if (medicos[i] == null )
            {
                medicos[i] = medico;
                buscar = false;
            }
            i++;
        }
    }

        /**
     * Metodo que elimina una medico de la lista
     */
    public void eliminarMedico(Medico medico)
    {
        int i = medicos.length - 1;
        boolean buscar = true;
        while (buscar)
        {
            if ( medicos[i].equals(medico) )
            {
                medicos[i] = null;
                buscar = false;
            }
            i--;
        }
    }

    /**
     * Metodo que elimina una paciente de la lista
     */
    public void eliminarPaciente(Paciente paciente)
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
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hospital)) {
            return false;
        }
        Hospital hospital = (Hospital) o;
        return Objects.equals(pacientes, hospital.pacientes) && Objects.equals(medicos, hospital.medicos) && numeroPacientes == hospital.numeroPacientes && numeroMedicos == hospital.numeroMedicos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacientes, medicos, numeroPacientes, numeroMedicos);
    }

    @Override
    public String toString() {
        String mensaje = "pacientes: ";
        for (Paciente paciente : pacientes) {
            if (paciente != null) {
                mensaje += paciente;
            }
        }

        mensaje += "\n medicos: ";

        for (Medico medico : medicos) {
            if (medico != null) {
                mensaje += medico;
            }
        }
        return mensaje;
    }
    
    
}
