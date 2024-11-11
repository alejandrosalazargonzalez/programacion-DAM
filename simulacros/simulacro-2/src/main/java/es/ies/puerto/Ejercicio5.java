package es.ies.puerto;

import java.util.Scanner;

/**
 * Usando la clase Persona creada anteriormente, implementa un programa que
 *  permita al usuario gestionar una lista de 5 personas como máximo, con las
 *  siguientes opciones.
 *
 *  Crear: Permite al usuario añadir una nueva persona a la lista.
 *  
 *  Leer: Muestra la lista completa de personas almacenadas.
 *  
 *  Actualizar: Permite al usuario modificar los datos de una persona en la
 *  lista.
 * 
 *  Eliminar: Permite al usuario eliminar una persona de la lista.
 * 
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Del 1 al 5 cuantas personas habrá en la lista?");
        int numeroPersonas = scanner.nextInt();
        Programa programa = new Programa(numeroPersonas);
        
        boolean salir = false;
        while (!salir)
        {
            System.out.println("Selecciona una de las siguientes opciones:" +
                "\n1) Crear: añade una persona a la lista \n2) Leer: Muestra la" +
                "lista de personas \n3) Actualizar: cambia los datos de una persona" +
                "\n4) Eliminar: Quita a una persona de la lista \nCualquier otro " +
                "numero: sale del programa ");
            String nombre = "";
            int edad = 0;
            String dni = "";
            int seleccion = scanner.nextInt();
            scanner.nextLine();
            switch (seleccion) {
                case 1:
                    System.out.println("Añade a una persona");
                    System.out.println("Indica su nombre: ");
                    nombre = scanner.nextLine();
                
                    System.out.println("Indica su edad: ");
                    edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce su dni: ");
                    dni = scanner.nextLine();

                    programa.crear(new Persona(nombre, edad, dni));
                    break;
                case 2:
                    System.out.println(programa);
                    break;
                case 3:
                    System.out.println("¿A quien quieres actualizar? Introduce su DNI");
                    dni = scanner.nextLine();
                    System.out.println("Selecciona:\n1) Actualizar el nombre" +
                        "\n2) Actualizar la edad \n3)Actualizar el dni \nOtro: no hacer nada ");
                    programa.actualizar(new Persona(dni));
                    break;
                case 4:
                    System.out.println("Introduce el dni de quien quieras eliminar");
                    dni = scanner.nextLine();
                    Persona personaObjetivo = new Persona(dni);
                    programa.eliminar(personaObjetivo);
                    break;
                default:
                    salir = true;
                    break;
            }
        }
    }
}