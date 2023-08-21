package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List <Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println(book.getTitle() + "added to the library");
    }

    public void printAvailableBooks() {
        System.out.println("---------------Available Books :----------------");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.printBook();
            }
        }
    }

    public void sizeOfBooks() {
        System.out.println("number of books is :" + books.size());
    }
    public void sizeOfAvBooks() {
        int c = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                c++;
            }
        }
        System.out.println("number of Available books is :" + c);
    }
}
