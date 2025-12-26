import java.util.Scanner;

public class ValidPalindromeChecker {

    // Checks if a string is a palindrome
    public static boolean isPalindrome(String s) {
        String f = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                f += s.charAt(i);
            }
        }

        f = f.toLowerCase();

        // Check palindrome
        for (int i = 0; i < f.length() / 2; i++) {
            if (f.charAt(i) != f.charAt(f.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Method call
        boolean result = isPalindrome(s);

        // Output result
        System.out.println("Is palindrome: " + result);

        input.close();
    }
}
