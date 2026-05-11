package repositories.inmemory;

import repositories.DoctorRepository;
import src.Doctor;

import java.util.*;

public class InMemoryDoctorRepository implements DoctorRepository {

    private Map<String, Doctor> storage = new HashMap<>();

    @Override
    public void save(Doctor doctor) {
        storage.put(doctor.getDoctorId(), doctor);
    }

    @Override
    public Optional<Doctor> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Doctor> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
