package com.systemforcars.springcars.service.impl;

import com.systemforcars.springcars.model.Car;
import com.systemforcars.springcars.repository.InMemoryCarDAO;
import com.systemforcars.springcars.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class InMemoryCarServiceImpl implements CarService {

    private final InMemoryCarDAO repository;

    @Override
    public List<Car> findAllCars() {
        return repository.findAllCars();
    }

    @Override
    public Car saveCar(Car car) {
        return repository.saveCar(car);
    }

    @Override
    public Car findByModel(String model) {
        return repository.findByModel(model);
    }

    @Override
    public Car updateCar(Car car) {
        return repository.updateCar(car);
    }

    @Override
    public void deleteCar(String vin) {
        repository.deleteCar(vin);
    }
}
