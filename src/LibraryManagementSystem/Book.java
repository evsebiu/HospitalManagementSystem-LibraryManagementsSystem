package LibraryManagementSystem;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private LocalDate publicationDate;

    public Book(String title, String author, String isbn, boolean isAvailable, LocalDate publicationDate){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isAvailable=isAvailable;
        this.publicationDate=publicationDate;
    }
    public String getAuthor(){
        return author;
    }

    public void borrow(){
        if(isAvailable){
            System.out.println("Borrowing book: " + this.title);
        } else {
            System.out.println("Book is not available right now for borrowing: " + this.title);
        }
    }
    public void returnBook(){
        System.out.println("Returning book: " + this.title);
        isAvailable = true;
    }
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + isAvailable ) ;
        System.out.println("Publication Date: " + publicationDate);
    }


    public String getTitle(){
        return title;
    }
}
