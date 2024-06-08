package com.systemforcars.springcars.service.impl;

import com.systemforcars.springcars.model.Car;
import com.systemforcars.springcars.repository.CarRepository;
import com.systemforcars.springcars.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository repository;

    @Override
    public List<Car> findAllCars() {
        return repository.findAll();
    }

    @Override
    public Car saveCar(Car car) {
        return repository.save(car);
    }

    @Override
    public Car findByModel(String model) {
        return repository.findCarByModel(model);
    }

    @Override
    public Car updateCar(Car car) {
        return repository.save(car);
    }

    @Override
    public void deleteCar(String vin) {
        repository.deleteByVin(vin);
    }
}
