package News;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class News <T, U> {
    private String newsName;
    private T category;
    private U author;
    private LocalDate publishDate;

    public News(String newsName, T category, U author, LocalDate publishDate) {
        this.newsName = newsName;
        this.category = category;
        this.author = author;
        this.publishDate = publishDate;
    }
    public String getFormatter(){
        return publishDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void getInfo(){
        System.out.println(" News name: " + newsName + " \n Category: " + category +
                "\n Author: " + author + " \n Publish date: " + publishDate );
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
                ", publishDate=" + getFormatter() +
                '}';
    }
}
