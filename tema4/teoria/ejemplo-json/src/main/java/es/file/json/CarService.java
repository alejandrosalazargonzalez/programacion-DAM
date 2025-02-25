
package es.file.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class CarService {
    ObjectMapper objectMapper;
    String path = "src/main/resources/cars.json";
    File file;
    List<Car> listCar;

    public CarService() {
        objectMapper = new ObjectMapper();
        file = new File(path);
        loadFile(file);
    }

    /**
     * Lee el archivo json y lo garda en la lista listCar
     * @param file
     */
    private void loadFile(File file) {
        try {
            listCar = objectMapper.readValue(file, new TypeReference<List<Car>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Escribe en el archivo json
     * @param file donde agregar la información
     * @param cars
     */
    public void saveFile(File file, List<Car> cars) {
        try {
            objectMapper.writeValue(file, cars);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * aniade un coche al fichero a un fichero json
     * @param car a aniadir
     * @return true/false
     */
    public boolean addCar(Car car) {
        if (car == null) {
            return false;
        }
        int posicion = listCar.indexOf(car);
        if (posicion >= 0) {
            return false;
        }
        boolean insertar = listCar.add(car);
        if (insertar) {
            saveFile(file, listCar);
        }
        return insertar;
    }

    public List<Car> searchPrice(double precio){
        List<Car> lista = new ArrayList<>();
        for (Car car : listCar) {
            if (car.getPrecio() >= precio) {
                lista.add(car);
            }
        }
        return lista;
    }

    public Car search(int id){
        Car car = new Car(id);
        int posicion = listCar.indexOf(car);
        if(posicion < 0){
            return null;
        }
        return listCar.get(posicion);
    }

    /**
     * Elimina un coche de la lista y del fichero json
     * @param car a eliminar
     * @return true/false
     */
    public boolean deleteCar(Car car) {
        if (car == null) {
            return false;
        }
        boolean borrar = listCar.remove(car);
        if (borrar) {
            saveFile(file, listCar);
        }
        return borrar;
    }

    public List<Car> getCars() {
        return listCar;
    }
}
