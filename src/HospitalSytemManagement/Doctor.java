package HospitalSytemManagement;

public class Doctor extends Person{
    private String specialization;
    private int experience;

    public Doctor(String name, int age, String gender, String specialization, int experience){
        super(name,age,gender);
        this.specialization=specialization;
        this.experience=experience;
    }
    public void diagnose(Patient patient){
        System.out.println("Diagnosing patient: " + patient.getName() + " with condition: " + patient.getCondition());
    }
    private String getSpecialization(){
        return specialization;
    }
    private int getExperience(){
        return experience;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Experience: " + getExperience() + " years");
    }
}

