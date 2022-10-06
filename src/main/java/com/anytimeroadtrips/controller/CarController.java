package com.anytimeroadtrips.controller;


import com.anytimeroadtrips.controller.request.CarCreateRequest;
import com.anytimeroadtrips.model.Car;
import com.anytimeroadtrips.repository.CarRepository;
import com.anytimeroadtrips.service.CarService;
import com.anytimeroadtrips.utils.UuidGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public void create(@Valid @RequestBody CarCreateRequest request) {
        Car newCar = Car.builder()
                .numberPlate(request.getNumberPlate())
                .uuid(UuidGenerator.next())
                .build();
        carRepository.save(newCar);
    }
}
