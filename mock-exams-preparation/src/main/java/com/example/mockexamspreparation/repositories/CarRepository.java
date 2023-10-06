package com.example.mockexamspreparation.repositories;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepository {
    public List<String> getCarNames() {
        List<String> cars = Arrays.asList("Volkswagen","Renault", "Dacia", "BMW", "Audi");
        return cars;
    }
}
