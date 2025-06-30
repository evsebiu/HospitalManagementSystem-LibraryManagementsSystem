package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public void addBook(Book book){
        System.out.println("Book added: " + book.getTitle());
    }
    public void addBooks(Book[] books){
        for ( Book book : books){
            addBook(book);
        }
    }
    public Book searchBook(String title, Book[] books){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle());
            } else {
                System.out.println("Book not found: " +title);
            }
        return book;
        }
        return null;
    }
     public List<Book> searchBook(String author, String genre){
        List<Book> foundBooks = new ArrayList<>();
        Book[] books = new Book[5];
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
                System.out.println("Book found: " + book.getTitle());
            }
        }
        if (foundBooks.isEmpty()) {
            System.out.println("No books found by author: " + author);
        }
        return foundBooks;
    }

    public void checkOverdueLoans(Loan[] loans){
        int i=0;
        while (i<loans.length){
            Loan loan=loans[i];
        if (loan.isOverdue){
            System.out.println("Overdue loan found for book: " + loan.getBook().getTitle() + " borrowed by user: " + loan.getUser().getUserId());
        }
        i++;
        }
    }
    public void processReturns(User user, Book[] book){

    }

}
