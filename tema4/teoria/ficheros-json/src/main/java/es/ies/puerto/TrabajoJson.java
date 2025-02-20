package es.ies.puerto;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TrabajoJson {
    static ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) {
        //escribir JSON
    }

    public static boolean escribirJson(){
        Car miCoche = new Car();
        miCoche.setColor("gris");
        miCoche.setTipo("automovil");
        Set<Car> coches = new HashSet();
        coches.add(miCoche);
        coches.add(miCoche);
        coches.add(miCoche);

        try {
            Car car = objectMapper.readValue(new File("src/main/resources/car.json"), Car.class);
            objectMapper.writeValue(new File("src/main/resources/car.json"), coches);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean leerJson(){
        Car miCoche = new Car();
        miCoche.setColor("gris");
        miCoche.setTipo("automovil");
        Set<Car> coches = new HashSet();
        coches.add(miCoche);
        coches.add(miCoche);
        coches.add(miCoche);

        try {
            Car car = objectMapper.readValue(new File("src/main/resources/car.json"), Car.class);
            System.out.println(car);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}