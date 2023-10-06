package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bird {
    @PostConstruct
    public void init() {
        System.out.println("Hello there !");
    }
    public String fly() {
        return "The bird is flying";
    }
}
