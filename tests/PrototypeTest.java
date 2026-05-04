import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    public void testClone() {
        Shape original = new Circle(10);
        Shape clone = original.clone();

        assertNotSame(original, clone);
        assertEquals(original.getSize(), clone.getSize());
    }
}
