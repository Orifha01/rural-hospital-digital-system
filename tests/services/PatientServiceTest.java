public class PatientServiceTest {

    @Test
    void shouldCreatePatient() {

        PatientRepository repo = new InMemoryPatientRepository();

        PatientService service = new PatientService(repo);

        Patient patient = new Patient("P1", "John Doe");

        service.addPatient(patient);

        assertNotNull(service.getPatient("P1"));
    }
}
