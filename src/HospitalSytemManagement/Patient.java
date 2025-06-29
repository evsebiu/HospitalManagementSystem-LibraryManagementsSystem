package HospitalSytemManagement;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Patient extends Person {
    private String condition;
    private boolean admitted;
    private LocalDate admissionDate;

    Patient(String name, int age, String gender, String condition, boolean admitted, LocalDate admissionDate) {
        super(name, age, gender);
        this.condition = condition;
        this.admitted = admitted;
        this.admissionDate = admissionDate;
    }

    public void admit() {
        this.admitted = true;
        this.admissionDate = LocalDate.now();
        System.out.println("Patient " + getName() + " has been admitted." + "Admission Date: " + admissionDate);
    }

    public void discharge() {
        this.admitted = false;
        this.admissionDate = null;
        System.out.println("Patient " + getName() + " has been discharged." + "Admission Date: " + LocalDateTime.now().toLocalDate());
    }
    public boolean isAdmitted(){
        return admitted;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Condition: " + condition);
        System.out.println("Admitted: " + (admitted ? "Yes" : "No"));
        if (admitted) {
            System.out.println("Admission Date: " + (admitted ? admissionDate : "Not Applicable"));
        } else {
            System.out.println("Admission Date: Not Applicable");
        }
    }
    public String getCondition() {
        return condition;
    }
    public LocalDate getAdmissionDate(){
        return admissionDate;
    }
}

