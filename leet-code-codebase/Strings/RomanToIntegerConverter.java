import java.util.Scanner;

public class RomanToIntegerConverter {

    // Method to convert Roman numeral to integer
    public static int romanToInt(String s) {
        int total = 0;        
        int prevValue = 0;    

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getRomanValue(s.charAt(i));

            // If current value is smaller than previous, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }

            // Update previous value
            prevValue = currentValue;
        }

        return total;
    }

    // method to get integer value of Roman numeral
    private static int getRomanValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid Roman numeral
        }
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take Roman numeral input
        System.out.print("Enter a Roman numeral: ");
        String roman = input.nextLine().toUpperCase();

        // Convert Roman numeral to integer
        int result = romanToInt(roman);

        // Display result
        System.out.println("Integer value: " + result);

        input.close();
    }
}
