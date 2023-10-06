package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import processors.CommentProcessor;
@Service
public class CommentService {
    @Autowired
    private ApplicationContext ctx;

    public void sendComment(Comment comment) {

        CommentProcessor cp = ctx.getBean(CommentProcessor.class);

        cp.setComment(comment);
        cp.processComment(comment);
        cp.validateComment(comment);

        cp.getComment();
    }
}
