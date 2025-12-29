import java.util.Scanner;
public class RepeatedSubstringChecker {
   
       //method to check substring
       public boolean repeatedSubstringPattern(String s) {
        
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

       public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Create object of the class
        RepeatedSubstringChecker checker = new RepeatedSubstringChecker();

        // Call the method and store result
        boolean result = checker.repeatedSubstringPattern(str);

        // Display the result
        if (result) {
            System.out.println("The string follows a repeated substring pattern.");
        } else {
            System.out.println("The string does NOT follow a repeated substring pattern.");
        }

       
        input.close();
    }
}
