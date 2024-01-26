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
            if (existingBook.name.equalsIgnoreCase(book.name) && existingBook.author.equalsIgnoreCase(book.author) && existingBook.language.equalsIgnoreCase(book.language)) {
                existingBook.increaseCount(book.count);
                return;
            }
        }

        books.add(book);
    }

    public void reduceBook(Book book, int reducedCount) {
        for (Book existingBook : books) {
            if (existingBook.name.equalsIgnoreCase(book.name) && existingBook.author.equalsIgnoreCase(book.author) && existingBook.language.equalsIgnoreCase(book.language)) {
                existingBook.reduceCount(reducedCount);
                return;
            }
        }
    }

    public void removeBookByNameAndAuthor(String name, String author) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(name) && book.author.equalsIgnoreCase(author)) {
                books.remove(book);
                return;
            }
        }
    }

    public void showBooks() {
        for (Book book : books) {
            book.fullInfo();
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
}
