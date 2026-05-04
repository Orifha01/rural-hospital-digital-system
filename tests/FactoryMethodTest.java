import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {

    @Test
    public void testPaymentProcessor() {
        PaymentProcessor processor = new CreditCardProcessor();
        String result = processor.processPayment();

        assertEquals("Credit Card Payment", result);
    }
}
