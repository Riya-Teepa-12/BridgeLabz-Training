import java.util.Scanner;

public class CountWordSegments {

    // Counts number of words (segments) in a string
    public static int countSegments(String s) {
        s = s.trim();

        // If string becomes empty after trim
        if (s.isEmpty()) {
            return 0;
        }

        // Split by one or more spaces
        String[] words = s.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        // Method call
        int result = countSegments(s);

        // Output result
        System.out.println("Number of word segments: " + result);

        input.close();
    }
}
