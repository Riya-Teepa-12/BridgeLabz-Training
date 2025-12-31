import java.util.HashMap;
import java.util.Map;

public class DigitCountChecker{

    // Method to check digit count condition
    public static boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of each digit in the string
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        // Verify each index matches its digit count
        for (int i = 0; i < num.length(); i++) {
            int expectedCount = num.charAt(i) - '0';
            int actualCount = map.getOrDefault(i, 0);

            if (actualCount != expectedCount) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {
        String num = "1210";

        boolean result = digitCount(num);
        System.out.println("Result: " + result);
    }
}
