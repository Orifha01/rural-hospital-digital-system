package model;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private String patientId;
    private String name;
    private String contactNumber;

    // Relationships
    private List<Appointment> appointments;
    private List<MedicalRecord> medicalRecords;
    private List<MedicationSchedule> medicationSchedules;
    private List<Notification> notifications;
    private Bed assignedBed;

    public Patient(String patientId, String name, String contactNumber) {
        this.patientId = patientId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.appointments = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
        this.medicationSchedules = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    public void register() {
        System.out.println("Patient registered: " + name);
    }

    public void updateProfile() {
        System.out.println("Profile updated");
    }

    public void requestAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Getters & Setters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public void setAssignedBed(Bed bed) { this.assignedBed = bed; }
}
