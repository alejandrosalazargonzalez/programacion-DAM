package es.ies.puerto.diez.trece;

public class Ejercicio13 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Joselito", 6, 4, 7);
        System.out.println(alumno);
        System.out.println("¿Este alumno es Joselito?" + alumno.equals(alumno));
    }
}
