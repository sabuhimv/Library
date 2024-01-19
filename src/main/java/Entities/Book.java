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

    public String fullInfo() {
//        System.out.println(name + author + language + price + count);
        return "Name : " + name + "\nAuthor: " + author + "\nLanguage: " + language + "\nPrice: " + price + "\nCount : " + count + "\n";
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
        this.count -= subtractCount;
    }

}
