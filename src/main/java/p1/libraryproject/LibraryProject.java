package p1.libraryproject;

import Entities.Book;
import Entities.Library;
import java.util.ArrayList;

public class LibraryProject {

    public static void main(String[] args) {
        Book book1 = new Book("Serq ekspresinde qetl", "Agata Christie", "Aze", 15);

        Book book2 = new Book("Olum mehbusunun son gunu", "Victor Huqo", "Aze", 13);

        Book book3 = new Book("Ugurlu insanin 7 ceheti", "Sabuhi", "Aze", 16);

        Book book4 = new Book("Sefiller", "Victor Huqo", "Aze", 24);

//        book1.fullInfo();
//        book2.fullInfo();
//        book3.fullInfo();
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book1);

        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book2);

        library.addBook(book3);
        library.addBook(book4);

//        library.showBooks();

        System.out.println("Adina gore tap: ");

        ArrayList<Book> booksByName = library.searchBooksByName("Olum mehbusunun son gunu");
        for (Book book : booksByName) {
            System.out.println(book.fullInfo());
        }

        System.out.println("Yaziciya gore tap: ");

        ArrayList<Book> booksByAuthor = library.searchBooksByAuthor("Agata Christie");
        for (Book book : booksByAuthor) {
            System.out.println(book.fullInfo());
        }

    }
}
