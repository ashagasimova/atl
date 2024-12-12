//package News;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class News <T> {
//    private String newsName;
//    private T author;
//    private LocalDate newsTime;
//    private T category;
//
//    public News(String newsName, T author, LocalDate newsTime, T category) {
//        this.newsName = newsName;
//        this.author = author;
//        this.newsTime = newsTime;
//        this.category = category;
//    }
//
//    public String getNewsName() {
//        return newsName;
//    }
//
//    public void setNewsName(String newsName) {
//        this.newsName = newsName;
//    }
//
//    public T getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(T author) {
//        this.author = author;
//    }
//
//    public LocalDateTime getNewsTime() {
//        return newsTime;
//    }
//
//    public void setNewsTime(LocalDateTime newsTime) {
//        this.newsTime = newsTime;
//    }
//
//    public T getCategory() {
//        return category;
//    }
//
//    public void setCategory(T category) {
//        this.category = category;
//    }
//
//    @Override
//    public String toString() {
//        return "News{" +
//                "newsName='" + newsName + '\'' +
//                ", author=" + author +
//                ", newsTime=" + newsTime +
//                ", category=" + category +
//                '}';
//    }
//}
