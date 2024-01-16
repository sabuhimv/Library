package Entities;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        books = new ArrayList<>();
    }
    
    public void addBook(Book book){
        for(Book item : books){
            if(item.equals(book)){
                book.count++;
                return;
            }
        }
        
        books.add(book);        
    }
    
    public void showBooks(){
        for(Book i : books){
            System.out.println(i.fullInfo());
        }
    }
    
//    public void removeBookByNameAndAuthor(String name, String author){
//        Book book = new Book();
//        if(book.getName().equals(name) && book.getAuthor().equals(author)){
//            books.remove(book);
//        }
//    }
    public void removeBook(Book book){
        books.remove(book);
    }
    
    public void removeAll(){
        books.removeAll(books);
    }
    
    public ArrayList<Book> searchBooksByAuthor(String author){
        ArrayList<Book> result = new ArrayList<>();
        
        for(Book book:books){
            if(book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        
        return result;
    }
    
    public ArrayList<Book> searchBooksByName(String name){
        ArrayList<Book> result = new ArrayList<>();
        
        for(Book book : books){
            if(book.name.equals(name)){
                result.add(book);
            }
        }
        return result;
    }
    
    
    
    
    
    
    
}