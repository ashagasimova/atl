package LibraryApp;

public class Book {
    private String name;
    private String author;
    public String genre;
    private boolean aviable;

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAviable() {
        return aviable;
    }

    public void isAviable(boolean aviable) {
        this.aviable = aviable;
    }

    public Book(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre=genre;
        this.aviable = true;
    }

    public void rent() throws BookIsAlreadyRented {
        if (aviable) {
            aviable = false;
            System.out.println("'" + name + "' icareye goturuldu");
        } else {

            throw new BookIsAlreadyRented("Kitabxanada tapilmadi");

        }

    }

    public void returnBook() {
        if (aviable) {
            aviable = true;
            System.out.println("'" + name + "' kitab qaytarildi.");
        } else {

        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", aviable=" + aviable +
                '}';
    }
}
