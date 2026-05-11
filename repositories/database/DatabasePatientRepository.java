package repositories.database;

import repositories.PatientRepository;
import src.Patient;

import java.util.List;
import java.util.Optional;

/*
 Future database implementation stub.
 This class will later connect to MySQL, PostgreSQL, MongoDB, etc.
*/

public class DatabasePatientRepository implements PatientRepository {

    @Override
    public void save(Patient patient) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public Optional<Patient> findById(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public List<Patient> findAll() {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }
}
