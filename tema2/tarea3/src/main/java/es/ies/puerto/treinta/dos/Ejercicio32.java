package es.ies.puerto.treinta.dos;

/**
 * Crea una clase Hospital que almacene una lista
 * (array) de pacientes (clase Paciente). Implementa
 * métodos para agregar, eliminar y listar pacientes.
 * Usa toString() para describir el hospital.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(3);
        hospital.agregarPaciente(new Paciente("Ruperto", "12345678A", "Pierna rota"));
        hospital.agregarPaciente(new Paciente("Josefina", "12345678f", "Neumonia"));
        hospital.agregarPaciente(new Paciente("Francisco", "87654321y", "gripe"));

        System.out.println(hospital);

        hospital.eliminarpacientes(new Paciente("Ruperto", "12345678A", "en coma"));

        System.out.println(hospital);
    }
}
