import java.util.Scanner;

public class PlusOneCalculator {

    // Method to add one to the number represented by the array
    public int[] plusOne(int[] digits) {

        // Traverse the array from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9, create a new array with extra space
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = input.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter digits:");

        for (int i = 0; i < n; i++) {
            digits[i] = input.nextInt();
        }

        PlusOneCalculator obj = new PlusOneCalculator();
        int[] result = obj.plusOne(digits);

        System.out.print("Result after plus one: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }

        input.close();
    }
}
