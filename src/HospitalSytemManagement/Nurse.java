package HospitalSytemManagement;

public class Nurse extends Person{
    private String shift;

    public Nurse(String name, int age, String gender, String shift){
        super(name,age,gender);
        this.shift=shift;
    }
    public void assistDoctor(Doctor doctor){
        System.out.println(getName() + " assisting doctor " + doctor.getName() + " during shift " + this.shift);
    }
    public String getShift() {
        return shift;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Shift: " + getShift());
    }
}