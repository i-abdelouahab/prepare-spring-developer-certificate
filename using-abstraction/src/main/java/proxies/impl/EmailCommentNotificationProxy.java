package proxies.impl;

import model.Comment;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
@Component
public class EmailCommentNotificationProxy
        implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
