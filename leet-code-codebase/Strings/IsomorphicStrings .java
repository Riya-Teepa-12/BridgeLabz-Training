import java.util.Scanner;

public class IsomorphicStrings {

    // Method to check if two strings are isomorphic
    public static boolean isIsomorphic(String s, String t) {

        int[] arr = new int[256];
        int[] brr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (arr[c1] == 0 && brr[c2] == 0) {
                arr[c1] = c2;
                brr[c2] = c1; 
            }
 
            else if (arr[c1] != c2 || brr[c2] != c1) {
                return false;
            }
        }
        return true;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input strings from user
        System.out.print("Enter first string: ");
        String s = input.nextLine();

        System.out.print("Enter second string: ");
        String t = input.nextLine();

        // Length check
        if (s.length() != t.length()) {
            System.out.println("Strings are not isomorphic");
        } else {
            boolean result = isIsomorphic(s, t);
            System.out.println("Are strings isomorphic? " + result);
        }

        input.close();
    }
}
