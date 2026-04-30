# Domain Model – Rural Hospital Digital System

---

## Overview

The domain model represents the core entities, their attributes, behaviours (methods), relationships, and business rules of the Rural Hospital Digital System. It focuses on real-world hospital operations such as patient management, appointment scheduling, medical records, medication tracking, and hospital resource allocation.

This model is derived from:
- Functional requirements (Assignment 4)
- Use cases (Assignment 5)
- Agile user stories (Assignment 6)
- State and activity diagrams (Assignment 8)

---

## 1. Domain Entities

### Entity Table

| Entity | Attributes | Methods | Relationships |
|--------|-----------|--------|--------------|
| **Patient** | patientId, fullName, dateOfBirth, contactNumber, email | register(), updateProfile(), requestAppointment(), viewMedicalHistory() | Books Appointment, Owns MedicalRecord, Assigned Bed, Follows MedicationSchedule, Receives Notification |
| **Doctor** | doctorId, fullName, specialization, availabilityStatus | viewSchedule(), updateAvailability(), consultPatient(), writeMedicalRecord() | Attends Appointment, Writes MedicalRecord |
| **Appointment** | appointmentId, appointmentDateTime, status | book(), cancel(), reschedule(), markCompleted() | Linked to Patient & Doctor, Uses TimeSlot, Generates MedicalRecord, Triggers Notification |
| **TimeSlot** | slotId, startTime, endTime, status | reserveSlot(), releaseSlot(), markBooked() | Assigned to Appointment |
| **MedicalRecord** | recordId, diagnosis, treatment, notes, createdDate | addRecord(), updateRecord(), archiveRecord() | Owned by Patient, Written by Doctor, Generated from Appointment |
| **Bed** | bedId, status, wardNumber | assignBed(), releaseBed(), markMaintenance() | Assigned to Patient |
| **MedicationSchedule** | scheduleId, medicationName, dosage, frequency, startDate, endDate | scheduleMedication(), markTaken(), updateSchedule() | Belongs to Patient, Triggers Notification |
| **Notification** | notificationId, message, status, sentAt | send(), retry(), markRead() | Sent to Patient, Triggered by Appointment & MedicationSchedule |

---

## 2. Entity Responsibilities

### Patient
- Registers and manages personal profile
- Books and manages appointments
- Accesses medical history
- Receives notifications and reminders

### Doctor
- Manages availability and schedule
- Conducts consultations
- Creates and updates medical records

### Appointment
- Represents a scheduled consultation
- Manages booking, cancellation, and rescheduling
- Tracks lifecycle (Pending → Confirmed → Completed)

### TimeSlot
- Controls availability of appointment times
- Prevents double booking
- Supports reservation and release logic

### MedicalRecord
- Stores diagnosis, treatment, and notes
- Maintains patient history
- Supports updates and archival

### Bed
- Represents hospital bed allocation
- Tracks occupancy status
- Supports assignment and release

### MedicationSchedule
- Tracks prescribed medication plans
- Sends reminders for medication intake
- Monitors adherence

### Notification
- Handles system alerts and reminders
- Supports retry logic for failed delivery
- Tracks read/unread status

---

## 3. Relationships Between Entities

### Key Relationships

| Relationship | Description |
|-------------|------------|
| Patient → Appointment (1 to many) | A patient can book multiple appointments |
| Doctor → Appointment (1 to many) | A doctor attends multiple appointments |
| Appointment → TimeSlot (1 to 1) | Each appointment uses one time slot |
| Patient → MedicalRecord (1 to many, composition) | A patient owns their medical records |
| Doctor → MedicalRecord (1 to many) | A doctor writes multiple records |
| Appointment → MedicalRecord (1 to 0..1) | An appointment may generate a record |
| Patient → Bed (1 to 0..1) | A patient may be assigned one bed |
| Patient → MedicationSchedule (1 to many) | A patient can have multiple medication schedules |
| Patient → Notification (1 to many) | A patient receives many notifications |
| Appointment → Notification | Appointment triggers reminders |
| MedicationSchedule → Notification | Medication schedule triggers reminders |

---

## 4. Business Rules

The system enforces the following core business rules:

### Appointment Rules
1. A patient can only book a time slot if it is **available**.
2. A time slot becomes **reserved** when selected and **booked** when confirmed.
3. A patient can cancel or reschedule an appointment before it starts.
4. If a patient does not arrive within the allowed time, the appointment is marked as **NoShow**.

---

### Medical Record Rules
5. Every consultation must create or update a **medical record**.
6. A medical record cannot exist without a **patient** (composition relationship).
7. Medical records must be securely stored and accessible only to authorised users.

---

### Bed Management Rules
8. A bed can only be assigned to **one patient at a time**.
9. A patient can only occupy **one bed at a time**.
10. Beds can be marked as unavailable for maintenance.

---

### Medication Rules
11. Medication reminders must be sent based on the **schedule frequency**.
12. A refill alert must be triggered when medication supply is low.
13. Patients can mark medication as taken.

---

### Notification Rules
14. Notifications must be sent for:
   - Appointment confirmations
   - Appointment reminders
   - Medication reminders
15. Failed notifications must be retried up to **three times**.
16. Notifications must be logged for auditing purposes.

---

## 5. Alignment with Previous Assignments

### Assignment 4 (Requirements)
- Entities map directly to functional requirements such as:
  - Booking appointments
  - Managing records
  - Sending reminders

### Assignment 5 (Use Cases)
- Each use case is supported by one or more entities:
  - Booking → Appointment + TimeSlot
  - Consultation → MedicalRecord
  - Reminder → Notification

### Assignment 6 (Agile Planning)
- User stories are implemented through entity methods:
  - "Book appointment" → Appointment.book()
  - "Receive reminders" → Notification.send()

### Assignment 8 (State & Activity Diagrams)
- State diagrams define object lifecycles (e.g., Appointment states)
- Activity diagrams define workflows (e.g., booking process)
- Domain model provides the structure that supports both

---

## Conclusion

The domain model provides a clear and structured representation of the Rural Hospital Digital System. It ensures:
- Strong alignment with requirements and workflows
- Accurate representation of real-world hospital operations
- Clear relationships between entities
- A solid foundation for class diagram design and system implementation


