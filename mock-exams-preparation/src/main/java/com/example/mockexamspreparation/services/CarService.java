package com.example.mockexamspreparation.services;

import com.example.mockexamspreparation.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<String> getCars() {
        return carRepository.getCarNames();
    }
}
