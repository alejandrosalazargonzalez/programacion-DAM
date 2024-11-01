package es.ies.puerto.diez.catorce;

/**
 * Define una clase Coordenada con atributos x y y. Implementa métodos para
 *  calcular la distancia a otra coordenada y el desplazamiento a partir de
 *  un ángulo y una distancia. Sobrescribe toString() para mostrar la
 *  coordenada.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Coordenadas sitio1 = new Coordenadas(100,40);
        Coordenadas sitio2 = new Coordenadas(200, 10);

        System.out.println(sitio1.distancia(sitio2));
    }
}
