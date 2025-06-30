package HospitalSytemManagement;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Alice Smith", 45, "Female", "Cardiology", 20);
        Nurse nurse = new Nurse("Nurse John Doe", 30, "Male", "Night");
        Patient patient1 = new Patient("Emily Brown", 28, "Female", "Chest Pain", true, LocalDateTime.now().toLocalDate());
        Patient patient2 = new Patient("Michael Scott", 55, "Male", "Check-up", false, null);
        System.out.println("\n--- Staff & Patient Details ---");
        doctor.printDetails();
        System.out.println();
        nurse.printDetails();
        System.out.println();
        patient1.printDetails();
        System.out.println();
        patient2.printDetails();

        LocalDateTime appointmentTime = LocalDateTime.now().plusHours(5);
        Appointment appointment = new Appointment(patient1, doctor, appointmentTime);
        Appointment appointment2 = new Appointment(patient2, doctor, appointmentTime);

        System.out.println("\n--- Appointment Details ---");
        appointment.schedule();
        appointment.printSummary();
        System.out.println();
        appointment2.schedule();
        appointment2.printSummary();

        System.out.println("\n--- Doctor Diagnosing Patient ---");
        doctor.diagnose(patient1);
        doctor.diagnose(patient2);
        nurse.assistDoctor(doctor);

        System.out.println("\n---Admitting patients---");
        patient1.admit();

        System.out.println("\n--- Diagnose Patient ---");
        doctor.diagnose(patient1);
        doctor.diagnose(patient2);
        System.out.println();


        HospitalService services = new HospitalService();
        services.monitorTemperature(98.6, patient1);
        services.checkPulse(90, patient1);
        services.checkPulse(129, patient2);
        services.monitorTemperature(64,patient2);
        System.out.println();

        // o singura factura pentru serviciu
        double bill1 = services.calculateBill(patient1, "surgery");
        System.out.println("Total bill for " + patient1.getName() + ": $" + bill1);
        // o factura pentru mai multe servicii
        double bill2 = services.calculateBill(patient2, new String[]{"consultation", "x-ray", "bloodtest", "emergency"});
        System.out.println("Total bill for " + patient2.getName() + ": $" + bill2);

        Patient[] patients = {patient1, patient2};
        System.out.println("\n---Admitting patients---");
        for (Patient p : patients) {
            p.printDetails();
            System.out.println("------------------------");
        }

        System.out.println();
        services.checkAdmission(patients);

        System.out.println("\n---Discharging patients---");
        patient2.discharge();
        patient1.discharge();


    }
}
