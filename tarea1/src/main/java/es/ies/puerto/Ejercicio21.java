package es.ies.puerto;

public class Ejercicio21 {
    public static void main(String[] args) {
        int edad = 18;
        String nombre = "Dios";
        byte numeroAlumnos = 24;

        System.out.println("Mi edad es:" + edad + " y mi nombre es: " + nombre + ", tengo " + numeroAlumnos + " alumnos");

        System.out.printf("Mi edad es:%d" + 
        " y mi nombre es: %s , tengo %d alumnos",edad,nombre,numeroAlumnos);

    }
}