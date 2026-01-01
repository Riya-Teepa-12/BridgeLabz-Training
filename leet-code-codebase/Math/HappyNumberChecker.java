import java.util.Scanner;

public class HappyNumberChecker {

    // Method to check whether a number is happy
    public boolean isHappy(int n) {
        int t = n;

        // Reduce the number until it becomes a single digit
        while (t > 9) {
            t = sumNumber(t);
        }

        // A happy number ends with 1 or 7
        return t == 1 || t == 7;
    }

    // Method to calculate sum of squares of digits
    public int sumNumber(int n) {
        int sum = 0;

        while (n != 0) {
            int d = n % 10;
            sum += d * d;
            n = n / 10;
        }
        return sum;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        HappyNumberChecker obj = new HappyNumberChecker();
        boolean result = obj.isHappy(n);

        if (result) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is not a Happy Number");
        }

        input.close();
    }
}
