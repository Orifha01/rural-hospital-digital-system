import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    public void testBuildPatient() {
        Patient patient = new PatientBuilder()
                .setName("John")
                .setAge(30)
                .build();

        assertEquals("John", patient.getName());
    }
}
