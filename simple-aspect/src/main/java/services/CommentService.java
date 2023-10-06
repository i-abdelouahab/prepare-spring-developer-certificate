package services;

import annotations.ToLog;
import model.Comment;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment:" + comment.getText());
    }
    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }
    public void updateComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
