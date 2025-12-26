import java.util.*;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        int balance = input.nextInt();

        //creating loop to take input multiple times

        while (balance>0) {
            System.out.print("Enter distance travelled or -1 to quit: ");
            int distance = input.nextInt();

            if (distance == -1) {
                break;
            }

            int fare = (distance <= 5) ? 10 : 20;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }

            System.out.println();
        }

        System.out.println("Thank you for using Delhi Metro.");
        input.close();
    }
}
