package com.cardino.template.infrastructure.impl;

import com.cardino.template.entity.Car;
import com.cardino.template.infrastructure.CarRepository;
import com.cardino.template.infrastructure.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getById(Long id) {
        return null;
    }
}
