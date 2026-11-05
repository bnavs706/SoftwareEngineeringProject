package extraCredit;

public interface InventoryService {
	boolean checkStock(String itemID, int quantity);
	
	void reserveItem(String itemID, int quantity);
	
}
