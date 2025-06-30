package LibraryManagementSystem;

public class Student extends User{
    String studentID;
    String major;
    public Student(String name, int age, String adress, String userID, String major){
        super(name, age, adress, userID, null, null);
        this.studentID = userID;
        this.major = major;
    }

    public void requestExtension(Book book){
        if (hasBorrowedBook(book)){
            System.out.println("Extension requested for book : "  + book.getTitle());
        } else {
            System.out.println("You have not borrowed this book: " + book.getTitle());
        }
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Student ID: "  + studentID);
        System.out.println("Major: " + major);
    }
}
