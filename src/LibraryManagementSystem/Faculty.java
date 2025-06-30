package LibraryManagementSystem;

public class Faculty extends User{
    private String facultyID;
    private String department;

    public Faculty(String name, int age, String address, String userID, String department){
        super(name, age, address, userID, null, null);
        this.facultyID = userID;
        this.department = department;
    }
    public void renewMembership(Student student){
        System.out.println("Membership renewd for: " + student.getName() + "student ID: " + student.getUserId());
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Department: " + department);
    }
}
