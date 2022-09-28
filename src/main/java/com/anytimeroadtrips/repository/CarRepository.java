package com.anytimeroadtrips.repository;

import com.anytimeroadtrips.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
