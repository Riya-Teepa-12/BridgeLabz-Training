import java.util.Scanner;

class ReconstructDigits {

    // Method to reconstruct original digits from scrambled string
    public String originalDigits(String s) {
        int[] count = new int[26]; // Count of each character (a-z)

        // Count frequency of each character in input
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int[] digits = new int[10]; // Count of digits 0-9

        // Unique letters for certain numbers
        digits[0] = count['z' - 'a']; // zero
        digits[2] = count['w' - 'a']; // two
        digits[4] = count['u' - 'a']; // four
        digits[6] = count['x' - 'a']; // six
        digits[8] = count['g' - 'a']; // eight

        // Remaining numbers after deduction
        digits[3] = count['h' - 'a'] - digits[8];               
        digits[5] = count['f' - 'a'] - digits[4];                 
        digits[7] = count['s' - 'a'] - digits[6];               
        digits[1] = count['o' - 'a'] - digits[0] - digits[2] - digits[4]; 
        digits[9] = count['i' - 'a'] - digits[5] - digits[6] - digits[8]; 

        // Build result in sorted order
        StringBuilder ans = new StringBuilder();
        for (int d = 0; d <= 9; d++) {
            for (int i = 0; i < digits[d]; i++) {
                ans.append(d);
            }
        }

        return ans.toString();
    }

    // method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the scrambled string: ");
        String input = sc.nextLine();

        ReconstructDigits obj = new ReconstructDigits();
        String result = obj.originalDigits(input);

        // Print output
        System.out.println("Original digits: " + result);

        sc.close();
    }
}
