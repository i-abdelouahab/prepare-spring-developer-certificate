package main;

import beans.Bird;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Bird bird = context.getBean(Bird.class);
        System.out.println(bird.fly());
    }
}
