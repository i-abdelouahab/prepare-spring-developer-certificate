package app;

import beans.CommentService;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Before retrieving the CommentService : ");
        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);


        System.out.println("\n\n After retrieving the CommentService : ");
        var service = context.getBean(CommentService.class);
    }
}
