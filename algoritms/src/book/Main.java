package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Title C", "Author B"));
        books.add(new Book("Title A", "Author C"));
        books.add(new Book("Title B", "Author A"));

        Collections.sort(books, Comparator.comparing(Book::getTitle));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
