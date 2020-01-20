package Basket;


public class Book {
    private String title;
    private String autorName;
    private double price;

    public Book(String title, String autorName, double price) {
        this.title = title;
        this.autorName = autorName;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAutorName() {
        return autorName;
    }

    public double getPrice() {
        return price;
    }
}