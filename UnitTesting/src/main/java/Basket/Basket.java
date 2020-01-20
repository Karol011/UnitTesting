package Basket;

import org.junit.Before;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Basket {
    Book book;
    List<Book> books= new ArrayList<>();
    public List<Book> getBooks() {
        return books;
    }
    public Book createBook(String title, String autorName, double price){
        return new Book(title, autorName, price);
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void clearAll(){
        books.clear();
    }

    public int calculatePrice(){
        int generalPrice=0;
        for(Book book:books){
            generalPrice= (int) +book.getPrice();
        }
        return generalPrice;
    }
    public void removeBookByName(String title){
        Predicate<Book> condition= book->book.getTitle().equals(title);
        books.removeIf(condition);
    }}
