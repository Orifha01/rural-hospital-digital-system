package tests;

import repositories.inmemory.InMemoryDoctorRepository;
import src.Doctor;

public class InMemoryDoctorRepositoryTest {

    public static void main(String[] args) {

        InMemoryDoctorRepository repository =
                new InMemoryDoctorRepository();

        Doctor doctor = new Doctor(
                "D001",
                "Dr Smith",
                "Cardiology",
                "Available"
        );

        repository.save(doctor);

        System.out.println(repository.findById("D001"));

        System.out.println(repository.findAll());

        repository.delete("D001");

        System.out.println(repository.findAll());
    }
}
