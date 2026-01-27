package Day2.medinventory;

import java.io.IOException;

public class UseMedInventory {
       
	public static void main(String[] args) {
		MedInventoryManager manager = new MedInventoryManager();

		// file location
		String csvFile = "src/samplefiles/inventory.csv";
               
		try {
			manager.loadInventory(csvFile);
			manager.showExpiredItems();
			manager.showSummary();
			
		} catch (LowStockException e) {
			
			System.out.println("CRITICAL ALERT: " + e.getMessage());
		} catch (IOException e) {
		   	
			System.out.println("File error: " + e.getMessage());
		} catch (Exception e) {
			
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}
}
