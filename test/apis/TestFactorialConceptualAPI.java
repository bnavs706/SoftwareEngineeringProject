package apis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestFactorialConceptualAPI {

    @Test
    public void testFactorialOperator() {

        FactorialConceptualImpl conceptual =
                new FactorialConceptualImpl();

        assertNotNull(conceptual);
    }
}