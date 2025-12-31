import java.util.*;

public class SumOfStringsApp {

    // Method to check if sum of firstWord and secondWord equals targetWord
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int sum = 0;
        int num = 0;
        int jum = 0;

        // Convert firstWord to number
        for (int i = 0; i < firstWord.length(); i++)
            sum = sum * 10 + (firstWord.charAt(i) - 'a');

        // Convert secondWord to number
        for (int i = 0; i < secondWord.length(); i++)
            num = num * 10 + (secondWord.charAt(i) - 'a');

        // Convert targetWord to number
        for (int i = 0; i < targetWord.length(); i++)
            jum = jum * 10 + (targetWord.charAt(i) - 'a');

        // Compare sum
        if (jum == sum + num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input words
        System.out.print("Enter first word: ");
        String firstWord = sc.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = sc.nextLine();

        System.out.print("Enter target word: ");
        String targetWord = sc.nextLine();

        // Call method and print result
        boolean result = isSumEqual(firstWord, secondWord, targetWord);
        System.out.println("Result: " + result);
    }
}
