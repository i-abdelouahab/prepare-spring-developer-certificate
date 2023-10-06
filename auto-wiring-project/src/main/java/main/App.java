package main;

import beans.Person;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person's name: "+person.getName());
        System.out.println("Parrot's name: "+person.getParrot());
    }
}
