import java.util.Scanner;

public class MultiplyStringsCalculator{

    // Method to multiply two numbers given as strings
    public String multiply(String num1, String num2) {

        // If either number is zero, result is zero
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        // Multiply each digit and store result
        for (int i = n - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';

            for (int j = m - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                int sum = result[i + j + 1] + d1 * d2;
                result[i + j + 1] = sum % 10;     
                result[i + j] += sum / 10;        
            }
        }

        // Convert result array to string (skip leading zeros)
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = input.nextLine();

        System.out.print("Enter second number: ");
        String num2 = input.nextLine();

        MultiplyStringsCalculator obj = new MultiplyStringsCalculator();
        String result = obj.multiply(num1, num2);

        System.out.println("Product is: " + result);

        input.close();
    }
}
