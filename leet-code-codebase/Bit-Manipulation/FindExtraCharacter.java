import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindExtraCharacter{

    // Method to find the extra character in t
    public char findTheDifference(String s, String t) {
        List<Character> listS = new ArrayList<>();
        List<Character> listT = new ArrayList<>();

        // Add characters of s to listS
        for (int i = 0; i < s.length(); i++) {
            listS.add(s.charAt(i));
        }

        // Add characters of t to listT
        for (int i = 0; i < t.length(); i++) {
            listT.add(t.charAt(i));
        }

        // Remove matching characters
        for (int i = listS.size() - 1; i >= 0; i--) {
            if (listT.contains(listS.get(i))) {
                listT.remove(listS.get(i));
            }
        }

        // The remaining character in listT is the extra one
        return listT.get(0);
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = input.nextLine();

        System.out.print("Enter string t (one extra character than s): ");
        String t = input.nextLine();

        FindExtraCharacter obj = new FindExtraCharacter();
        char extraChar = obj.findTheDifference(s, t);

        System.out.println("The extra character is: " + extraChar);

        input.close();
    }
}
