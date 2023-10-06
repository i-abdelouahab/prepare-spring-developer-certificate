package com.example.mockexamspreparation.pojos;

import jakarta.annotation.PreDestroy;

public class Driver {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[ "+this.name+" has "+this.age+" ]";
    }
    @PreDestroy
    public void destroy() {
        System.out.println("We will remove the class Driver bean");
    }
}
