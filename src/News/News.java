package News;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class News <T, U> {
    private String newsName;
    private T category;
    private U author;
    private LocalDate publishDate;

    public News(String newsName, T category, U author, String
            publishDate) {
        this.newsName = newsName;
        this.category = category;
        this.author = author;
        this.publishDate = LocalDate.parse(publishDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public T getCategory() {
        return category;
    }

    public void setCategory(T category) {
        this.category = category;
    }

    public U getAuthor() {
        return author;
    }

    public void setAuthor(U author) {
        this.author = author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsName='" + newsName + '\'' +
                ", category=" + category +
                ", author=" + author +
                ", publishDate=" + publishDate +
                '}';
    }
}
