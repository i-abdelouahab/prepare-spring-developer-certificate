package com.example.mockexamspreparation.services;

import com.example.mockexamspreparation.repositories.CarRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
class CarServiceTest {
    @InjectMocks
    CarService carService;
    @Mock
    CarRepository carRepository;
    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void itShouldReturnAnException() {
        //given
        given(carRepository.getCarNames())
                .willReturn(Collections.emptyList());
        //when
        List<String> res = carService.getCars();
        //verify
        assertTrue(res.isEmpty());
    }

}