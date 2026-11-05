package extraCreditTests;

import extraCredit.OrderProcessor;
import extraCredit.InventoryService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderProcessorUnitTest {
	@Test
	void testOrderProcess_CheckStock() {
		InventoryService service = mock(InventoryService.class);
		
		when(service.checkStock("Shirt", 3)).thenReturn(true);
		
		OrderProcessor processor = new OrderProcessor(service);
		
		assertTrue(processor.processOrder("Shirt", 3));
	}
	@Test
	void testProcessOrder_OutOfStock() {
		InventoryService service = mock(InventoryService.class);
		
		when(service.checkStock("Shirt", 3)).thenReturn(false);
		
		OrderProcessor processor = new OrderProcessor(service);
		
		assertFalse(processor.processOrder("Shirt", 3));
	}
}

// .\gradlew.bat test --tests "*OrderProcessorUnitTest"