package Basket;

import Basket.Book;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BasketTest {
    private Basket basket;

    @Before
    public void setup() {
        basket = new Basket();
    }

    @Test
    public void createBook() {
        //when
        String autorName = "autor";
        String title = "nazwa";
        double price = 10;
        //given
        Book result = basket.createBook(title, autorName, price);
        //then
        assertEquals(title, result.getTitle());
        assertEquals(autorName, result.getAutorName());
    }

    @Test
    public void testAddOneBook() {
        //given
        Book book = new Book("autor", "nazwa", 10);
        List<Book> books = basket.getBooks();
        assertEquals(0, books.size());
        //when
        basket.addBook(book);
        //then
        assertEquals(1, books.size());
    }

    @Test
    public void clearAll() {
        //given
        List<Book> books = basket.getBooks();
        Book book = new Book("autor", "nazwa", 10);
        Book book2 = new Book("autor2", "nazwa2", 10);
        books.add(book);
        books.add(book2);
        assertEquals(2, books.size());
        //when
        basket.clearAll();
        //then
        assertEquals(0, books.size());
    }

    @Test
    public void removeByTitleTestByNameWhenNamePanTadeusz() {
        //given
        List<Book> books = basket.getBooks();
        Book book = new Book("Pan Tadeusz","autor",30);
        books.add(book);
        //when
        basket.removeBookByName("Pan Tadeusz");

        //then
        assertEquals(0,books.size());
    }
}