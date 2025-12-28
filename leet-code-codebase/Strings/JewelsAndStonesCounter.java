import java.util.Scanner;

public class JewelsAndStonesCounter {

    // Method to count jewels in stones
    public static int numJewelsInStones(String jewels, String stones) {

        // Array to store frequency of each character (ASCII range)
        int[] freq = new int[256];

        // Count occurrences of each stone character
        for (char ch : stones.toCharArray()) {
            freq[ch]++;
        }

        int count = 0;

        // Sum frequencies of jewel characters
        for (char ch : jewels.toCharArray()) {
            count += freq[ch];
        }

        return count;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jewels string
        System.out.print("Enter jewels string: ");
        String jewels = input.nextLine();

        // Input stones string
        System.out.print("Enter stones string: ");
        String stones = input.nextLine();

        // Call method and display result
        int result = numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);

        input.close();
    }
}
