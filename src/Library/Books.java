package Library;

import java.util.ArrayList;
import java.util.List;

public class Books {

    List<String> bookList;

    public Books() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String name){
        bookList.add(name);
        System.out.println("'" + name + "' kitab elave olundu.");
    }

    public void movcudKitablar(){
        for (String kitabler: bookList){
            System.out.println("Movcud kitablar: " + bookList);
        }
    }

    public void removeBook(String name){
        bookList.remove(name);
        System.out.println("'" + name + "' adli kitab silindi");
    }
}
