 package LibraryManagementSystem;

import java.time.LocalDateTime;

public class Loan {
    private User user;
    private Book book;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
    private boolean isOverdue;

    public Loan(User user, Book book, LocalDateTime loanDate, LocalDateTime returnDate, boolean isOverdue){
        this.user=user;
        this.book=book;
        this.loanDate=loanDate;
        this.returnDate=returnDate;
        this.isOverdue=isOverdue;
    }
    public void recordLoan(){
        System.out.println("Loan recorder for user: " + user.getUserId() + " name " + user.getName() + " for book " + book.getTitle());
    }
    public void recordReturn(){
        System.out.println("Return recorder for user: " + user.getUserId() + " name " + user.getName() + " for book " + book.getTitle());
    }
    public void checkOverdue(){
        if (isOverdue){
            System.out.println("The book " + book.getTitle() + " is overdue for user " + user.getUserId() + " name " + user.getName());
        } else {
            System.out.println("No overdue for user: " + user.getName() + " ID " + user.getUserId());
        }
    }
    public void printDetails(){
        System.out.println("Loan Details:");
        System.out.println("User: " + user.getName() + " (ID: " + user.getUserId() + ")");
        System.out.println("Book: " + book.getTitle());
        System.out.println("Loan Date: " + loanDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Is Overdue: " + isOverdue);
    }
}
