package News;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Politics");
        Category category2 = new Category("Sports");
        Category category3 = new Category("Technology");

        Author author1 = new Author("John", "Smith");
        Author author2 = new Author("Jane", "Doe");
        Author author3 = new Author("Emily", "Brown");


        News<Category, Author> news1 = new News<>("Daily News",
                category1, author1, "10-10-2024");
        News<Category, Author> news2 = new News<>("Update News",
                category2, author2, "11-12-2024");
        News<Category, Author> news3 = new News<>("Country News",
                category3, author3, "12-12-2024");

        List<News> newsList = new ArrayList<>();
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);

        System.out.println(newsList);

    }

}
