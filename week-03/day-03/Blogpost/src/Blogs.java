public class Blogs {
    String authorName;
    String title;
    String text;
    String publicationDate;

public Blogs(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;

    System.out.println("\"" + title + "\"" +
            " titled by " + authorName +
            " posted at " + "\"" + publicationDate + "\"" +
            "\n" + "  " + text + "\n");
    }
}