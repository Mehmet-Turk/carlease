package com.CarLease.demo.controller;

import com.CarLease.demo.model.Car;
import com.CarLease.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars", produces = "application/json")
    public Iterable<Car> getAllCars() {
        return carService.findAll();
    }

    @GetMapping(value = "/cars/{id}", produces = "application/json")
    public ResponseEntity<Car> getCarById(@PathVariable long id) {
        Optional<Car> car = carService.findById(id);
        return car.isPresent() ? ResponseEntity.ok().body(car.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "/cars", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.ok().body(carService.save(car));

    }

    @DeleteMapping("cars/{id}")
    public ResponseEntity<Void> deleteCarById(@PathVariable long id) {

        carService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
