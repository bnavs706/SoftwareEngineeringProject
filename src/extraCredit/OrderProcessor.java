package extraCredit;

public class OrderProcessor {
	private InventoryService inventoryservice;
	
	public OrderProcessor(InventoryService inventoryservice) {
		this.inventoryservice = inventoryservice;
	}
	public boolean processOrder(String itemID, int quantity) {
		if (inventoryservice.checkStock(itemID, quantity)) {
			inventoryservice.reserveItem(itemID, quantity);
			return true;
		}
		return false;
		}
}
