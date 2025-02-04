package es.ies.puerto.segunda_explicacion;

import es.ies.puerto.segunda_explicacion.model.FileOperaciones;

public class Programa {
    public static void main(String[] args) {
        Operaciones operaciones;
        operaciones = new FileOperaciones();
        System.out.println(operaciones.search("1"));
    }
}
