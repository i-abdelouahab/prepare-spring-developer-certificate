package com.example.mockexamspreparation;

import com.example.mockexamspreparation.config.AppConfiguration;
import com.example.mockexamspreparation.pojos.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.removeBeanDefinition("driver");
    }
}
