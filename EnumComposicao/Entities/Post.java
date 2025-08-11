package EnumComposicao.Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private int likes;

    private List<Comment> coments = new ArrayList<>();

    public Post(LocalDateTime moment, String title, String content, int likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return coments;
    }

    public void addComment(Comment comment){
        coments.add(comment);
    }

    public void removeComment(Comment comment){
        coments.add(comment);
    }

    private static DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n" + likes + "Likes - " + moment.format(ft) + "\n" + content +"\nComents:\n");
        for (Comment comment : coments) {
            sb.append(String.format("%s\n", comment));
        }
        return sb.toString(); 
    }
}
