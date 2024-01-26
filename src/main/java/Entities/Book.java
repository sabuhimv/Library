package Entities;

public class Book {

    private int id;
    private static int Id;

    public String name;
    public String author;
    public String language;
    public int price;
    public int count;

    public Book(String name, String author, String language, int price, int count) {
        this.name = name;
        this.author = author;
        this.language = language;
        this.price = price;
        if (count >= 0) {
            this.count = count;
        }
    }

    public void fullInfo() {
//        return "Name : " + name + "\nAuthor: " + author + "\nLanguage: " + language + "\nPrice: " + price + "\nCount : " + count + "\n";
        System.out.println("\n");
        System.out.println("Name : " + name);
        System.out.println("Author : " + author);
        System.out.println("Language : " + language);
        System.out.println("Price : " + price);
        System.out.println("Count : " + count);
    }

    public Book() {
        Id++;
        id = Id;
    }

    public int getId() {
        return id;
    }

    public void increaseCount(int addCount) {
        if (addCount >= 0) {
            this.count += addCount;
        }
    }

    public void reduceCount(int subtractCount) {
        if (subtractCount >= 0) {
            this.count -= subtractCount;
        }
    }
    
}
