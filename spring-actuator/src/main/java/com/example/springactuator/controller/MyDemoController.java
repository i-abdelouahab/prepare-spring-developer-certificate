package com.example.springactuator.controller;

import com.example.springactuator.actuators.health.MyCustomHealthIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemoController {
    @Autowired
    private MyCustomHealthIndicator myCustomHealth;
    @GetMapping("/demo")
    private Health demo(){
        return myCustomHealth.health();
    }
}
