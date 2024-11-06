package es.ies.puerto.cincuenta;

import es.ies.puerto.treinta.dos.Paciente;

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
public class Ejercicio50 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(3, 2);

        hospital.agregarMedico(new Medico("Doctor Nuñez", "Pediatria"));
        hospital.agregarMedico(new Medico("Doctora Martinez", "Cardiologia"));
        hospital.agregarPacientes(new Paciente("Benito", "12345678b", "arritmia"));
        hospital.agregarPacientes(new Paciente("Dana", "987765432v", "brazo roto"));
        hospital.agregarPacientes(new Paciente("Sandra", "23456789z", "algo en el corazón"));

        System.out.println(hospital);

        hospital.eliminarMedico(new Medico("Doctor Nuñez", "Pediatria"));
        hospital.eliminarPaciente(new Paciente("Dana", "987765432v", "brazo roto"));

        System.out.println(hospital);

    }
}
