import java.util.*;

public class TableCharacterType{

    // Method to check character type 
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find character and its type using charAt()
    public static String[][] findCharacterTypes(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
       
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {

        System.out.println("\nCharacter\tType");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0]+"\t\t"+table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		// Take input
		
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String[][] result = findCharacterTypes(str);

        // Display result
        displayTable(result);

        input.close();
    }
}
