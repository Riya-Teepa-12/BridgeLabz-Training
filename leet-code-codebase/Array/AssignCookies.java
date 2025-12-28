import java.util.*;

public class AssignCookies {

    // Method to find content children
    public int findContentChildren(int[] g, int[] s) {

        // Sort greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        int n = g.length, m = s.length;

        // Two-pointer approach
        while (i < n && j < m) {
            // If cookie can satisfy child
            if (s[j] >= g[i]) {
                i++;   
            }
            j++;       
        }

        
        return i;
    }

    // Main method to take input and display output
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         AssignCookies  obj = new AssignCookies();

        // Input greed factor array
        System.out.print("Enter number of children: ");
        int n = input.nextInt();
        int[] g = new int[n];

        System.out.println("Enter greed factors:");
        for (int i = 0; i < n; i++) {
            g[i] = input.nextInt();
        }

        // Input cookie sizes array
        System.out.print("Enter number of cookies: ");
        int m = input.nextInt();
        int[] s = new int[m];

        System.out.println("Enter cookie sizes:");
        for (int i = 0; i < m; i++) {
            s[i] = input.nextInt();
        }

        // Call method and print result
        int result = obj.findContentChildren(g, s);
        System.out.println("Maximum number of content children: " + result);

        input.close();
    }
}
