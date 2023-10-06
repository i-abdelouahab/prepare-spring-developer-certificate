package repositories;

import model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    public void saveComment(Comment comment) {
        System.out.println("\""+ comment.getText() + "\" is saved successfully !");
    }
}
