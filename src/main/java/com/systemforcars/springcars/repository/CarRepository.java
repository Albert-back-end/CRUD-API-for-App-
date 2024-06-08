package com.systemforcars.springcars.repository;

import com.systemforcars.springcars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    void deleteByVin(String vin);
    Car findCarByModel(String model);
}
