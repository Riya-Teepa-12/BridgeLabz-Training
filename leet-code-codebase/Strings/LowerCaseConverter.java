import java.util.Scanner;

public class LowerCaseConverter {

    // Method to convert string to lowercase
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String string= input.nextLine();

        // Convert to lowercase
        String result = toLowerCase(string);

        // Display result
        System.out.println("Lowercase string: " + result);

        input.close();
    }
}
