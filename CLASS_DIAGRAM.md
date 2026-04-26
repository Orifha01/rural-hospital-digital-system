classDiagram

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

class Appointment {
    -appointmentId: String
    -appointmentDateTime: DateTime
    -status: String
    +book()
    +cancel()
    +reschedule()
    +markCompleted()
}

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

class Bed {
    -bedId: String
    -status: String
    -wardNumber: String
    +assignBed()
    +releaseBed()
    +markMaintenance()
}

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

class Notification {
    -notificationId: String
    -message: String
    -status: String
    -sentAt: DateTime
    +send()
    +retry()
    +markRead()
}

