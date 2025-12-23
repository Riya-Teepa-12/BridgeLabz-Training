import java.util.*;

public class SplitSolve{

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
        for(int i=0;i<len;i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] sIndex = new int[wordCount + 1];
        int index = 0;
        sIndex[index++] = -1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                sIndex[index++] = i;
            }
        }
        sIndex[index] = len;
        String[] words = new String[wordCount];
        for (int i=0;i<wordCount;i++) {
            String word = "";
            for (int j= sIndex[i]+1; j<sIndex[i + 1];j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input using nextLine()
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        String[] cWords = customSplit(text);
        String[] Words = text.split(" ");

        boolean result = compareArrays(cWords,Words);
        System.out.println("Words using custom split:");
        for (String word : cWords) {
            System.out.println(word);
        }

        System.out.println("Words using built-in split:");
        for (String word : Words) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both split results same? " + result);

        input.close();
    }
}
