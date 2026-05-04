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

class Patient {
    -patientId: String
    -fullName: String
    -dateOfBirth: Date
    -contactNumber: String
    -email: String
    +register()
    +updateProfile()
    +requestAppointment()
    +viewMedicalHistory()
}

class Doctor {
    -doctorId: String
    -fullName: String
    -specialization: String
    -availabilityStatus: String
    +viewSchedule()
    +updateAvailability()
    +consultPatient()
    +writeMedicalRecord()
}
%% ========================
%% Appointment System
%% ========================

class Appointment {
    -appointmentId: String
    -appointmentDateTime: DateTime
    -status: String
    +book()
    +cancel()
    +reschedule()
    +markCompleted()
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
