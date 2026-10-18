package apis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestFactorialProcessAPI {

    @Test
    public void testProcessCreation() {

        FactorialProcessImpl process =
                new FactorialProcessImpl();

        assertNotNull(process);
    }
}