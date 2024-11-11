package com.cardino.template.controller;

import com.cardino.template.entity.Car;
import com.cardino.template.infrastructure.CarService;
import com.cardino.template.model.dto.CarDto;
import com.cardino.template.model.dto.request.CarRequest;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    final CarService carService;
    final ModelMapper modelMapper;


    public CarController(CarService carService, ModelMapper modelMapper) {
        this.carService = carService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/cars")
    public ResponseEntity<CarDto> createNewCar (@RequestBody CarRequest carRequest){
        Car newCar = carService.createCar(modelMapper.map(carRequest, Car.class));
        return ResponseEntity.ok(modelMapper.map(newCar, CarDto.class));

    }
}
