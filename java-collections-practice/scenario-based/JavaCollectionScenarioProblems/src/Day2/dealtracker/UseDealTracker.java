package Day2.dealtracker;

public class UseDealTracker {
	public static void main(String[] args) {
        DealTracker<Deal> tracker = new DealTracker<>();

        // sample file path
        String dealsFile = "src/samplefiles/deals.txt";

        try {
            tracker.loadDeals(dealsFile);
            tracker.showActiveDeals();
            tracker.showDealCodes();

        } catch (InvalidDealException e) {
            System.out.println("Deal validation error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
