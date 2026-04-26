classDiagram

class Patient {
    -patientId: String
    -name: String
    -dateOfBirth: Date
    -contactNumber: String
    +register()
    +updateProfile()
    +requestAppointment()
}

class Doctor {
    -doctorId: String
    -name: String
    -specialization: String
    -availabilityStatus: String
    +viewSchedule()
    +updateAvailability()
    +consultPatient()
}

class Appointment {
    -appointmentId: String
    -dateTime: DateTime
    -status: String
    +book()
    +cancel()
    +reschedule()
}

class MedicalRecord {
    -recordId: String
    -diagnosis: String
    -treatment: String
    -notes: String
    +addRecord()
    +updateRecord()
}

class Bed {
    -bedId: String
    -status: String
    +assignBed()
    +releaseBed()
}

class MedicationSchedule {
    -scheduleId: String
    -medicationName: String
    -dosage: String
    -frequency: String
    +scheduleMedication()
    +markTaken()
}

class Notification {
    -notificationId: String
    -message: String
    -status: String
    +send()
    +retry()
    +markRead()
}

Patient "1" -- "0..*" Appointment : books
Doctor "1" -- "0..*" Appointment : attends
Patient "1" -- "0..*" MedicalRecord : has
Doctor "1" -- "0..*" MedicalRecord : writes
Patient "0..1" -- "1" Bed : assignedTo
Patient "1" -- "0..*" MedicationSchedule : follows
Patient "1" -- "0..*" Notification : receives
