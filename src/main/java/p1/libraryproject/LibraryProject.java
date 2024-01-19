package p1.libraryproject;

import Entities.Book;
import Entities.Library;
import Helpers.Helper;
import java.util.Scanner;

public class LibraryProject {

    public static void main(String[] args) {
//       Book book1 = new Book("Serq ekspresinde qetl", "Agata Christie", "Aze", 15, 5);

//        Book book5 = new Book("Serq ekspresinde qetl", "Agata Christie", "Aze", 15, 35);

//        Book book2 = new Book("Olum mehbusunun son gunu", "Victor Huqo", "Aze", 13, 5);
//
//        Book book3 = new Book("Ugurlu insanin 7 ceheti", "Sabuhi", "Aze", 16, 77);
//
//        Book book4 = new Book("Sefiller", "Victor Huqo", "Aze", 24, 5);

        while (true) {
            System.out.println("Enter name to library: ");
            Scanner scan = new Scanner(System.in);

            while (true) {
                String libName = scan.nextLine();
                if (libName.isEmpty() || libName.isBlank()) {
                    System.out.println("This name is not correct!!!!");
                }
                Library library = new Library();
                library.name = libName;

                System.out.println("Select operation: ");
                System.out.println("1:Add Book");
                System.out.println("2:Update Book");
                System.out.println("3:Delete Book");
                System.out.println("4:Find Book");
                System.out.println("5:Show Books");
                System.out.println("6:Exit");

                String choice = scan.nextLine();
                int input = Helper.tryParseInt(choice);

                if (input == 1) {
                    System.out.println("Book name: ");
                    String name = scan.nextLine();

                    System.out.println("Author name: ");
                    String author = scan.nextLine();

                    System.out.println("Language: ");
                    String language = scan.nextLine();

                    System.out.println("Price: ");
                    int price = scan.nextInt();

                    System.out.println("Count: ");
                    int count = scan.nextInt();

                    Book newBook = new Book(name, author, language, price, count);
                    library.addBook(newBook);

                    System.out.println("Book added");
                } else if (input == 2) {
                    System.out.println("Enter the ID of the book which you will give a new price: ");
                    int bookId = scan.nextInt();

                    System.out.println("Enter new price: ");
                    int newPrice = scan.nextInt();

                    Book bookUpdate = library.findBookById(bookId);

                    bookUpdate.price = newPrice;
                    System.out.println("Price of book updated");

                } else if (input == 3) {
                    System.out.println("Enter the book name to delete");
                    String bookNameToDelete = scan.nextLine();

                    library.removeBookByName(bookNameToDelete);

                } else if (input == 4) {
                    System.out.println("What you want to search by (Name, Author name)");
                    System.out.println("1.With book name");
                    System.out.println("2.With author name");
                    System.out.println("3.With name of book and author");

                    String choiceFind = scan.nextLine();
                    int inputFind = Helper.tryParseInt(choiceFind);

                    switch (inputFind) {
                        case 1:
                            System.out.println("Book name: ");
                            String findBookName = scan.nextLine();
                            Book foundBookByName = library.findBookByName(findBookName);
                            System.out.println(foundBookByName.fullInfo());
                            break;
                        case 2:
                            System.out.println("Author name: ");
                            String findBookAuthor = scan.nextLine();
                            Book foundBookByAuthor = library.findBookByName(findBookAuthor);
                            System.out.println(foundBookByAuthor.fullInfo());
                            break;
                        case 3:
                            System.out.println("Book name and Author name: ");
                            String findBookNameAndAuthor = scan.nextLine();
                            Book foundBookByNameAndAuthor = library.findBookByName(findBookNameAndAuthor);
                            System.out.println(foundBookByNameAndAuthor.fullInfo());
                            break;
                        default:
                            System.out.println("Enter correct number");
                    }

                } else if (input == 5) {
                    System.out.println("All books in library: ");
                    library.showBooks();
                } else if (input == 6) {
                    break;
                }

            }

        }

//        System.out.println("Search book: ");
//        ArrayList<Book> booksByName = library.searchBook("Serq ekspresinde qetl", "Christie");
//        for (Book book : booksByName) {
//            System.out.println(book.fullInfo());
//        }
    }
}
