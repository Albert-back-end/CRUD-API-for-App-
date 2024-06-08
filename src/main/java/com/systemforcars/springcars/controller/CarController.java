package com.systemforcars.springcars.controller;

import com.systemforcars.springcars.model.Car;
import com.systemforcars.springcars.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
@AllArgsConstructor
public class CarController{

    private final CarService service;

    @GetMapping()
    public List<Car> findAllCars() {
        //todo
        return service.findAllCars();
    }

    @PostMapping("save_car")
    public String saveCar(@RequestBody Car car) {
        service.saveCar(car);
        return "Автомобиль " + car.getName() + " " + car.getModel() + ", " + car.getYearOfRelease() + " года успешно добавлен!";
    }

    @GetMapping("/{model}")
    public Car findByModel(@PathVariable String model) {
        return service.findByModel(model);
    }

    @PutMapping("update_car")
    public String updateCar(@RequestBody Car car) {
        service.updateCar(car);
        return "Автомобиль " + car.getName() + " " + car.getModel() + ", " + car.getYearOfRelease() + " года успешно обновлен!";
    }

    @DeleteMapping("delete_car/{vin}")
    public String deleteCar(@PathVariable String vin) {
        service.deleteCar(vin);
        return "Автомобиль успешно удален!";
    }
}
