package library;

import java.util.ArrayList;
import java.util.*;

public class Library {
    private final Map<Integer, Book> books = new HashMap<Integer, Book>();
    private  int id = 0;

    public Book addBook(String title) {
        Book b = new Book(id, title);
        books.put(id, b);
        id++;
        return b;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookInfoById(int id) {
        return books.get(id);
    }

    public boolean removeBook(int id) {
        return books.remove(id) != null;
    }
}
