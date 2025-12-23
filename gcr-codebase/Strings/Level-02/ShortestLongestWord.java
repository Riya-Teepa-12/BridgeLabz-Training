import java.util.*;

public class ShortestLongestWord{

    // Method to find length without using length()
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
        int[] sIndex = new int[wordCount + 1];
        int index = 0;
        sIndex[index++] = -1;
        for (int i = 0; i < len; i++){
            if (text.charAt(i) == ' '){
                sIndex[index++] = i;
            }
        }
        sIndex[index] = len;
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j =sIndex[i]+1;j<sIndex[i + 1];j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestAndLongest(String[][] wordTable) {

        int minI = 0;
        int maxI = 0;
		for (int i = 1; i < wordTable.length; i++) {
            int currentLength = Integer.parseInt(wordTable[i][1]);
            int minLength = Integer.parseInt(wordTable[minI][1]);
            int maxLength = Integer.parseInt(wordTable[maxI][1]);

            if (currentLength < minLength) {
                minI = i;
            }
            if (currentLength > maxLength) {
                maxI = i;
            }
        }

        return new int[]{minI, maxI};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();
        String[] words = customSplit(text);
        String[][] wordTable = wordWithLength(words);
        int[] result = findShortestAndLongest(wordTable);

        // Display result
        System.out.println("Shortest Word: " +
                wordTable[result[0]][0] +" (Length: " + Integer.parseInt(wordTable[result[0]][1]) + ")");

        System.out.println("Longest Word: " +wordTable[result[1]][0]+" (Length: " + Integer.parseInt(wordTable[result[1]][1]) + ")");

        input.close();
    }
}
