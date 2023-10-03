package com.CarLease.demo.service;

import com.CarLease.demo.model.Car;

import java.util.Optional;

public interface CarService {
    Iterable<Car> findAll();
    Optional<Car> findById(long id);
    Car save(Car car);
    void deleteById( long id);
}
