package processors;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private Comment comment;
    @Autowired
    private CommentRepository commentRepository;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment(Comment comment) {
        System.out.println("Changing the comment attribute for: " + comment.getAuthor());
    }

    public void validateComment(Comment comment) {
        commentRepository.saveComment(comment);
    }
}
