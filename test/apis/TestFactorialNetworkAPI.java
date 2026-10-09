
package apis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class TestFactorialNetworkAPI {
	@Test
	public void testFactorialRequest() {
		FactorialConceptualAPI mockConceptual =
		        mock(FactorialConceptualAPI.class);
		FactorialNetworkImpl network =
		        new FactorialNetworkImpl(mockConceptual);
		FactorialRequest request = new FactorialRequest(
			    "numbers.txt",
			    "results.txt",
			    ":",
			    "\n",
			    true
			);
		assertNotNull(network);
		assertEquals("numbers.txt", request.getInputSource());
		assertEquals("results.txt", request.getOutputDestination());
		FactorialResponse response = network.factorialRequest(request);
	}
}