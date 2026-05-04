package model;

import java.time.LocalDateTime;

public class Appointment {

    private String appointmentId;
    private LocalDateTime dateTime;
    private String status;

    // Relationships
    private Patient patient;
    private Doctor doctor;

    public Appointment(String appointmentId, LocalDateTime dateTime, Patient patient, Doctor doctor) {
        this.appointmentId = appointmentId;
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
        this.status = "Pending";
    }

    public void book() {
        status = "Confirmed";
    }

    public void cancel() {
        status = "Cancelled";
    }

    public void reschedule(LocalDateTime newTime) {
        this.dateTime = newTime;
    }

    public String getStatus() {
        return status;
    }
}
