package EnumComposicao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import EnumComposicao.Entities.Comment;
import EnumComposicao.Entities.Post;

public class Ex2 {
    public static void main(String[] args) {

        Post post = new Post(LocalDateTime.parse("2018-06-21T13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

        post.addComment(new Comment("Have a nice trip"));
        post.addComment(new Comment("Wow that's awesome"));

        Post post2 = new Post(LocalDateTime.parse("2018-07-28T23:14:19"), "Good night guys", "See you tomorrow", 5);

        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println(post);
        System.out.println();
        System.out.println(post2);
    }
}
