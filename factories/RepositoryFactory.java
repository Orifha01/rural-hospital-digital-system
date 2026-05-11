package factories;

import repositories.PatientRepository;
import repositories.DoctorRepository;
import repositories.AppointmentRepository;

import repositories.inmemory.InMemoryPatientRepository;
import repositories.inmemory.InMemoryDoctorRepository;
import repositories.inmemory.InMemoryAppointmentRepository;

public class RepositoryFactory {

    public static PatientRepository getPatientRepository(String storageType) {

        switch (storageType.toUpperCase()) {

            case "MEMORY":
                return new InMemoryPatientRepository();

            default:
                throw new IllegalArgumentException("Invalid storage type");
        }
    }

    public static DoctorRepository getDoctorRepository(String storageType) {

        switch (storageType.toUpperCase()) {

            case "MEMORY":
                return new InMemoryDoctorRepository();

            default:
                throw new IllegalArgumentException("Invalid storage type");
        }
    }

    public static AppointmentRepository getAppointmentRepository(String storageType) {

        switch (storageType.toUpperCase()) {

            case "MEMORY":
                return new InMemoryAppointmentRepository();

            default:
                throw new IllegalArgumentException("Invalid storage type");
        }
    }
}
