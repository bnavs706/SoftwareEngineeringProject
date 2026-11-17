package apis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class FactorialConceptualImplTest {

    @Test
    public void testFactorialOfFour() {

        // Create the real computation component
        FactorialConceptualImpl conceptual =
            new FactorialConceptualImpl();

        // Create a request containing 4
        FactorialComputationRequest request =
            new FactorialComputationRequest(
                BigInteger.valueOf(4)
            );

        // Execute the factorial calculation
        FactorialComputationResult result =
            conceptual.factorialOperator(request);

        // Verify that 4! = 24
        assertEquals(
            BigInteger.valueOf(24),
            result.getResult()
        );
        
    }
    @Test
    public void testNegativeFactorial() {

        FactorialConceptualImpl conceptual =
            new FactorialConceptualImpl();

        FactorialComputationRequest request =
            new FactorialComputationRequest(
                BigInteger.valueOf(-5)
            );

        assertThrows(IllegalArgumentException.class, () -> {
            conceptual.factorialOperator(request);
        });
    }
}