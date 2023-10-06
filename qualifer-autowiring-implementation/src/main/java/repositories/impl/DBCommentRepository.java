package repositories.impl;

import model.Comment;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;
@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: "+comment.getText());
    }
}
