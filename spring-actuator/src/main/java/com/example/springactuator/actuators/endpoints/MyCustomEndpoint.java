package com.example.springactuator.actuators.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "myEndpoint")
public class MyCustomEndpoint {
    @ReadOperation
    public String test(){
        return ":)";
    }
}
