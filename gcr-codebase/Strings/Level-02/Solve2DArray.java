import java.util.Scanner;

public class Solve2DArray{

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {

        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Storing  space indexes
        int[] sIndex = new int[wordCount + 1];
        int idx = 0;
        sIndex[idx++] = -1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                sIndex[idx++] = i;
            }
        }
        sIndex[idx] = len;

        // Extracting words from the strings
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j=sIndex[i]+1;j<sIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for(int i=0;i<words.length;i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
     return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordWithLength(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + length);
        }

        input.close();
    }
}
