package es.ies.puerto;
 
/**
 * Declara tres variables enteras, asigna valores 
 * a cada una y calcula su promedio.
 * @author alejandrosalazargonzalez
 */
 
public class Ejercicio6 {
    public static void main(String[] args) {
    
        float valor1 = 36f;
        float valor2 = 49f;
        float valor3 = 83f;
        
        float suma = valor1 + valor2 + valor3;
        float promedio = suma / 3f;
    
        System.out.println("El primer valor es: " + valor1 + 
                        ", el segundo valor es: " + valor2 + 
                        ", el tercer valor es: " + valor3);
        System.out.println("El promedio de los valores es: " + promedio);
    
    }
}