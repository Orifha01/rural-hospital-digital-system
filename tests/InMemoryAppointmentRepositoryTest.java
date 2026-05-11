package tests;

import repositories.inmemory.InMemoryAppointmentRepository;
import src.Appointment;

public class InMemoryAppointmentRepositoryTest {

    public static void main(String[] args) {

        InMemoryAppointmentRepository repository =
                new InMemoryAppointmentRepository();

        Appointment appointment = new Appointment(
                "A001",
                "2026-06-01 10:00",
                "Confirmed"
        );

        repository.save(appointment);

        System.out.println(repository.findById("A001"));

        System.out.println(repository.findAll());

        repository.delete("A001");

        System.out.println(repository.findAll());
    }
}
