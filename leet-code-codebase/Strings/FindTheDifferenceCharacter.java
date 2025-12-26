import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheDifferenceCharacter {

    // Finds the extra character present in string t
    public static char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<>();
        List<Character> list1 = new ArrayList<>();

        // Add characters of s to list
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        // Add characters of t to list1
        for (int i = 0; i < t.length(); i++) {
            list1.add(t.charAt(i));
        }

        // Remove matching characters
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list1.contains(list.get(i))) {
                list1.remove(list.get(i));
                list.remove(list.get(i));
            }
        }

        return list1.get(0); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string (s): ");
        String s = input.nextLine();

        System.out.print("Enter second string (t): ");
        String t = input.nextLine();

        // Method call
        char result = findTheDifference(s, t);

        //  displaying the Output
        System.out.println("Extra character is: " + result);

        input.close();
    }
}
