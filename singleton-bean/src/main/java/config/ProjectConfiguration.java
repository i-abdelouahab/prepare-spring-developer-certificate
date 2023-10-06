package config;

import beans.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean // Add the CommentService bean to the spring context
    public CommentService commentService() {
        return new CommentService();
    }
}
