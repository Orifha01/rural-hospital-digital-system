package tests;

import repositories.inmemory.InMemoryPatientRepository;
import src.Patient;

public class InMemoryPatientRepositoryTest {

    public static void main(String[] args) {

        InMemoryPatientRepository repository =
                new InMemoryPatientRepository();

        // CREATE
        Patient patient = new Patient(
                "P001",
                "John Doe",
                "1990-05-10",
                "0712345678"
        );

        repository.save(patient);

        // READ
        System.out.println("Find By ID:");
        System.out.println(repository.findById("P001"));

        // READ ALL
        System.out.println("Find All:");
        System.out.println(repository.findAll());

        // DELETE
        repository.delete("P001");

        System.out.println("After Delete:");
        System.out.println(repository.findAll());
    }
}
