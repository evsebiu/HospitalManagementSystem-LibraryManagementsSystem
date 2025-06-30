package LibraryManagementSystem;

public class Librarian extends Person{
    String staffID;
    String shift;
    Librarian(String name, int age, String address, String staffID, String shift){
        super(name, age, address);
        this.staffID = staffID;
        this.shift = shift;
    }
    public void addBook(Book book){
        System.out.println("Book added: " + book.getTitle());
    }
    public void removeBook(Book book){
        System.out.println("Removed book: " + book.getTitle());
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Staff ID: " + staffID);
        System.out.println("Shift: " + shift);
    }

}
