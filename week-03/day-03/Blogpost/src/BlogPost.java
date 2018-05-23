public class BlogPost {
    public static void main(String[] args) {
        Blogs blogs = new Blogs();
        blogs.authorName = "John Doe";
        blogs.title = "Lorem Ipsum";
        blogs.text = "Lorem ipsum dolor sit amet.";
        blogs.publicationDate = "2000.05.04";

        Blogs blogs2 = new Blogs();
        blogs2.authorName = "Tim Urban";
        blogs2.title = "Wait but why";
        blogs2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blogs2.publicationDate = "2010.10.10";

        Blogs blogs3 = new Blogs();
        blogs3.authorName = "William Turton";
        blogs3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogs3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        blogs3.publicationDate = "2017.03.28";
    }
}
