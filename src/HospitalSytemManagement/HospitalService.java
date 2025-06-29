package HospitalSytemManagement;

public class HospitalService {

    public double getServicePrice(String service) {
        switch (service.toLowerCase()) {
            case "consultation":
                return 50;
            case "surgery":
                return 1500;
            case "icu":
                return 500;
            case "emergency":
                return 250;
            case "x-ray":
                return 200;
            case "bloodtest":
                return 100;
            default:
                return 100;
        }
    }

    public double calculateBill(Patient patient, String service) {
        return getServicePrice(service);
    }

    public double calculateBill(Patient patient, String[] services) {
        double total = 0;
        for (String service : services) {
            total += getServicePrice(service);
        }
        return total;
    }

    public void monitorTemperature(double temp, Patient patient) {
        while (true) {
            if (temp > 39.5) {
                System.out.println("High fever warning for patient: " + patient.getName());
                break;
            } else if (temp >= 38 && temp <= 39.5) {
                System.out.println("Elevated temperature - mild fever for patient: " + patient.getName());
                break;
            } else if (temp >= 37.5 && temp <= 38) {
                System.out.println("Borderline - keep monitoring for patient: " + patient.getName());
                break;
            } else {
                System.out.println("Normal temperature for patient: " + patient.getName());
                break;
            }
        }
    }

    public void checkPulse(int bpm, Patient patient) {
        int count = 0;
        do {
            if (bpm < 50) {
                System.out.println("Very low - possible bradycardia for patient: " + patient.getName());
            } else if (bpm >= 50 && bpm < 60) {
                System.out.println("Low - observe carefully for patient: " + patient.getName());
            } else if (bpm >= 60 && bpm <= 100) {
                System.out.println("Normal -  for patient: " + patient.getName());
            } else if (bpm > 100 && bpm < 120) {
                System.out.println("High - monitor for patient: " + patient.getName());
            } else {
                System.out.println("Critical - inform cardiologist for patient: " + patient.getName());
            }
            count++;
        } while (count < 1);
    }

    public void handleService(int code, Patient patient, Doctor doctor) {
        switch (code) {
            case 1:
                System.out.println("General Consultation");
                System.out.println("\nDoctor " + doctor.getName() + " will meet patient shortly for consultation: " + patient.getName());
                break;
            case 2:
                System.out.println("Surgery for " + patient.getName());
                break;
            case 3:
                System.out.println("ICU Admission for " + patient.getName());
                break;
            case 4:
                System.out.println("Emergency Handling for " + patient.getName());
                System.out.println("\nDispatching emergency response team");
                break;
            case 5:
                System.out.println("Lab Tests for " + patient.getName());
                break;
        }
    }

    public void checkAdmission(Patient[] patient) {
        int i = 0;
        while (i < patient.length) {
            Patient p = patient[i];
            if (p.isAdmitted()) {
                System.out.println("Patient " + p.getName() + " is admitted." + p.getAdmissionDate());
            } else {
                System.out.println("Patient " + p.getName() + " is not admitted.");
            }
            i++;
        }
    }

    public void processServices(Patient patient, String[] services) {
        int i = 0;
        if (services.length == 0) {
            System.out.println("No services requested for patient : " + patient.getName());
            return;
        }
        do {
            String service = services[i];
            System.out.println("Processing services: " + service + " for patient: " + patient.getName());
            i++;
        } while (i < services.length);
    }
}



