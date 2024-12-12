//package LibraryApp;
//
//public class Main {
//    public static void main(String[] args) throws BookIsAlreadyRented {
//        Book book1 = new Book("Alchemist" ,"Paulo Coelho","Dramatic");
//        Book book2 = new Book("The Idiot", "Dostoevsky", "Romantic");
//        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "Finction");
//        Book book4 = new Book("Die Verwandlung", "Franz Kafka", "Comedy");
//
//
//        Library library = new Library();
//
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//        library.addBook(book4);
//        library.showAvailableBooks();
//        library.rentBook("Die Verwandlung");
//        System.out.println();
//
//
//        try {
//            library.rentBook("Alchemi"); // This will work if "Alchemist" is available
//        } catch (BookIsAlreadyRented e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            library.returnBook("Java book"); // Book "Java book" does not exist
//        } catch (BookIsNotFound e) {
//            System.out.println(e.getMessage());
//        }
//
//
//
////        library.returnBook("The Idiot");
//    }
//}
