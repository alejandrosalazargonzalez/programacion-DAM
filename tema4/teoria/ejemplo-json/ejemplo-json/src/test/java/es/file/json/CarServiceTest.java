
package es.file.json;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
class CarServiceTest {

    CarService carService;
    Car car;

    @BeforeEach
    void before() {
        carService = new CarService();
        car = new Car(3, "marca", "modelo", 10000);
        carService.addCar(car);
    }

    @AfterEach
    void afterEach() {
        carService.deleteCar(car);
        Assertions.assertEquals(2, carService.getCars().size());
    }

    @Test
    void addCarTest() {
        Assertions.assertEquals(3, carService.getCars().size());
    }

    @Test
    void addCarNuloTest() {
        boolean result = carService.addCar(null);
        Assertions.assertFalse(result);
    }

    @Test
    void addCarExistTest() {
        Car newCar = new Car(1);
        boolean result = carService.addCar(newCar);
        Assertions.assertFalse(result);
    }

    @Test
    void deleteCarNuloTest() {
        boolean result = carService.deleteCar(null);
        Assertions.assertFalse(result);
    }

    @Test
    void searchCarTest(){
        //car.getid();id=3
        Car newCar = carService.search(car.getId());
        Assertions.assertEquals(car, newCar, "el coche no es el esperado");
    }

    @Test
    void searchCarFalseTest(){
        Car newCar = carService.search(10);
        Assertions.assertNull(newCar, "el coche no es el esperado");
    }

    @Test
    void searchCarPriceTest(){
        List<Car> newCar = carService.searchPrice(20000);
        Assertions.assertEquals(2, newCar.size(), "el valor del coche no es el esperado");
    }
}
