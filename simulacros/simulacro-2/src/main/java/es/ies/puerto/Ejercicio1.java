package es.ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa en Java implemente una función que recibe tres enteros (dia,mes,anio) y verifique:
 *  La función devuelve true si la fecha es correcta, y false en cualquier otro caso.
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int dia;
        dia = scanner.nextInt();

        int mes;
        mes = scanner.nextInt();

        int anio;
        anio = scanner.nextInt();

        if (fechaValida(dia, mes, anio)) 
        {
            System.out.println("Fecha válida, ");
            if (isBisiesto(anio))
            {
                System.out.println("año bisiesto.");
            } else
            {
                System.out.println("año no bisiesto.");
            }
        }else
        {
            System.out.println("Fecha no válida.");
        }
        scanner.close();
    }

    /**
     * Metodo que comprueba si el año es bisiesto
     * @param anio
     * @return true/false
     */
    public static boolean isBisiesto(int anio)
    {
        return (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);
    }

    /**
     * Metodo que valida si la fecha es valida
     * @param dia
     * @param mes
     * @param anio
     * @return true/false
     */
    public static boolean fechaValida (int dia, int mes, int anio)
    {
        switch (mes) {
            case 1:case 3:case 5:case 7:case 8: case 10:case 12:
                if (dia <= 31 || dia > 0)
                {
                    return true;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (dia <= 30 && dia > 0)
                {
                    return true;
                }
                break;
            case 2:
                if (isBisiesto(anio) && (dia > 29 || dia < 0))
                {
                    return false;
                }
                
                if (dia > 28 || dia < 0) {
                    return false;
                }
                return true;
            default:
                return false;
            }
            return false;
    }

}
