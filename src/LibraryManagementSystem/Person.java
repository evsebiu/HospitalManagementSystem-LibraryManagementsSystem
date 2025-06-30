package LibraryManagementSystem;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person (String name, int age, String adress){
        this.name = name;
        this.age = age;
        this.address = adress;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    public String getName(){
        return name;
    }
}
