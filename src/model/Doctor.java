package model;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private String doctorId;
    private String name;
    private String specialization;
    private String availabilityStatus;

    // Relationship
    private List<Appointment> appointments;

    public Doctor(String doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    public void viewSchedule() {
        System.out.println("Viewing schedule...");
    }

    public void updateAvailability(String status) {
        this.availabilityStatus = status;
    }

    public void consultPatient() {
        System.out.println("Consulting patient...");
    }
}
