//package LibraryApp;
//
//import java.util.*;
//
//public class Library {
//        private ArrayList<Book> books;
//        private Set<Book> rentedbooks;
//        private Map<String, Set<Book>> booksByGenre;
//
//        public Library() {
//                rentedbooks = new HashSet<>();
//                booksByGenre = new HashMap<>();
//        }
//
//        public void addBook(Book book) {
//                booksByGenre.putIfAbsent(book.getGenre(), new HashSet<>());
//
//                System.out.println("'" + book.getName() + "' kitabxanaya elave edildi.");
//        }
//}
//        public void rentBook(String name) throws BookIsAlreadyRented{
//                for (Book book : books) {
//                        if (book.getName().equalsIgnoreCase(name)) {
//                                book.rent();
//                                return;
//                        }
//                }
//                throw new BookIsAlreadyRented("Kitab icarededir!");
//        }
//
//
//        public void returnBook(String name) throws BookIsNotFound{
//                for (Book book : books) {
//                        if (book.getName().equalsIgnoreCase(name)) {
//                                book.returnBook();
//                                return;
//                        }
//                } throw new BookIsNotFound("Kitab tapilmadi!");
////        }
//
//                public void showAvailableBooks () {
//                        System.out.println("\nMovcud kiablar");
//                        for (Book book : books) {
//                                if (book.isAviable()) {
//                                        System.out.println(book);
//                                }
//                        }
//                }
//}
//
//
//
