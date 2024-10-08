package es.ies.puerto;

import java.util.Scanner;


/**
 * Crea un programa que pida al usuario las horas trabajadas
 *  y el salario por hora, y luego calcule su salario semanal.
 * 
 * @author alejandrosalazargonzalez
 */
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el número de hora trabajadas y su salario por hora, en ese orden");

        int horas = scanner.nextInt();
        float salarioHora = scanner.nextFloat();

        float salarioDia = horas * salarioHora;
        float salarioSemana = salarioDia * 7f;

        System.out.println("Tienes un salario semanal de: " + salarioSemana);

        scanner.close();
    }
}