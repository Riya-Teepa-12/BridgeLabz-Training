import java.util.*;

public class SubstringOccurrence{

    //method to count the substring occurence in string
    public static int countOccurrences(String s, String word) {
        int count = 0;
        int length = s.length() - word.length();
        for (int i=0;i<=length;i++) {
            if (s.substring(i, i + word.length()).equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //taking input from the user
        System.out.print("Enter main string: ");
        String str = input.nextLine();

        System.out.print("Enter substring: ");
        String word = input.nextLine();

      //calling the method and displaying the result 
        int res = countOccurrences(str, word);
        System.out.println("Substring occurs " + res + " times");

        input.close();
    }
}
