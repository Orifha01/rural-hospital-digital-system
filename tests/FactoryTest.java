import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    public void testVehicleCreation() {
        Vehicle car = VehicleFactory.createVehicle("car");
        assertNotNull(car);
        assertEquals("Car", car.getType());
    }
}
