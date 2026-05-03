# Class Diagram – Rural Hospital Digital System

---

## Overview

This class diagram models the structural design of the Rural Hospital Digital System. It identifies the core entities, their attributes, behaviors (methods), and the relationships between them. The design reflects the workflows and requirements defined in previous assignments, including appointment booking, medical records, medication reminders, and hospital resource management.

---

## Class Diagram (Mermaid)

```mermaid
classDiagram

%% ========================
%% Core User Entities
%% ========================

package model;

public class Patient {
    private String patientId;
    private String name;
    private String contactNumber;

    public Patient(String patientId, String name, String contactNumber) {
        this.patientId = patientId;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public void register() {
        System.out.println("Patient registered: " + name);
    }

    public void updateProfile() {
        System.out.println("Profile updated for: " + name);
    }
}

package model;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;

    public Doctor(String doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public void consultPatient() {
        System.out.println("Doctor " + name + " is consulting.");
    }
}

%% ========================
%% Appointment System
%% ========================

package model;

import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private LocalDateTime dateTime;
    private String status;

    public Appointment(String appointmentId, LocalDateTime dateTime) {
        this.appointmentId = appointmentId;
        this.dateTime = dateTime;
        this.status = "Pending";
    }

    public void book() {
        status = "Confirmed";
        System.out.println("Appointment booked.");
    }

    public void cancel() {
        status = "Cancelled";
        System.out.println("Appointment cancelled.");
    }
}

class TimeSlot {
    -slotId: String
    -startTime: DateTime
    -endTime: DateTime
    -status: String
    +reserveSlot()
    +releaseSlot()
    +markBooked()
}

%% ========================
%% Medical Records
%% ========================

class MedicalRecord {
    -recordId: String
    -diagnosis: String
    -treatment: String
    -notes: String
    -createdDate: DateTime
    +addRecord()
    +updateRecord()
    +archiveRecord()
}

%% ========================
%% Hospital Resources
%% ========================

class Bed {
    -bedId: String
    -status: String
    -wardNumber: String
    +assignBed()
    +releaseBed()
    +markMaintenance()
}

%% ========================
%% Medication System
%% ========================

class MedicationSchedule {
    -scheduleId: String
    -medicationName: String
    -dosage: String
    -frequency: String
    -startDate: Date
    -endDate: Date
    +scheduleMedication()
    +markTaken()
    +updateSchedule()
}

%% ========================
%% Notification System
%% ========================

class Notification {
    -notificationId: String
    -message: String
    -status: String
    -sentAt: DateTime
    +send()
    +retry()
    +markRead()
}

%% ========================
%% Relationships
%% ========================

%% Patient & Appointment
Patient "1" --> "0..*" Appointment : books
Doctor "1" --> "0..*" Appointment : attends

%% Appointment & TimeSlot
Appointment "1" --> "1" TimeSlot : uses
TimeSlot "1" --> "0..1" Appointment : reservedFor

%% Patient & Medical Record (Composition)
Patient "1" *-- "0..*" MedicalRecord : owns
Doctor "1" --> "0..*" MedicalRecord : writes
Appointment "1" --> "0..1" MedicalRecord : generates

%% Bed Assignment
Patient "1" --> "0..1" Bed : assigned
Bed "1" --> "0..1" Patient : occupiedBy

%% Medication
Patient "1" --> "0..*" MedicationSchedule : follows

%% Notifications
Patient "1" --> "0..*" Notification : receives
Appointment "1" --> "0..*" Notification : triggers
MedicationSchedule "1" --> "0..*" Notification : triggers
