package es.ies.puerto.herencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    static Persona persona;
    static Crud repositorio; 

    public static void main(String[] args) {
        repositorio = new FileCrud();
        persona = new Administrador("Pepe", "00000000H", "aa@ee.com","ss", Arrays.asList("eliminar", "crear"));
        System.out.println(persona);
        repositorio.add(persona);
    }
    
}
