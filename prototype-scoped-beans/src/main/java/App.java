import configuration.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class App {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment();
        comment.setAuthor("Ismail Abdelouahab");
        comment.setText("This is a new comment about prototype scoped beans");

        var commentService = context.getBean(CommentService.class);
        commentService.sendComment(comment);
    }
}
