package News;

public class Author {
    private String authorName;
    private String authorSname;

    public Author(String authorName, String authorSname) {
        this.authorName = authorName;
        this.authorSname = authorSname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSname() {
        return authorSname;
    }

    public void setAuthorSname(String authorSname) {
        this.authorSname = authorSname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSname='" + authorSname + '\'' +
                '}';
    }
}
