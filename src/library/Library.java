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

    public static void printBookHeader() {
        String titleHeader = String.format("%-30s", "Title");
        String authorHeader = String.format("%-20s", "Author");
        String dateHeader = String.format("%-15s", "Date Created");
        String quantityHeader = String.format("%-10s", "Quantity");
        String availabilityHeader = "Availability";

        System.out.println(titleHeader + " | " + authorHeader
                + " | " + dateHeader + " | " + quantityHeader
                + " | " + availabilityHeader);
    }
    public void printBooks() {
        System.out.println("---------------| Books |----------------");
        if (books.isEmpty()) {
            System.out.println("is Empty");
            return;
        }
        printBookHeader();
        for (Book book : books) {
            book.printBook();
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
