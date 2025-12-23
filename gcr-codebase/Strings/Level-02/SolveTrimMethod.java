import java.util.Scanner;

public class SolveTrimMethod{

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;
        try {
            while (true) {
                text.charAt(end);
                end++;
            }
        } catch (Exception e) {
            end = end - 1;
        }
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
      return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {

        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        int i = 0;
        while (true) {
            try {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }catch (Exception e) {
                break;
            }
        }
        try {
            s1.charAt(i);
            return false;
        } catch (Exception e) {
        }
        try {
            s2.charAt(i);
            return false;
        } catch (Exception e) {
		}
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string with spaces: ");
        String str = input.nextLine();
        int[] indexes = findTrimIndexes(str);
        String trimCustom = customSubstring(str, indexes[0], indexes[1]);
        String trimBuiltIn = str.trim();

        // Compare results
        boolean isSame = compareStrings(trimCustom, trimBuiltIn);

        // Display result
        System.out.println("\nCustom Trim Result   : [" + trimCustom + "]");
        System.out.println("Built-in Trim Result : [" + trimBuiltIn + "]");
        System.out.println("Are both results same? " + isSame);

        input.close();
    }
}
