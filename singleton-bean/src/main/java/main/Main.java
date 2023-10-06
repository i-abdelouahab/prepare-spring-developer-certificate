package main;

import beans.CommentService;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var commentService1 = context.getBean(CommentService.class);
        var commentService2 = context.getBean(CommentService.class);

        boolean b1 = commentService1 == commentService2;
        /*
        * Because the two variables hold
        * the same reference, the result
        * of this operation is true
         */
        System.out.println(b1);
    }
}
