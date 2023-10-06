package beans;

import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    public CommentRepository() {
        System.out.println("CommentRepository instance created !");
    }
}
