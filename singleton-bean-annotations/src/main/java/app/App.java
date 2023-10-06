package app;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class App {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        // Gets the references of the two service beans in the Spring context
        var service1 = context.getBean(UserService.class);
        var service2 = context.getBean(CommentService.class);

        // Compares the references for the repository dependency injected by spring
        boolean b = service1.getCommentRepository() == service2.getCommentRepository();

        /*
        Because the dependency (CommentRepository) is singleton,
        both services contain the same reference, so this line always prints “true.”
         */
        System.out.println(b);




    }
}
