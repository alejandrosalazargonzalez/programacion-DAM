package es.ies.puerto;
/**
 * Un grupo de guerreros ha sido evaluado por su nivel de poder de ataque.
 *  Escribe un programa que determine quién es el héroe más fuerte y el más débil.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */

 public class Ejercicio3 {
    public static void main(String[] args) {
        
        int[] nivelesDeAtaque = {300, 150, 500, 200, 250};
        int minimo = nivelesDeAtaque[0];
        int maximo = nivelesDeAtaque[0];
        int i = 1;
        do {
            if ( minimo > nivelesDeAtaque[i] )
            {
                minimo = nivelesDeAtaque[i];
            }
            if ( maximo < nivelesDeAtaque[i] ) 
            {
                maximo = nivelesDeAtaque[i];
            }
            i++;
        } while (i < nivelesDeAtaque.length);
    
            System.out.println("Máximo = " + maximo + " Minimo = " + minimo);
    }
}