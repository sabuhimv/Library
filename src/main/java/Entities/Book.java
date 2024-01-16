package Entities;

public class Book {

    private int id;
    private static int Id;

    public String name;
    public String author;
    public String language;
    public int price;
    public int count=1;

    public Book(String name, String author, String language, int price) {
        this.name = name;
        this.author = author;
        this.language = language;
        this.price = price;
    }

    public String fullInfo() {
//        System.out.println(name + author + language + price + count);
        return name + " " + author + " " + language + " Qiymet : " + price + " Say : " + count;
    }

    public Book() {
        Id++;
        id = Id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    public int getCount() {
        return count;
    }

}
