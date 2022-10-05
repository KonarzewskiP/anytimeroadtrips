package com.anytimeroadtrips.controller;


import com.anytimeroadtrips.model.Car;
import com.anytimeroadtrips.repository.CarRepository;
import com.anytimeroadtrips.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "cars")
@RequiredArgsConstructor
public class CarController {

    public final CarService carService;
    public final CarRepository carRepository;


    @GetMapping()
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(Car car) {
        carRepository.save(car);
    }
}
