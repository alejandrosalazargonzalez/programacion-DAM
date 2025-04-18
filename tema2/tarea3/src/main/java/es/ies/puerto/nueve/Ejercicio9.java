package es.ies.puerto.nueve;

/**
 * Define una clase Empleado con atributos nombre,
 *  puesto, y salario. Implementa un método
 *  aumentarSalario(double porcentaje) y equals()
 *  para comparar empleados por nombre y puesto.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio9 {
      public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos Sánchez", "Desarrollador", 50000);
        Empleado empleado2 = new Empleado("Carlos Sánchez", "Desarrollador", 55000);
                empleado1.aumentarSalario(10);
        System.out.println("Empleado 1 después de aumento: " + empleado1);

        // Probar comparación con equals
        System.out.println("¿Son iguales? " + empleado1.equals(empleado2));
    }
}
