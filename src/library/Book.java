package library;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private Date dateCreating;
    private int qt ;
    private Boolean isAv;

    public Book(String title, String author,
                int qt ){
        this.title = title;
        this.author = author;
        this.qt = qt;
        this.dateCreating = new Date();
        this.isAv = (this.qt != 0);
    }

    public String getTitle() {
        return this.title;
    }
    public Boolean isAvailable() {
        return this.isAv;
    }

    public void printBook(){
        System.out.println(this.title + " | " + this.author
                + " | " + this.dateCreating + " | " + this.qt
                + " | " + (this.isAv ? "Available": "Not Available"));
    }
    public void checkOut(){
        System.out.println(this.title + " is " +
                (this.isAv ? "Available": "Not Available"));
    }

}
