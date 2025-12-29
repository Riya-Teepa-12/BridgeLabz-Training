import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    // Constant discount rates
    public static final double DISCOUNT_TWENTY = 0.20;
    public static final double DISCOUNT_TEN = 0.10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter number of items: ");
        int items = input.nextInt();

        double total = 0.0;

        // Input item prices using for loop
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = input.nextDouble();
            total += price;
        }

        double discount = 0.0;

   
        if (total>= 5000) {
            discount = total* DISCOUNT_TWENTY;
        } else if (total >= 3000) {
            discount = total* DISCOUNT_TEN;
        } else {
            discount = 0;
        }

        double finalAmount = total-discount;

        // Display result
        System.out.println("\n----- Bill Summary -----");
        System.out.println("Total Bill     : " + total);
        System.out.println("Discount       : " + discount);
        System.out.println("Final Amount   : " + finalAmount);

        input.close();
    }
}
