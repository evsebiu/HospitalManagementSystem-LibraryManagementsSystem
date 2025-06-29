package HospitalSytemManagement;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;
    private boolean confirmed;

    Appointment(Patient patient, Doctor doctor, LocalDateTime dateTime, boolean confirmed){
        this.patient=patient;
        this.doctor=doctor;
        this.dateTime=dateTime;
        this.confirmed=confirmed;
    }
    public void schedule(){
        this.confirmed=true;
        System.out.println("Appointment scheduled for " + patient.getName() + " with " + doctor.getName() + " on " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

    }
    public void cancel(){
        this.confirmed=false;
        System.out.println("Appointment cancelled for " + patient.getName() + " with " + doctor.getName());
    }
    public void printSummary(){
        System.out.println("Appointment Summary: ");
        System.out.println("Patient : " + patient.getName());
        System.out.println("Doctor : " + doctor.getName());
        System.out.println("Date & Time : " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("Confirmed : " + (confirmed ? "Yes" : "No"));
    }
}

