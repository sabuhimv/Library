package p1.libraryproject;

import Entities.Book;
import Entities.Library;
import Helpers.Helper;
import java.util.Scanner;

public class LibraryProject {

    public static void main(String[] args) {
        boolean continueRunning = true;

        while (continueRunning) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name to library: ");

            String libName = scan.nextLine();
            if (libName.isEmpty() || libName.isBlank() || libName.length() < 3) {
                System.out.println("This name is not correct!!!!\n");
                continue;
            } else {
                System.out.println("Welcome to the " + libName + " library");
            }

            Library library = new Library();
            library.name = libName;

            while (continueRunning) {
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
                    String priceStr = scan.nextLine();
                    int price=Integer.parseInt(priceStr);

                    System.out.println("Count: ");
                    String countStr = scan.nextLine();
                    int count=Integer.parseInt(countStr);
                    
                    Book newBook = new Book(name, author, language, price, count);

                    if (Helper.isValidString(name) && Helper.isValidString(author) && Helper.isValidString(language) && Helper.isValidNumber(price) && Helper.isValidNumber(count)) {
                        library.addBook(newBook);
                        System.out.println("Book added to the " + libName + "\n");
                    } else {
                        System.out.println("Enter correct values!\n");
                    }

                } else if (input == 2) {
                    System.out.println("Enter the Name of the book which you will give a new price: ");
                    String bookName = scan.nextLine();

                    System.out.println("Enter the Author name of the book which you will give a new price: ");
                    String authorName = scan.nextLine();

                    System.out.println("Enter new price: ");
                    String newPriceStr = scan.nextLine();
                    int newPrice = Integer.parseInt(newPriceStr);

                    Book bookUpdate = library.findBookByName(bookName);

                    Book nameExist = library.findBookByNameAndAuthor(bookName, authorName);

                    if (nameExist != null && Helper.isValidString(bookName) && Helper.isValidString(authorName) && Helper.isValidNumber(newPrice)) {
                        bookUpdate.price = newPrice;
                        System.out.println("Price of book updated! \n");
                    } else {
                        System.out.println("Please enter both book name and author name correctly!\n");
                    }
                } else if (input == 3) {
                    System.out.println("Enter the book name to delete");
                    String bookNameToDelete = scan.nextLine();

                    System.out.println("Enter the author name to delete");
                    String authorNameToDelete = scan.nextLine();

                    System.out.println("1.Remove All");
                    System.out.println("2.Reduce Count");

                    String choiceRemove = scan.nextLine();
                    int inputRemove = Helper.tryParseInt(choiceRemove);

                    if (inputRemove == 1) {
                        library.removeBookByNameAndAuthor(bookNameToDelete, authorNameToDelete);
                        System.out.println("Book removed from " + libName);

                    } else if (inputRemove == 2) {
                        System.out.println("How many books do you want to delete?");
                        String count = scan.nextLine();
                        int countRemove = Helper.tryParseInt(count);

                        Book foundBookByNameAndAuthor = library.findBookByNameAndAuthor(bookNameToDelete, authorNameToDelete);

                        if (foundBookByNameAndAuthor == null) {
                            System.out.println("Enter correct values!\n");
                        } else {
                            library.reduceBook(foundBookByNameAndAuthor, countRemove);

                            //kitabin sayini azaldir ve eger count 0 olsa onda umumen silir
                            if (foundBookByNameAndAuthor.count <= 0) {
                                library.removeBookByNameAndAuthor(bookNameToDelete, authorNameToDelete);
                            }
                        }
                    }

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
                            foundBookByName.fullInfo();
                            break;
                        case 2:
                            System.out.println("Author name: ");
                            String findBookAuthor = scan.nextLine();
                            Book foundBookByAuthor = library.findBookByAuthor(findBookAuthor);
                            foundBookByAuthor.fullInfo();
                            break;
                        case 3:
                            System.out.println("Find with book name and author name ");
                            System.out.println("Book name: ");
                            String bookName = scan.nextLine();
                            System.out.println("Author name: ");
                            String bookAuthor = scan.nextLine();

                            Book foundBookByNameAndAuthor = library.findBookByNameAndAuthor(bookName, bookAuthor);

                            if (foundBookByNameAndAuthor != null) {
                                foundBookByNameAndAuthor.fullInfo();
                            } else {
                                System.out.println("Check your answers. Enter name and author name correctly!");
                            }
                            break;
                        default:
                            System.out.println("Enter correct number");
                    }
                } else if (input == 5) {
                    System.out.println("\n");
                    System.out.println("All books in library: ");
                    library.showBooks();
                    System.out.println("\n");
                } else if (input == 6) {
                    continueRunning = false;
                    System.out.println("Closed");
                } else{
                    System.out.println("Enter number 1-6 range");
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
