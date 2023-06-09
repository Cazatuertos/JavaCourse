package com.example.worshop.demo.service;

import com.example.worshop.demo.entity.Car;
import com.example.worshop.demo.exceptions.CarNotFoundException;
import com.example.worshop.demo.repository.ICarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CarService {
    private final ICarRepository carRepository;

    public Car saveCar(Car car) {
        carRepository.save(car);
        return car;
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (!optionalCar.isPresent()) {
            throw new CarNotFoundException(id);
        }
        return optionalCar.get();
    }
}
