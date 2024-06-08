package com.systemforcars.springcars.repository;

import com.systemforcars.springcars.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryCarDAO {
    private final List<Car> CARS = new ArrayList<>();

    public List<Car> findAllCars() {
        return CARS;
    }

    public Car saveCar(Car car) {
        CARS.add(car);
        return car;
    }

    public Car findByModel(String model) {
        return CARS.stream()
                .filter(element -> element.getModel().equals(model))
                .findFirst()
                .orElse(null);
    }

    public Car updateCar(Car car) {
        var carIndex = IntStream.range(0, CARS.size())
                .filter(index -> CARS.get(index).getModel().equals(car.getModel()))
                .findFirst()
                .orElse(-1);

        if (carIndex > -1) {
            CARS.set(carIndex, car);
            return car;
        }
        return null;
    }

    public void deleteCar(String vin) {
        var car = findByModel(vin);
        if (car == null) {
            CARS.remove(vin);
        }
    }
}
