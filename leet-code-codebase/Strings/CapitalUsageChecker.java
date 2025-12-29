import java.util.Scanner;

public class CapitalUsageChecker {

    // Method to check correct capital usage
    public static boolean detectCapitalUse(String word) {
        int upperCount = 0;
        int lowerCount = 0;
        boolean firstLower = false;

        // Check if first character is lowercase
        if (Character.isLowerCase(word.charAt(0))) {
            firstLower = true;
        }

        // Count uppercase and lowercase letters from index 1
        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }

        // All letters lowercase
        if (firstLower && lowerCount + 1 == word.length())
            return true;

        // All letters uppercase OR only first letter uppercase
        else if ((upperCount == word.length() - 1 && !firstLower) ||
                 (lowerCount == word.length() - 1 && !firstLower))
            return true;

        return false;
    }

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take word input from user
        System.out.print("Enter a word: ");
        String word = input.next();

        // Call method and print result
        System.out.println("Capital usage correct: " + detectCapitalUse(word));

        input.close();
    }
}
