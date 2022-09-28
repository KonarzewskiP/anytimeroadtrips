package com.anytimeroadtrips.service;

import com.anytimeroadtrips.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    public final CarRepository carRepository;



}
