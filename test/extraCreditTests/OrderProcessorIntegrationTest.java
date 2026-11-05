package extraCreditTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

import extraCredit.InventoryService;
import extraCredit.OrderProcessor;

public class OrderProcessorIntegrationTest {

	@Test 
	void testOrderProcessorWithRealInventory(){
		
		InMemoryInventoryService service = new InMemoryInventoryService();
		
		service.addStock("Shirt", 10);
		
		OrderProcessor processor = new OrderProcessor(service);
		
		boolean result = processor.processOrder("Shirt", 4);
		
		assertTrue(result);
		
		assertEquals(6, service.getStock("Shirt"));
		
		
	}
	
	
	
	
	
	}


	class InMemoryInventoryService implements InventoryService {
		
		private HashMap<String, Integer> inventory = new HashMap<>();
		
		@Override
		// Using HashMaps for testing. 
		// 
		public boolean checkStock(String itemID, int quantity) {
			// TODO Auto-generated method stub
			int stock = inventory.getOrDefault(itemID, 0);
			
			return stock >= quantity;
		}

		@Override
		public void reserveItem(String itemID, int quantity) {
			int stock = inventory.getOrDefault(itemID, 0);
			
			int remaining = stock - quantity;
			
			inventory.put(itemID, remaining);
			
		}
		public void addStock(String itemID, int quantity) {
			inventory.put(itemID, quantity);
		}
		public int getStock(String itemId) {
			return inventory.getOrDefault(itemId, 0);
		}
		
	}
	
// .\gradlew.bat test --tests "*OrderProcessorIntegrationTest"

