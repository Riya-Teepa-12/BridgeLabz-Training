import java.util.Scanner;

public class ConsistentStringCounter {

    // Method to count consistent strings
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean flag = true;

            // Check each character in the word
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    flag = false; // Word has a disallowed character
                    break;
                }
            }

            if (flag) {
                count++; // Word is consistent
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take allowed characters input
        System.out.print("Enter allowed characters: ");
        String allowed = input.nextLine();

        // Take number of words input
        System.out.print("Enter the number of words: ");
        int n = input.nextInt();
        input.nextLine(); // consume leftover newline

        String[] words = new String[n];

        // Take words input
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = input.nextLine();
        }

        // Create object and call method
        ConsistentStringCounter counter = new ConsistentStringCounter();
        int result = counter.countConsistentStrings(allowed, words);

        System.out.println("Number of consistent strings: " + result);

        input.close();
    }
}
