package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.impl.EmailCommentNotificationProxy;
import repositories.impl.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        /*
        // Create the instance for the dependencies
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        // Creates the instance of the service and providing dependencies
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        // Create an instance of Comment to send as parameter to the publishing comment use case
        var comment = new Comment();
        comment.setAuthor("Laurentiu Spilca");
        comment.setText("Demo comment");

        // Call the publishing comment use case
        commentService.publishComment(comment);
         */
        var context =  new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Laurentiu Spilca");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
