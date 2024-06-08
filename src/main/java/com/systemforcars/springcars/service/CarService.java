package com.systemforcars.springcars.service;

import com.systemforcars.springcars.model.Car;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CarService {
    List<Car> findAllCars();
    Car saveCar(Car car);
    Car findByModel(String model);
    Car updateCar(Car car);
    void deleteCar(String model);
}
