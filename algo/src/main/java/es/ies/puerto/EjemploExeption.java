package es.ies.puerto;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EjemploExeption {
    public static void main(String[] args) {
        int edad = 5;
        if (edad < 18) {
            throw new IllegalArgumentException("Edad no válida, debes ser mayor de edad");
        }
    }
}
