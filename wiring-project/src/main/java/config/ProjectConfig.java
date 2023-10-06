package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot parrot =  new Parrot();
        parrot.setName("Koko");
        return parrot;
    }
    @Bean
    public Person person(Parrot parrot) {
        Person person = new Person();
        person.setName("Ismail");
        person.setParrot(parrot);
        return person;
    }
    // Wiring with Dependency Injection
}
