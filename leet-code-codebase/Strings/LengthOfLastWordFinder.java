import java.util.Scanner;

public class LengthOfLastWordFinder{

    // Returns the length of the last word in a string
    public static int lengthOfLastWord(String s) {
        String[] str = s.trim().split("\\s+");
        String lastWord = str[str.length - 1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        // Method call
        int result = lengthOfLastWord(s);

        // Output result
        System.out.println("Length of last word: " + result);

        input.close();
    }
}
