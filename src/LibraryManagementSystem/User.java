package LibraryManagementSystem;

import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.List;

public class User extends Person {
    private String userId;
    private List<Book> borrowedBooks;
    private LocalDate registrationDate;

    public User(String name, int age, String adress, String userId, List<Book> borrowedBooks, LocalDate registrationDate) {
        super(name, age, adress);
        this.userId = userId;
        this.borrowedBooks = borrowedBooks;
        this.registrationDate = registrationDate;
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    boolean hasBorrowedBook(Book book){
        return borrowedBooks.contains(book);
    }
    public String getUserId(){
        return userId;

    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("User ID: " + userId);
        System.out.println("Borrowed Books: " + borrowedBooks);
        System.out.println("registrationDate: " + registrationDate);
    }
}