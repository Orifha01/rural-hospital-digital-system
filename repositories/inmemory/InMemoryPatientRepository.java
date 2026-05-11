package repositories.inmemory;

import repositories.PatientRepository;
import src.Patient;

import java.util.*;

public class InMemoryPatientRepository implements PatientRepository {

    private Map<String, Patient> storage = new HashMap<>();

    @Override
    public void save(Patient patient) {
        storage.put(patient.getPatientId(), patient);
    }

    @Override
    public Optional<Patient> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Patient> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
