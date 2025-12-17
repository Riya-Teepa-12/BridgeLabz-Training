import java.util.Scanner;

class PriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // displaying  the quantity and unit price
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );
    }
}
