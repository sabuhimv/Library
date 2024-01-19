package Entities;

import java.util.ArrayList;

public class Library {

    public String name;
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        for (Book existingBook : books) {
            if (existingBook.name.equalsIgnoreCase(book.name) && existingBook.author.equalsIgnoreCase(book.author)) {
                existingBook.increaseCount(book.count);
                return;
            }
        }

        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.fullInfo());
        }
    }

//    public void removeBookByNameAndAuthor(String name, String author){
//        Book book = new Book();
//        if(book.getName().equals(name) && book.getAuthor().equals(author)){
//            books.remove(book);
//        }
//    }
    public void removeBookByName(String name) {
        for (Book book : books) {
            books.remove(book);
            return;
        }
    }


    public Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByName(String name) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByNameAndAuthor(String name, String author) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(name) && book.author.equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

//    public ArrayList<Book> findBookByNameAndAuthor(String name, String author) {
//        ArrayList<Book> result = new ArrayList<>();
//
//        for (Book book : books) {
//            if (book.name.equalsIgnoreCase(name) && book.author.equalsIgnoreCase(author)) {
//                result.add(book);
//            } else {
//                System.out.println("Enter the name of the book and author correctly.");
//            }
//        }
//
//        return result;
//    }
}
