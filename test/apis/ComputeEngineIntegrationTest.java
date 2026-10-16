package apis;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ComputeEngineIntegrationTest {

    @Test
    public void testComputeEngine() {
    	FactorialConceptualImpl conceptual =
    	        new FactorialConceptualImpl();
    	InMemoryFactorialProcessImpl process =
    	        new InMemoryFactorialProcessImpl();
    	FactorialNetworkImpl network =
    	        new FactorialNetworkImpl(conceptual);
    	// Dependency Injection ^^
    	InMemoryInputSource input =
    	        new InMemoryInputSource(List.of(1, 10, 25));
    	
    	InMemoryOutputDestination output =
    	        new InMemoryOutputDestination();
    	FactorialRequest request =
    	        new FactorialRequest(input, output);
    	List<String> expectedResults = List.of(
    	        "1",
    	        "3628800",
    	        "15511210043330985984000000"
    	        
    	);
    	network.factorialRequest(request);

    	assertEquals(expectedResults, output.getResults());
    }
    
}