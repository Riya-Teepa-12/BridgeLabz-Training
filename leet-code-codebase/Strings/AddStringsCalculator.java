import java.util.Scanner;

public class AddStringsCalculator {

    // Method to add two numbers given as strings
    public String addStrings(String num1, String num2) {

        int min = Math.min(num1.length(), num2.length());
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < min; i++) {
            int a = Character.getNumericValue(num1.charAt(num1.length() - i - 1));
            int b = Character.getNumericValue(num2.charAt(num2.length() - i - 1));

            sb.append((a + b + carry) % 10);
            carry = (a + b + carry) / 10;
        }

        if (num1.length() > num2.length()) {
            for (int i = num1.length() - min - 1; i >= 0; i--) {
                int a = Character.getNumericValue(num1.charAt(i));
                sb.append((a + carry) % 10);
                carry = (a + carry) / 10;
            }
        } else {
            for (int i = num2.length() - min - 1; i >= 0; i--) {
                int a = Character.getNumericValue(num2.charAt(i));
                sb.append((a + carry) % 10);
                carry = (a + carry) / 10;
            }
        }

        // Append carry if remaining
        if (carry != 0) {
            sb.append(carry);
        }

        // Reverse to get final result
        return sb.reverse().toString();
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = input.nextLine();

        System.out.print("Enter second number: ");
        String num2 = input.nextLine();

        AddStringsCalculator obj = new AddStringsCalculator();
        String result = obj.addStrings(num1, num2);

        System.out.println("Sum is: " + result);

        input.close();
    }
}
