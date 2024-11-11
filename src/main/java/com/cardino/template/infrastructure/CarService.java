package com.cardino.template.infrastructure;

import com.cardino.template.entity.Car;
import org.springframework.stereotype.Service;

@Service
public interface CarService {

    Car createCar(Car car);

    Car getById(Long id);

}
