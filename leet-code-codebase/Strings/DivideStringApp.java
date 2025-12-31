import java.util.*;

public class DivideStringApp{

    // Method to divide string into parts of size k
    public static String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();

        // If length is not divisible by k, add fill characters
        if (s.length() % k != 0) {
            int d = s.length() % k;
            int c = k - d;
            String p = "";
            for (int i = 0; i < c; i++) {
                p += fill;
            }
            s += p;
        }

        // Split string into substrings of length k
        for (int i = 0; i < s.length(); i += k) {
            list.add(s.substring(i, i + k));
        }

        // Convert list to array
        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter string: ");
        String s = input.nextLine();

      
        System.out.print("Enter k: ");
        int k = input.nextInt();

        // take fill character
        System.out.print("Enter fill character: ");
        char fill = input.next().charAt(0);

        // call method
        String[] result = divideString(s, k, fill);

        // Print result
        System.out.println("Divided Strings:");
        for (String part : result) {
            System.out.println(part);
        }
    }
}
